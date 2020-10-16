// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileDetailResponse extends TeaModel {
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
    public GetProfileDetailResponseData data;

    public static GetProfileDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProfileDetailResponse self = new GetProfileDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProfileDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProfileDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProfileDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProfileDetailResponse setData(GetProfileDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetProfileDetailResponseData getData() {
        return this.data;
    }

    public static class GetProfileDetailResponseData extends TeaModel {
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

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        public static GetProfileDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetProfileDetailResponseData self = new GetProfileDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetProfileDetailResponseData setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
            return this;
        }
        public String getLiveAddress() {
            return this.liveAddress;
        }

        public GetProfileDetailResponseData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public GetProfileDetailResponseData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetProfileDetailResponseData setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetProfileDetailResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetProfileDetailResponseData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetProfileDetailResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetProfileDetailResponseData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetProfileDetailResponseData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public GetProfileDetailResponseData setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public GetProfileDetailResponseData setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public GetProfileDetailResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProfileDetailResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

}
