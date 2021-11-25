// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUsersResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setData(ListUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUsersResponseBodyData getData() {
        return this.data;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersResponseBodyDataRecords extends TeaModel {
        @NameInMap("Age")
        public String age;

        @NameInMap("Attachment")
        public String attachment;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("MatchingRate")
        public String matchingRate;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("UserGroupId")
        public Integer userGroupId;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("UserName")
        public String userName;

        public static ListUsersResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyDataRecords self = new ListUsersResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyDataRecords setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ListUsersResponseBodyDataRecords setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }
        public String getAttachment() {
            return this.attachment;
        }

        public ListUsersResponseBodyDataRecords setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUsersResponseBodyDataRecords setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public ListUsersResponseBodyDataRecords setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListUsersResponseBodyDataRecords setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public ListUsersResponseBodyDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListUsersResponseBodyDataRecords setMatchingRate(String matchingRate) {
            this.matchingRate = matchingRate;
            return this;
        }
        public String getMatchingRate() {
            return this.matchingRate;
        }

        public ListUsersResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListUsersResponseBodyDataRecords setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        public ListUsersResponseBodyDataRecords setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyDataRecords setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListUsersResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<ListUsersResponseBodyDataRecords> records;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListUsersResponseBodyData setRecords(java.util.List<ListUsersResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListUsersResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListUsersResponseBodyData setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListUsersResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
