// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetProfileListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetProfileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProfileListResponseBody self = new GetProfileListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProfileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProfileListResponseBody setData(GetProfileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProfileListResponseBodyData getData() {
        return this.data;
    }

    public GetProfileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProfileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProfileListResponseBodyDataRecords extends TeaModel {
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

        @NameInMap("Name")
        public String name;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("ProfileId")
        public Integer profileId;

        @NameInMap("SceneType")
        public String sceneType;

        @NameInMap("SearchMatchingRate")
        public String searchMatchingRate;

        public static GetProfileListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetProfileListResponseBodyDataRecords self = new GetProfileListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetProfileListResponseBodyDataRecords setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetProfileListResponseBodyDataRecords setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public GetProfileListResponseBodyDataRecords setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetProfileListResponseBodyDataRecords setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetProfileListResponseBodyDataRecords setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetProfileListResponseBodyDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetProfileListResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProfileListResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetProfileListResponseBodyDataRecords setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public GetProfileListResponseBodyDataRecords setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public GetProfileListResponseBodyDataRecords setSearchMatchingRate(String searchMatchingRate) {
            this.searchMatchingRate = searchMatchingRate;
            return this;
        }
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

    }

    public static class GetProfileListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<GetProfileListResponseBodyDataRecords> records;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Total")
        public Long total;

        public static GetProfileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProfileListResponseBodyData self = new GetProfileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProfileListResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetProfileListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetProfileListResponseBodyData setRecords(java.util.List<GetProfileListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetProfileListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetProfileListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetProfileListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
