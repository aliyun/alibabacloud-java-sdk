// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileResponse extends TeaModel {
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
    public AddProfileResponseData data;

    public static AddProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProfileResponse self = new AddProfileResponse();
        return TeaModel.build(map, self);
    }

    public AddProfileResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProfileResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProfileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddProfileResponse setData(AddProfileResponseData data) {
        this.data = data;
        return this;
    }
    public AddProfileResponseData getData() {
        return this.data;
    }

    public static class AddProfileResponseData extends TeaModel {
        @NameInMap("LiveAddress")
        @Validation(required = true)
        public String liveAddress;

        @NameInMap("SceneType")
        @Validation(required = true)
        public String sceneType;

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        @NameInMap("FaceUrl")
        @Validation(required = true)
        public String faceUrl;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("IdNumber")
        @Validation(required = true)
        public String idNumber;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("PhoneNo")
        @Validation(required = true)
        public String phoneNo;

        @NameInMap("PlateNo")
        @Validation(required = true)
        public String plateNo;

        @NameInMap("CatalogId")
        @Validation(required = true)
        public Integer catalogId;

        @NameInMap("ProfileId")
        @Validation(required = true)
        public Integer profileId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static AddProfileResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddProfileResponseData self = new AddProfileResponseData();
            return TeaModel.build(map, self);
        }

        public AddProfileResponseData setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
            return this;
        }
        public String getLiveAddress() {
            return this.liveAddress;
        }

        public AddProfileResponseData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public AddProfileResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public AddProfileResponseData setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public AddProfileResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public AddProfileResponseData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public AddProfileResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public AddProfileResponseData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public AddProfileResponseData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public AddProfileResponseData setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public AddProfileResponseData setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public AddProfileResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
