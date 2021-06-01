package com.rzlproject.biodataservice.service;

import com.rzlproject.biodataservice.entity.Biodata;
import com.rzlproject.biodataservice.model.BiodataRequest;

import java.util.List;

public interface BiodataService {

    List<Biodata> getAllBiodata();

    Biodata getBiodataById(Long id);

    Biodata insertNewBiodata(BiodataRequest biodataRequest);

    Biodata updateBiodata(Long id, BiodataRequest biodataRequest);

    void deleteBiodataById(Long id);


}
