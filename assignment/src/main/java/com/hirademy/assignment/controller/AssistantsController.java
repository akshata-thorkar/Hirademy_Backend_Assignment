package com.hirademy.assignment.controller;

import com.hirademy.assignment.entity.Assistants;
import com.hirademy.assignment.controller.ResourceNotFoundException;
import com.hirademy.assignment.repository.AssistantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assistant")
public class AssistantsController {

    @Autowired
    private AssistantsRepository assistantsRepository;

    @PostMapping
    public Assistants createAssistants(@RequestBody Assistants assistants){
        return assistantsRepository.save(assistants);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assistants> getAssistantsById(@PathVariable(value= "id") Long id){
        Assistants assistants= assistantsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assistant not found with id: " + id));
        return ResponseEntity.ok().body(assistants);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Assistants> updateAssistants(@PathVariable(value = "id") Long id,
                                                        @RequestBody Assistants assistantsDetails) {
        Assistants assistants = assistantsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assistant not found with id: " + id));

        assistants.setName(assistantsDetails.getName());
        assistants.setMobile(assistantsDetails.getMobile());
        assistants.setEmail(assistantsDetails.getEmail());
        assistants.setSalary(assistantsDetails.getSalary());
        assistants.setCity(assistantsDetails.getCity());
        assistants.setCountry(assistantsDetails.getCountry());
        assistants.setDepartment(assistantsDetails.getDepartment());
        assistants.setRole(assistantsDetails.getRole());

        final Assistants updatedAssistants = assistantsRepository.save(assistants);
        return ResponseEntity.ok(updatedAssistants);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAssistants(@PathVariable(value = "id") Long id) {
        Assistants assistants = assistantsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Assistant not found with id: " + id));

        assistantsRepository.delete(assistants);
        return ResponseEntity.ok().build();
    }
}
