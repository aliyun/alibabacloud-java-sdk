// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetProfileDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetProfileDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProfileDetailResponseBody self = new GetProfileDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProfileDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProfileDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProfileDetailResponseBody setData(GetProfileDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProfileDetailResponseBodyData getData() {
        return this.data;
    }

    public GetProfileDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetProfileDetailResponseBodyData extends TeaModel {
        @NameInMap("CatalogId")
        public Integer catalogId;

        @NameInMap("ProfileId")
        public Integer profileId;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("SceneType")
        public String sceneType;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("LiveAddress")
        public String liveAddress;

        @NameInMap("Name")
        public String name;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PlateNo")
        public String plateNo;

        public static GetProfileDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProfileDetailResponseBodyData self = new GetProfileDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProfileDetailResponseBodyData setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public GetProfileDetailResponseBodyData setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public GetProfileDetailResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetProfileDetailResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetProfileDetailResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetProfileDetailResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetProfileDetailResponseBodyData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public GetProfileDetailResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetProfileDetailResponseBodyData setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetProfileDetailResponseBodyData setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
            return this;
        }
        public String getLiveAddress() {
            return this.liveAddress;
        }

        public GetProfileDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProfileDetailResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetProfileDetailResponseBodyData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

    }

}
