// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListResponse extends TeaModel {
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
    public GetPersonListResponseData data;

    public static GetPersonListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListResponse self = new GetPersonListResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPersonListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPersonListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPersonListResponse setData(GetPersonListResponseData data) {
        this.data = data;
        return this;
    }
    public GetPersonListResponseData getData() {
        return this.data;
    }

    public static class GetPersonListResponseDataRecordsPropertyTagList extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("TagCodeName")
        @Validation(required = true)
        public String tagCodeName;

        @NameInMap("TagName")
        @Validation(required = true)
        public String tagName;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetPersonListResponseDataRecordsPropertyTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseDataRecordsPropertyTagList self = new GetPersonListResponseDataRecordsPropertyTagList();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseDataRecordsPropertyTagList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPersonListResponseDataRecordsPropertyTagList setTagCodeName(String tagCodeName) {
            this.tagCodeName = tagCodeName;
            return this;
        }
        public String getTagCodeName() {
            return this.tagCodeName;
        }

        public GetPersonListResponseDataRecordsPropertyTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetPersonListResponseDataRecordsPropertyTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPersonListResponseDataRecords extends TeaModel {
        @NameInMap("FaceUrl")
        @Validation(required = true)
        public String faceUrl;

        @NameInMap("FirstShotTime")
        @Validation(required = true)
        public Long firstShotTime;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("SearchMatchingRate")
        @Validation(required = true)
        public String searchMatchingRate;

        @NameInMap("LastShotTime")
        @Validation(required = true)
        public Long lastShotTime;

        @NameInMap("PropertyTagList")
        @Validation(required = true)
        public java.util.List<GetPersonListResponseDataRecordsPropertyTagList> propertyTagList;

        public static GetPersonListResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseDataRecords self = new GetPersonListResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseDataRecords setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetPersonListResponseDataRecords setFirstShotTime(Long firstShotTime) {
            this.firstShotTime = firstShotTime;
            return this;
        }
        public Long getFirstShotTime() {
            return this.firstShotTime;
        }

        public GetPersonListResponseDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetPersonListResponseDataRecords setSearchMatchingRate(String searchMatchingRate) {
            this.searchMatchingRate = searchMatchingRate;
            return this;
        }
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

        public GetPersonListResponseDataRecords setLastShotTime(Long lastShotTime) {
            this.lastShotTime = lastShotTime;
            return this;
        }
        public Long getLastShotTime() {
            return this.lastShotTime;
        }

        public GetPersonListResponseDataRecords setPropertyTagList(java.util.List<GetPersonListResponseDataRecordsPropertyTagList> propertyTagList) {
            this.propertyTagList = propertyTagList;
            return this;
        }
        public java.util.List<GetPersonListResponseDataRecordsPropertyTagList> getPropertyTagList() {
            return this.propertyTagList;
        }

    }

    public static class GetPersonListResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetPersonListResponseDataRecords> records;

        public static GetPersonListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseData self = new GetPersonListResponseData();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetPersonListResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetPersonListResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetPersonListResponseData setRecords(java.util.List<GetPersonListResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetPersonListResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
