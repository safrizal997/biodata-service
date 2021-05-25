package com.rzlproject.biodataservice.service.impl;

import com.rzlproject.biodataservice.entity.Biodata;
import com.rzlproject.biodataservice.model.BiodataRequest;
import com.rzlproject.biodataservice.repository.BiodataRepository;
import com.rzlproject.biodataservice.service.BiodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BiodataServiceImpl implements BiodataService {

    @Autowired
    BiodataRepository biodataRepository;


    @Override
    public List<Biodata> getAllBiodata() {
        return biodataRepository.findAll();
    }

    @Override
    public Biodata getBiodataById(Long id) {
        return biodataRepository.findById(id).orElse(null);


    }

    @Override
    public Biodata insertNewBiodata(BiodataRequest biodataRequest) {

        Biodata biodata = new Biodata();

        biodata.setCreateBy(biodataRequest.getCreateBy());
        biodata.setCreateOn(new Date());
        biodata.setModifiedBy(biodataRequest.getModifiedBy());
        if (biodataRequest.getModifiedBy() == null){
            biodata.setModifiedOn(null);
        }else{
            biodata.setModifiedOn(new Date());
        }
        biodata.setDeleteBy(biodataRequest.getDeleteBy());
        if (biodataRequest.getDeleteBy() == null){
            biodata.setDeleteOn(null);
        }else{
            biodata.setDeleteOn(new Date());
        }
        biodata.setDelete(false);
        biodata.setFullname(biodataRequest.getFullname());
        biodata.setNickName(biodataRequest.getNickName());
        biodata.setPob(biodataRequest.getPob());
        biodata.setDob(new Date());
        if (biodataRequest.getGender()==0){
            biodata.setGender(false);
        }else{
            biodata.setGender(true);
        }
        biodata.setRegionId(biodataRequest.getRegionId());
        biodata.setHigh(biodataRequest.getHigh());
        biodata.setWeight(biodata.getWeight());
        biodata.setNationality(biodataRequest.getNationality());
        biodata.setEthnic(biodataRequest.getEthnic());
        biodata.setHobby(biodataRequest.getHobby());
        biodata.setIdentityTypeId(biodataRequest.getIdentityTypeId());
        biodata.setIdentityNo(biodataRequest.getIdentityNo());
        biodata.setEmail(biodataRequest.getEmail());
        biodata.setPhoneNumber1(biodataRequest.getPhoneNumber1());
        biodata.setPhoneNumber2(biodataRequest.getPhoneNumber2());
        biodata.setParentPhoneNumber(biodataRequest.getParentPhoneNumber());
        biodata.setChildSequence(biodataRequest.getChildSequence());
        biodata.setHowManyBrothers(biodataRequest.getHowManyBrothers());
        biodata.setMaritalStatusId(biodataRequest.getMaritalStatusId());
        biodata.setAddrBookId(biodataRequest.getAddrBookId());
        biodata.setToken(biodataRequest.getToken());
        biodata.setMarriageYear(biodataRequest.getMarriageYear());
        biodata.setCompanyId(biodataRequest.getCompanyId());
        biodata.setProcess(false);
        biodata.setComplete(true);

        return biodataRepository.save(biodata);
    }

    @Override
    public Biodata updateBiodata(Long id, BiodataRequest biodataRequest) {
        return null;
    }

    @Override
    public String deleteBiodataById(Long id) {
        return null;
    }
}
