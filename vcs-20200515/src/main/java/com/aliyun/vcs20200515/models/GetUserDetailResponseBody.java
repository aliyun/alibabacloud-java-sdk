// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetUserDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetUserDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetUserDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailResponseBody self = new GetUserDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDetailResponseBody setData(GetUserDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserDetailResponseBodyData getData() {
        return this.data;
    }

    public GetUserDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetUserDetailResponseBodyData extends TeaModel {
        @NameInMap("Gender")
        public String gender;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("UserGroupId")
        public Integer userGroupId;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Attachment")
        public String attachment;

        @NameInMap("Age")
        public String age;

        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("Address")
        public String address;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("PlateNo")
        public String plateNo;

        public static GetUserDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserDetailResponseBodyData self = new GetUserDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserDetailResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetUserDetailResponseBodyData setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public GetUserDetailResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetUserDetailResponseBodyData setUserGroupId(Integer userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Integer getUserGroupId() {
            return this.userGroupId;
        }

        public GetUserDetailResponseBodyData setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public GetUserDetailResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetUserDetailResponseBodyData setAttachment(String attachment) {
            this.attachment = attachment;
            return this;
        }
        public String getAttachment() {
            return this.attachment;
        }

        public GetUserDetailResponseBodyData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetUserDetailResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetUserDetailResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetUserDetailResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetUserDetailResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetUserDetailResponseBodyData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

    }

}
