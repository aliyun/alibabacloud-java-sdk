// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMetricsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListMetricsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponseBody self = new ListMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricsResponseBody setData(ListMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetricsResponseBodyData getData() {
        return this.data;
    }

    public ListMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListMetricsResponseBodyDataRecords extends TeaModel {
        @NameInMap("TagMetric")
        public String tagMetric;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("DateTime")
        public String dateTime;

        public static ListMetricsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyDataRecords self = new ListMetricsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyDataRecords setTagMetric(String tagMetric) {
            this.tagMetric = tagMetric;
            return this;
        }
        public String getTagMetric() {
            return this.tagMetric;
        }

        public ListMetricsResponseBodyDataRecords setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListMetricsResponseBodyDataRecords setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListMetricsResponseBodyDataRecords setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

    }

    public static class ListMetricsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ListMetricsResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyData self = new ListMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyData setRecords(java.util.List<ListMetricsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListMetricsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListMetricsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListMetricsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMetricsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMetricsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
