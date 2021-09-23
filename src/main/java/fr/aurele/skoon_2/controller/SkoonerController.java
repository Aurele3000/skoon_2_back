package fr.aurele.skoon_2.controller;

import java.util.List;
import java.util.Optional;

import fr.aurele.skoon_2.model.Skooner;
import fr.aurele.skoon_2.service.SkoonerService;
import fr.aurele.skoon_2.service.SkoonerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/skooner")
public class SkoonerController {

    @Autowired
    SkoonerServiceImpl service;


    @CrossOrigin
    @GetMapping("/skooners")
    public ResponseEntity<List<Skooner>> getAllSkooner() {
        List<Skooner> listSkooner;
        try {
            listSkooner = service.findAll();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(listSkooner);

    }

    @CrossOrigin
    @GetMapping("/skooners/{id}")
    ResponseEntity<Skooner> getSkoonerById(@PathVariable(value = "id") Integer id) {
        Optional<Skooner> skooner = service.findById(id);
        if (skooner.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(skooner.get());
    }

    @CrossOrigin
    @PostMapping("/skooners")
    ResponseEntity<Skooner> addSkooner(@RequestBody Skooner skooner) {
        return ResponseEntity.ok().body(service.insert(skooner));
    }

    @CrossOrigin
    @PutMapping("/skooners/{id}")
    ResponseEntity<Skooner> updateSkooner(@PathVariable(value = "id") Integer id, @RequestBody Skooner skooner) {
        Skooner updatedSkooner = service.update(id, skooner);
        if (updatedSkooner == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().body(updatedSkooner);
    }

    @CrossOrigin
    @DeleteMapping("/skooners/{id}")
    ResponseEntity<Skooner> deleteSkooner(@PathVariable(value = "id") Integer id) {
        Optional<Skooner> skooner = service.findById(id);
        if (skooner.isEmpty())
            return ResponseEntity.notFound().build();
        service.delete(skooner.get().getId());
        return ResponseEntity.accepted().build();
    }
}
