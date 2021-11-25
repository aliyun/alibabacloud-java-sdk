// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListMetricsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponseBody self = new ListMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMetricsResponseBody setData(ListMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMetricsResponseBodyData getData() {
        return this.data;
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

    public static class ListMetricsResponseBodyDataRecords extends TeaModel {
        @NameInMap("DateTime")
        public String dateTime;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagMetric")
        public String tagMetric;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListMetricsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyDataRecords self = new ListMetricsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseBodyDataRecords setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public ListMetricsResponseBodyDataRecords setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListMetricsResponseBodyDataRecords setTagMetric(String tagMetric) {
            this.tagMetric = tagMetric;
            return this;
        }
        public String getTagMetric() {
            return this.tagMetric;
        }

        public ListMetricsResponseBodyDataRecords setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListMetricsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<ListMetricsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseBodyData self = new ListMetricsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListMetricsResponseBodyData setRecords(java.util.List<ListMetricsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListMetricsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListMetricsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMetricsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
