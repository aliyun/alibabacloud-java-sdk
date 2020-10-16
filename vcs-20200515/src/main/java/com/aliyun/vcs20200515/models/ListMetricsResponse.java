// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMetricsResponse extends TeaModel {
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
    public ListMetricsResponseData data;

    public static ListMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsResponse self = new ListMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetricsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMetricsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMetricsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricsResponse setData(ListMetricsResponseData data) {
        this.data = data;
        return this;
    }
    public ListMetricsResponseData getData() {
        return this.data;
    }

    public static class ListMetricsResponseDataRecords extends TeaModel {
        @NameInMap("DateTime")
        @Validation(required = true)
        public String dateTime;

        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("TagMetric")
        @Validation(required = true)
        public String tagMetric;

        public static ListMetricsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseDataRecords self = new ListMetricsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseDataRecords setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public ListMetricsResponseDataRecords setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public ListMetricsResponseDataRecords setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListMetricsResponseDataRecords setTagMetric(String tagMetric) {
            this.tagMetric = tagMetric;
            return this;
        }
        public String getTagMetric() {
            return this.tagMetric;
        }

    }

    public static class ListMetricsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListMetricsResponseDataRecords> records;

        public static ListMetricsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListMetricsResponseData self = new ListMetricsResponseData();
            return TeaModel.build(map, self);
        }

        public ListMetricsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMetricsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMetricsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListMetricsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListMetricsResponseData setRecords(java.util.List<ListMetricsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListMetricsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
