// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddProfileResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProfileResponseBody self = new AddProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddProfileResponseBody setData(AddProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddProfileResponseBodyData getData() {
        return this.data;
    }

    public AddProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddProfileResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CatalogId")
        public Integer catalogId;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("LiveAddress")
        public String liveAddress;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("ProfileId")
        public Integer profileId;

        @NameInMap("SceneType")
        public String sceneType;

        public static AddProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddProfileResponseBodyData self = new AddProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddProfileResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public AddProfileResponseBodyData setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public AddProfileResponseBodyData setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public AddProfileResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public AddProfileResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public AddProfileResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public AddProfileResponseBodyData setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
            return this;
        }
        public String getLiveAddress() {
            return this.liveAddress;
        }

        public AddProfileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddProfileResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public AddProfileResponseBodyData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public AddProfileResponseBodyData setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public AddProfileResponseBodyData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

    }

}
