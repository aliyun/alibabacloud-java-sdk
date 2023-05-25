// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricResponseBody extends TeaModel {
    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyData> data;

    /**
     * <p>A system error occurred.</p>
     */
    @NameInMap("ErrorDetail")
    public SearchOmsOpenAPIMonitorMetricResponseBodyErrorDetail errorDetail;

    /**
     * <p>The suggestions (old).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The error code (new).</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time spent in processing the request, in seconds.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The error details.</p>
     */
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
        /**
         * <p>connector data point</p>
         */
        @NameInMap("DataPoints")
        public java.util.List<SearchOmsOpenAPIMonitorMetricResponseBodyDataDataPoints> dataPoints;

        @NameInMap("Metric")
        public String metric;

        /**
         * <p>metric tags</p>
         */
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
        /**
         * <p>The information about the object.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error code (old).</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The ID of the project to query.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The error description (new).</p>
         */
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
