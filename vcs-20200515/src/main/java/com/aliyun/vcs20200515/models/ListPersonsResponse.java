// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonsResponse extends TeaModel {
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
    public ListPersonsResponseData data;

    public static ListPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonsResponse self = new ListPersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonsResponse setData(ListPersonsResponseData data) {
        this.data = data;
        return this;
    }
    public ListPersonsResponseData getData() {
        return this.data;
    }

    public static class ListPersonsResponseDataRecordsTagList extends TeaModel {
        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagName")
        @Validation(required = true)
        public String tagName;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("TagValueId")
        @Validation(required = true)
        public String tagValueId;

        public static ListPersonsResponseDataRecordsTagList build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseDataRecordsTagList self = new ListPersonsResponseDataRecordsTagList();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseDataRecordsTagList setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListPersonsResponseDataRecordsTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListPersonsResponseDataRecordsTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListPersonsResponseDataRecordsTagList setTagValueId(String tagValueId) {
            this.tagValueId = tagValueId;
            return this;
        }
        public String getTagValueId() {
            return this.tagValueId;
        }

    }

    public static class ListPersonsResponseDataRecords extends TeaModel {
        @NameInMap("FirstAppearTime")
        @Validation(required = true)
        public String firstAppearTime;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("TagList")
        @Validation(required = true)
        public java.util.List<ListPersonsResponseDataRecordsTagList> tagList;

        public static ListPersonsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseDataRecords self = new ListPersonsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseDataRecords setFirstAppearTime(String firstAppearTime) {
            this.firstAppearTime = firstAppearTime;
            return this;
        }
        public String getFirstAppearTime() {
            return this.firstAppearTime;
        }

        public ListPersonsResponseDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonsResponseDataRecords setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public ListPersonsResponseDataRecords setTagList(java.util.List<ListPersonsResponseDataRecordsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<ListPersonsResponseDataRecordsTagList> getTagList() {
            return this.tagList;
        }

    }

    public static class ListPersonsResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public String pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public String totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListPersonsResponseDataRecords> records;

        public static ListPersonsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseData self = new ListPersonsResponseData();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseData setPageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public String getPageNo() {
            return this.pageNo;
        }

        public ListPersonsResponseData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListPersonsResponseData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListPersonsResponseData setTotalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public String getTotalPage() {
            return this.totalPage;
        }

        public ListPersonsResponseData setRecords(java.util.List<ListPersonsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListPersonsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
