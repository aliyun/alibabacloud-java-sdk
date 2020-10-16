// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetUserDetailResponse extends TeaModel {
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
    public GetUserDetailResponseData data;

    public static GetUserDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailResponse self = new GetUserDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDetailResponse setData(GetUserDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetUserDetailResponseData getData() {
        return this.data;
    }

    public static class GetUserDetailResponseData extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

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

        @NameInMap("PhoneNo")
        @Validation(required = true)
        public String phoneNo;

        @NameInMap("PlateNo")
        @Validation(required = true)
        public String plateNo;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Integer userGroupId;

        @NameInMap("UserId")
        @Validation(required = true)
        public Integer userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        public static GetUserDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetUserDetailResponseData self = new GetUserDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetUserDetailResponseData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetUserDetailResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetUserDetailResponseData setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }
        public String getAttachment() {
            return this.attachment;
        }

        public GetUserDetailResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetUserDetailResponseData setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public GetUserDetailResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetUserDetailResponseData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetUserDetailResponseData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetUserDetailResponseData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public GetUserDetailResponseData setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        public GetUserDetailResponseData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public GetUserDetailResponseData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetUserDetailResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

    }

}
