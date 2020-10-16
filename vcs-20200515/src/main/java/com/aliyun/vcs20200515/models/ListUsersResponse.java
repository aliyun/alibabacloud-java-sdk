// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUsersResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListUsersResponseData data;

    public static ListUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponse self = new ListUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponse setData(ListUsersResponseData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseData getData() {
        return this.data;
    }

    public static class ListUsersResponseDataRecords extends TeaModel {
        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Integer userGroupId;

        @NameInMap("Age")
        @Validation(required = true)
        public String age;

        @NameInMap("Attachment")
        @Validation(required = true)
        public String attachment;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("FaceImageUrl")
        @Validation(required = true)
        public String faceImageUrl;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("IdNumber")
        @Validation(required = true)
        public String idNumber;

        @NameInMap("UserId")
        @Validation(required = true)
        public Integer userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("MatchingRate")
        @Validation(required = true)
        public String matchingRate;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        public static ListUsersResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseDataRecords self = new ListUsersResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseDataRecords setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        public ListUsersResponseDataRecords setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ListUsersResponseDataRecords setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }
        public String getAttachment() {
            return this.attachment;
        }

        public ListUsersResponseDataRecords setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUsersResponseDataRecords setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public ListUsersResponseDataRecords setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListUsersResponseDataRecords setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public ListUsersResponseDataRecords setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public ListUsersResponseDataRecords setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUsersResponseDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListUsersResponseDataRecords setMatchingRate(String matchingRate) {
            this.matchingRate = matchingRate;
            return this;
        }
        public String getMatchingRate() {
            return this.matchingRate;
        }

        public ListUsersResponseDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

    public static class ListUsersResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("Success")
        @Validation(required = true)
        public Long success;

        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListUsersResponseDataRecords> records;

        public static ListUsersResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseData self = new ListUsersResponseData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListUsersResponseData setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListUsersResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListUsersResponseData setRecords(java.util.List<ListUsersResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListUsersResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
