// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchOmsOpenAPIMonitorMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIMonitorMetricResponseBody self = new SearchOmsOpenAPIMonitorMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setData(java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyData> getData() {
        return this.data;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setErrorDetail(SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchOmsOpenAPIMonitorMetricResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public Double value;

        public static SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints self = new SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class SearchOmsOpenAPIMonitorMetricResponseBodyData extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints> dataPoints;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        public static SearchOmsOpenAPIMonitorMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIMonitorMetricResponseBodyData self = new SearchOmsOpenAPIMonitorMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyData setDataPoints(java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyData setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyData setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

    }

    public static class SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail self = new SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
