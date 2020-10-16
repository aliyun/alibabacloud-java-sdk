// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileListResponse extends TeaModel {
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
    public GetProfileListResponseData data;

    public static GetProfileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProfileListResponse self = new GetProfileListResponse();
        return TeaModel.build(map, self);
    }

    public GetProfileListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProfileListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProfileListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProfileListResponse setData(GetProfileListResponseData data) {
        this.data = data;
        return this;
    }
    public GetProfileListResponseData getData() {
        return this.data;
    }

    public static class GetProfileListResponseDataRecords extends TeaModel {
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

        @NameInMap("SearchMatchingRate")
        @Validation(required = true)
        public String searchMatchingRate;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("CatalogId")
        @Validation(required = true)
        public Integer catalogId;

        @NameInMap("ProfileId")
        @Validation(required = true)
        public Integer profileId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetProfileListResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetProfileListResponseDataRecords self = new GetProfileListResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public GetProfileListResponseDataRecords setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public GetProfileListResponseDataRecords setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetProfileListResponseDataRecords setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetProfileListResponseDataRecords setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetProfileListResponseDataRecords setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public GetProfileListResponseDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public GetProfileListResponseDataRecords setSearchMatchingRate(String searchMatchingRate) {
            this.searchMatchingRate = searchMatchingRate;
            return this;
        }
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

        public GetProfileListResponseDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetProfileListResponseDataRecords setCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Integer getCatalogId() {
            return this.catalogId;
        }

        public GetProfileListResponseDataRecords setProfileId(Integer profileId) {
            this.profileId = profileId;
            return this;
        }
        public Integer getProfileId() {
            return this.profileId;
        }

        public GetProfileListResponseDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetProfileListResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetProfileListResponseDataRecords> records;

        public static GetProfileListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetProfileListResponseData self = new GetProfileListResponseData();
            return TeaModel.build(map, self);
        }

        public GetProfileListResponseData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetProfileListResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetProfileListResponseData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetProfileListResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetProfileListResponseData setRecords(java.util.List<GetProfileListResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetProfileListResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
