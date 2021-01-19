package com.agentu_api.controller;

import com.agentu_api.bo.Agent;
import com.agentu_api.bo.Etudiant;
import com.agentu_api.service.AgentService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/agents")
public class AgentController {

    private final AgentService agentService;

    AgentController(AgentService agentService){
        this.agentService = agentService;
    }

    @GetMapping(value="/")
    Iterable<Agent> getAllAgents(){
        return agentService.getAllAgents();
    }

    @GetMapping(value="/{id}")
    Agent getAgent(@PathVariable String id){
        return agentService.getAgent(id);
    }


    @PostMapping(value = "/",consumes = "application/json")
    Agent addAgent(@RequestBody Agent agent){
        return agentService.createAgent(agent);
    }

    @DeleteMapping("/delete/{id}")
    void deleteAgent(@PathVariable String id){
        agentService.deleteAgent(id);
    }

    @PutMapping("/")
    void modifierAgent(@RequestBody Agent agent){
        this.agentService.updateAgent(agent);
    }
}

