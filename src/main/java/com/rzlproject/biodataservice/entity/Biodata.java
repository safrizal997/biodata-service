package com.rzlproject.biodataservice.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "biodata_tbl")
public class Biodata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private Long id;

    @Column(name = "create_by", nullable = false, length = 11)
    private Long createBy;

    @Column(name = "create_on", nullable = false)
    private Date createOn;

    @Column(name = "modified_by", length = 11)
    private Long modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;

    @Column(name = "delete_by", length = 11)
    private Long deleteBy;

    @Column(name = "delete_on")
    private Date deleteOn;

    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "nick_name", nullable = false, length = 100)
    private String nickName;

    @Column(name = "pob", nullable = false, length = 100)
    private String pob;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "gender", nullable = false)
    private Boolean gender;

    @Column(name = "region_id", nullable = false, length = 11)
    private Long regionId;

    @Column(name = "high")
    private Integer high;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "nationality", length = 100)
    private String nationality;

    @Column(name = "ethnic", length = 50)
    private String ethnic;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "identity_type_id", nullable = false, length = 11)
    private Long identityTypeId;

    @Column(name = "identity_no", nullable = false, length = 50)
    private String identityNo;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "phone_number1", nullable = false, length = 50)
    private String phoneNumber1;

    @Column(name = "phone_number2", length = 50)
    private String phoneNumber2;

    @Column(name = "parent_phone_number", nullable = false, length = 50)
    private String parentPhoneNumber;

    @Column(name = "child_sequence", length = 5)
    private String childSequence;

    @Column(name = "how_many_brothers", length = 5)
    private String howManyBrothers;

    @Column(name = "marital_status_id", nullable = false, length = 11)
    private Long maritalStatusId;

    @Column(name = "addr_Book_id", length = 11)
    private Long addrBookId;

    @Column(name = "token", length = 10)
    private String token;

    @Column(name = "expiret_token")
    private Date expiretToken;

    @Column(name = "marriage_year", length = 10)
    private String marriageYear;

    @Column(name = "company_id", nullable = false, length = 11)
    private Long companyId;

    @Column(name = "is_process")
    private Boolean isProcess;

    @Column(name = "is_complete")
    private Boolean isComplete;


    public Biodata() {
    }

    public Biodata(Long createBy, Date createOn, Long modifiedBy, Date modifiedOn, Long deleteBy, Date deleteOn, Boolean isDelete, String fullname, String nickName, String pob, Date dob, Boolean gender, Long regionId, Integer high, Integer weight, String nationality, String ethnic, String hobby, Long identityTypeId, String identityNo, String email, String phoneNumber1, String phoneNumber2, String parentPhoneNumber, String childSequence, String howManyBrothers, Long maritalStatusId, Long addrBookId, String token, Date expiretToken, String marriageYear, Long companyId, Boolean isProcess, Boolean isComplete) {
        this.createBy = createBy;
        this.createOn = createOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.deleteBy = deleteBy;
        this.deleteOn = deleteOn;
        this.isDelete = isDelete;
        this.fullname = fullname;
        this.nickName = nickName;
        this.pob = pob;
        this.dob = dob;
        this.gender = gender;
        this.regionId = regionId;
        this.high = high;
        this.weight = weight;
        this.nationality = nationality;
        this.ethnic = ethnic;
        this.hobby = hobby;
        this.identityTypeId = identityTypeId;
        this.identityNo = identityNo;
        this.email = email;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.parentPhoneNumber = parentPhoneNumber;
        this.childSequence = childSequence;
        this.howManyBrothers = howManyBrothers;
        this.maritalStatusId = maritalStatusId;
        this.addrBookId = addrBookId;
        this.token = token;
        this.expiretToken = expiretToken;
        this.marriageYear = marriageYear;
        this.companyId = companyId;
        this.isProcess = isProcess;
        this.isComplete = isComplete;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Long getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(Long deleteBy) {
        this.deleteBy = deleteBy;
    }

    public Date getDeleteOn() {
        return deleteOn;
    }

    public void setDeleteOn(Date deleteOn) {
        this.deleteOn = deleteOn;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Long getIdentityTypeId() {
        return identityTypeId;
    }

    public void setIdentityTypeId(Long identityTypeId) {
        this.identityTypeId = identityTypeId;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getChildSequence() {
        return childSequence;
    }

    public void setChildSequence(String childSequence) {
        this.childSequence = childSequence;
    }

    public String getHowManyBrothers() {
        return howManyBrothers;
    }

    public void setHowManyBrothers(String howManyBrothers) {
        this.howManyBrothers = howManyBrothers;
    }

    public Long getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(Long maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public Long getAddrBookId() {
        return addrBookId;
    }

    public void setAddrBookId(Long addrBookId) {
        this.addrBookId = addrBookId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiretToken() {
        return expiretToken;
    }

    public void setExpiretToken(Date expiretToken) {
        this.expiretToken = expiretToken;
    }

    public String getMarriageYear() {
        return marriageYear;
    }

    public void setMarriageYear(String marriageYear) {
        this.marriageYear = marriageYear;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Boolean getProcess() {
        return isProcess;
    }

    public void setProcess(Boolean process) {
        isProcess = process;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
