// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetProfileDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetProfileDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProfileDetailResponseBody self = new GetProfileDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProfileDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProfileDetailResponseBody setData(GetProfileDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProfileDetailResponseBodyData getData() {
        return this.data;
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

    public static class GetProfileDetailResponseBodyData extends TeaModel {
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

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("ProfileId")
        public Integer profileId;

        @NameInMap("SceneType")
        public String sceneType;

        public static GetProfileDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProfileDetailResponseBodyData self = new GetProfileDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProfileDetailResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetProfileDetailResponseBodyData setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public GetProfileDetailResponseBodyData setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetProfileDetailResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetProfileDetailResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetProfileDetailResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
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

        public GetProfileDetailResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetProfileDetailResponseBodyData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public GetProfileDetailResponseBodyData setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public GetProfileDetailResponseBodyData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

    }

}
