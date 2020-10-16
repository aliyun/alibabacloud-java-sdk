// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateUserResponse extends TeaModel {
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
    public CreateUserResponseData data;

    public static CreateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponse self = new CreateUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserResponse setData(CreateUserResponseData data) {
        this.data = data;
        return this;
    }
    public CreateUserResponseData getData() {
        return this.data;
    }

    public static class CreateUserResponseData extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public Integer userId;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Integer userGroupId;

        @NameInMap("IdNumber")
        @Validation(required = true)
        public String idNumber;

        @NameInMap("FaceImageUrl")
        @Validation(required = true)
        public String faceImageUrl;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Age")
        @Validation(required = true)
        public String age;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("PlateNo")
        @Validation(required = true)
        public String plateNo;

        @NameInMap("PhoneNo")
        @Validation(required = true)
        public String phoneNo;

        @NameInMap("Attachment")
        @Validation(required = true)
        public String attachment;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        public static CreateUserResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseData self = new CreateUserResponseData();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public CreateUserResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public CreateUserResponseData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateUserResponseData setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        public CreateUserResponseData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public CreateUserResponseData setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public CreateUserResponseData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateUserResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public CreateUserResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public CreateUserResponseData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public CreateUserResponseData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public CreateUserResponseData setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }
        public String getAttachment() {
            return this.attachment;
        }

        public CreateUserResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
