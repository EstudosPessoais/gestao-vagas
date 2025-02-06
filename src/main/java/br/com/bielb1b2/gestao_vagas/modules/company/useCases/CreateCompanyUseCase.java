package br.com.bielb1b2.gestao_vagas.modules.company.useCases;

import br.com.bielb1b2.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.bielb1b2.gestao_vagas.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    private void execute(CompanyEntity companyEntity) {

    }
}
