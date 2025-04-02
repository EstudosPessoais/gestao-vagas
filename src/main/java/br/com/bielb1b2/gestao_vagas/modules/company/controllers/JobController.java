package br.com.bielb1b2.gestao_vagas.modules.company.controllers;

import br.com.bielb1b2.gestao_vagas.modules.company.dto.CreateJobDTO;
import br.com.bielb1b2.gestao_vagas.modules.company.entities.JobEntity;
import br.com.bielb1b2.gestao_vagas.modules.company.useCases.CreateJobUseCase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobUseCase createJobUseCase;

    @RequestMapping("")
    public ResponseEntity<JobEntity> create(@Valid @RequestBody CreateJobDTO createJobDTO, HttpServletRequest request) {
        var companyId = request.getAttribute("company_id");

        var jobEntity = JobEntity.builder()
                .benefits(createJobDTO.getBenefits())
                .description(createJobDTO.getDescription())
                .level(createJobDTO.getLevel())
                .companyId(UUID.fromString(companyId.toString()))
                .build();


        var result = this.createJobUseCase.execute(jobEntity);

        return ResponseEntity.ok().body(result);
    }
}
