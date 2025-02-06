package br.com.bielb1b2.gestao_vagas.modules.company.repositories;

import br.com.bielb1b2.gestao_vagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> { }
