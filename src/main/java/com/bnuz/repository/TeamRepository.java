package com.bnuz.repository;

import com.bnuz.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {

}