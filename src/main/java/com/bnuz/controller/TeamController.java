package com.bnuz.controller;

import com.bnuz.entity.TeamEntity;
import com.bnuz.repository.TeamRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @ApiOperation(value = "获取队伍列表信息")
    @GetMapping(value = "/getTeam")
    public List<TeamEntity> getTeam() {
        return teamRepository.findAll();
    }
}