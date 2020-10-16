// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserGroupId")
    public Long userGroupId;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("FaceImageUrl")
    public String faceImageUrl;

    @NameInMap("Address")
    public String address;

    @NameInMap("Age")
    public Integer age;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("PlateNo")
    public String plateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("Attachment")
    public String attachment;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("PersonList")
    public java.util.Map<String, ?> personList;

    @NameInMap("UserList")
    public java.util.Map<String, ?> userList;

    @NameInMap("MatchingRateThreshold")
    public String matchingRateThreshold;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListUsersRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public ListUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ListUsersRequest setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public ListUsersRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ListUsersRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public ListUsersRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListUsersRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public ListUsersRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public ListUsersRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public ListUsersRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public ListUsersRequest setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    public String getAttachment() {
        return this.attachment;
    }

    public ListUsersRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUsersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setPersonList(java.util.Map<String, ?> personList) {
        this.personList = personList;
        return this;
    }
    public java.util.Map<String, ?> getPersonList() {
        return this.personList;
    }

    public ListUsersRequest setUserList(java.util.Map<String, ?> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.Map<String, ?> getUserList() {
        return this.userList;
    }

    public ListUsersRequest setMatchingRateThreshold(String matchingRateThreshold) {
        this.matchingRateThreshold = matchingRateThreshold;
        return this;
    }
    public String getMatchingRateThreshold() {
        return this.matchingRateThreshold;
    }

}
