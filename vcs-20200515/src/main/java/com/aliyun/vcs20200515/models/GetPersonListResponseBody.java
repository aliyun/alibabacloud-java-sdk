// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetPersonListResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetPersonListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListResponseBody self = new GetPersonListResponseBody();
        return TeaModel.build(map, self);
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

    public GetPersonListResponseBody setData(GetPersonListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPersonListResponseBodyData getData() {
        return this.data;
    }

    public GetPersonListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetPersonListResponseBodyDataRecordsPropertyTagList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagCodeName")
        public String tagCodeName;

        @NameInMap("Code")
        public String code;

        public static GetPersonListResponseBodyDataRecordsPropertyTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyDataRecordsPropertyTagList self = new GetPersonListResponseBodyDataRecordsPropertyTagList();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setTagCodeName(String tagCodeName) {
            this.tagCodeName = tagCodeName;
            return this;
        }
        public String getTagCodeName() {
            return this.tagCodeName;
        }

        public GetPersonListResponseBodyDataRecordsPropertyTagList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class GetPersonListResponseBodyDataRecords extends TeaModel {
        @NameInMap("PropertyTagList")
        public java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> propertyTagList;

        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("SearchMatchingRate")
        public String searchMatchingRate;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("LastShotTime")
        public Long lastShotTime;

        @NameInMap("FirstShotTime")
        public Long firstShotTime;

        public static GetPersonListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyDataRecords self = new GetPersonListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyDataRecords setPropertyTagList(java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> propertyTagList) {
            this.propertyTagList = propertyTagList;
            return this;
        }
        public java.util.List<GetPersonListResponseBodyDataRecordsPropertyTagList> getPropertyTagList() {
            return this.propertyTagList;
        }

        public GetPersonListResponseBodyDataRecords setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetPersonListResponseBodyDataRecords setSearchMatchingRate(String searchMatchingRate) {
            this.searchMatchingRate = searchMatchingRate;
            return this;
        }
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

        public GetPersonListResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetPersonListResponseBodyDataRecords setLastShotTime(Long lastShotTime) {
            this.lastShotTime = lastShotTime;
            return this;
        }
        public Long getLastShotTime() {
            return this.lastShotTime;
        }

        public GetPersonListResponseBodyDataRecords setFirstShotTime(Long firstShotTime) {
            this.firstShotTime = firstShotTime;
            return this;
        }
        public Long getFirstShotTime() {
            return this.firstShotTime;
        }

    }

    public static class GetPersonListResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<GetPersonListResponseBodyDataRecords> records;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetPersonListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPersonListResponseBodyData self = new GetPersonListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPersonListResponseBodyData setRecords(java.util.List<GetPersonListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetPersonListResponseBodyDataRecords> getRecords() {
            return this.records;
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

        public GetPersonListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
