package pl.wolniarskim.crm_app.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wolniarskim.crm_app.model.Lead;
import pl.wolniarskim.crm_app.model.dto.read.LeadReadModel;
import pl.wolniarskim.crm_app.model.dto.write.LeadWriteModel;
import pl.wolniarskim.crm_app.service.LeadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/leads")
public class LeadController {

    LeadService service;

    public LeadController(LeadService service){
        this.service = service;
    }

    @GetMapping("/findById")
    public LeadReadModel findById(@Param("id") long id){
        return service.getById(id);
    }

    @PostMapping("/create")
    public LeadReadModel create(@RequestBody LeadWriteModel writeModel){
        return service.create(writeModel);
    }

    @GetMapping("/findAll")
    public List<LeadReadModel> findAll(){
        return service.getAll();
    }

    @GetMapping("/deleteById/{id}")
    public ResponseEntity deleteById(@PathVariable long id){
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
