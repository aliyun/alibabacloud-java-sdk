// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPersonsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPersonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonsResponseBody self = new ListPersonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonsResponseBody setData(ListPersonsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPersonsResponseBodyData getData() {
        return this.data;
    }

    public ListPersonsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPersonsResponseBodyDataRecordsTagList extends TeaModel {
        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagValueId")
        public String tagValueId;

        public static ListPersonsResponseBodyDataRecordsTagList build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseBodyDataRecordsTagList self = new ListPersonsResponseBodyDataRecordsTagList();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseBodyDataRecordsTagList setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListPersonsResponseBodyDataRecordsTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListPersonsResponseBodyDataRecordsTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListPersonsResponseBodyDataRecordsTagList setTagValueId(String tagValueId) {
            this.tagValueId = tagValueId;
            return this;
        }
        public String getTagValueId() {
            return this.tagValueId;
        }

    }

    public static class ListPersonsResponseBodyDataRecords extends TeaModel {
        @NameInMap("FirstAppearTime")
        public String firstAppearTime;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("TagList")
        public java.util.List<ListPersonsResponseBodyDataRecordsTagList> tagList;

        public static ListPersonsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseBodyDataRecords self = new ListPersonsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseBodyDataRecords setFirstAppearTime(String firstAppearTime) {
            this.firstAppearTime = firstAppearTime;
            return this;
        }
        public String getFirstAppearTime() {
            return this.firstAppearTime;
        }

        public ListPersonsResponseBodyDataRecords setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListPersonsResponseBodyDataRecords setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public ListPersonsResponseBodyDataRecords setTagList(java.util.List<ListPersonsResponseBodyDataRecordsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<ListPersonsResponseBodyDataRecordsTagList> getTagList() {
            return this.tagList;
        }

    }

    public static class ListPersonsResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public String pageNo;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Records")
        public java.util.List<ListPersonsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public String totalCount;

        @NameInMap("TotalPage")
        public String totalPage;

        public static ListPersonsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonsResponseBodyData self = new ListPersonsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonsResponseBodyData setPageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public String getPageNo() {
            return this.pageNo;
        }

        public ListPersonsResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListPersonsResponseBodyData setRecords(java.util.List<ListPersonsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListPersonsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListPersonsResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListPersonsResponseBodyData setTotalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public String getTotalPage() {
            return this.totalPage;
        }

    }

}
