// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPersonListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPersonListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListResponseBody self = new GetPersonListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPersonListResponseBody setData(GetPersonListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPersonListResponseBodyData getData() {
        return this.data;
    }

    public GetPersonListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPersonListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPersonListResponseBodyDataRecordsPropertyTagList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("TagCodeName")
        public String tagCodeName;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Value")
        public String value;

        public static GetPersonListResponseBodyDataRecordsPropertyTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyDataRecordsPropertyTagList self = new GetPersonListResponseBodyDataRecordsPropertyTagList();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setTagCodeName(String tagCodeName) {
            this.tagCodeName = tagCodeName;
            return this;
        }
        public String getTagCodeName() {
            return this.tagCodeName;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPersonListResponseBodyDataRecords extends TeaModel {
        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("FirstShotTime")
        public Long firstShotTime;

        @NameInMap("LastShotTime")
        public Long lastShotTime;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PropertyTagList")
        public java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> propertyTagList;

        @NameInMap("SearchMatchingRate")
        public String searchMatchingRate;

        public static GetPersonListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyDataRecords self = new GetPersonListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyDataRecords setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetPersonListResponseBodyDataRecords setFirstShotTime(Long firstShotTime) {
            this.firstShotTime = firstShotTime;
            return this;
        }
        public Long getFirstShotTime() {
            return this.firstShotTime;
        }

        public GetPersonListResponseBodyDataRecords setLastShotTime(Long lastShotTime) {
            this.lastShotTime = lastShotTime;
            return this;
        }
        public Long getLastShotTime() {
            return this.lastShotTime;
        }

        public GetPersonListResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetPersonListResponseBodyDataRecords setPropertyTagList(java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> propertyTagList) {
            this.propertyTagList = propertyTagList;
            return this;
        }
        public java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> getPropertyTagList() {
            return this.propertyTagList;
        }

        public GetPersonListResponseBodyDataRecords setSearchMatchingRate(String searchMatchingRate) {
            this.searchMatchingRate = searchMatchingRate;
            return this;
        }
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

    }

    public static class GetPersonListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<GetPersonListResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetPersonListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyData self = new GetPersonListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetPersonListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetPersonListResponseBodyData setRecords(java.util.List<GetPersonListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetPersonListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetPersonListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
