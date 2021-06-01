package com.rzlproject.biodataservice.controller;

import com.rzlproject.biodataservice.entity.Biodata;
import com.rzlproject.biodataservice.model.BiodataRequest;
import com.rzlproject.biodataservice.service.BiodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/biodata", produces = MediaType.APPLICATION_JSON_VALUE)
public class BiodataController {

    @Autowired
    BiodataService biodataService;

    @GetMapping
    public List<Biodata> getAllBiodata(){
        return biodataService.getAllBiodata();
    }

    @GetMapping(path = "/filter")
    public Biodata getBiodataById(@RequestParam("biodataId") Long id){
        return biodataService.getBiodataById(id);
    }

    @PostMapping
    public Biodata insertNewBiodata(@RequestBody BiodataRequest biodataRequest){
        return biodataService.insertNewBiodata(biodataRequest);
    }

    @PutMapping(path = "/{id}")
    public Biodata updateBiodata(@PathVariable("id") Long id,@RequestBody BiodataRequest biodataRequest){
        return biodataService.updateBiodata(id, biodataRequest);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBiodata(@PathVariable("id") Long id){
        biodataService.deleteBiodataById(id);
    }
}
