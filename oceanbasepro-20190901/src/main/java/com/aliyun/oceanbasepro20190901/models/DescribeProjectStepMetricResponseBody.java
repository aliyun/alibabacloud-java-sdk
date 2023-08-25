// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepMetricResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public DescribeProjectStepMetricResponseBodyData data;

    @NameInMap("ErrorDetail")
    public DescribeProjectStepMetricResponseBodyErrorDetail errorDetail;

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

    public static DescribeProjectStepMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepMetricResponseBody self = new DescribeProjectStepMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepMetricResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeProjectStepMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectStepMetricResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeProjectStepMetricResponseBody setData(DescribeProjectStepMetricResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProjectStepMetricResponseBodyData getData() {
        return this.data;
    }

    public DescribeProjectStepMetricResponseBody setErrorDetail(DescribeProjectStepMetricResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeProjectStepMetricResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeProjectStepMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectStepMetricResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectStepMetricResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectStepMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectStepMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectStepMetricResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectStepMetricResponseBodyDataMetricsDataPoints extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public Double value;

        public static DescribeProjectStepMetricResponseBodyDataMetricsDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepMetricResponseBodyDataMetricsDataPoints self = new DescribeProjectStepMetricResponseBodyDataMetricsDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepMetricResponseBodyDataMetricsDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeProjectStepMetricResponseBodyDataMetricsDataPoints setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class DescribeProjectStepMetricResponseBodyDataMetrics extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<DescribeProjectStepMetricResponseBodyDataMetricsDataPoints> dataPoints;

        @NameInMap("Name")
        public String name;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        public static DescribeProjectStepMetricResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepMetricResponseBodyDataMetrics self = new DescribeProjectStepMetricResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepMetricResponseBodyDataMetrics setDataPoints(java.util.List<DescribeProjectStepMetricResponseBodyDataMetricsDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeProjectStepMetricResponseBodyDataMetricsDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeProjectStepMetricResponseBodyDataMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectStepMetricResponseBodyDataMetrics setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

    }

    public static class DescribeProjectStepMetricResponseBodyData extends TeaModel {
        @NameInMap("Aggregator")
        public String aggregator;

        @NameInMap("Metrics")
        public java.util.List<DescribeProjectStepMetricResponseBodyDataMetrics> metrics;

        @NameInMap("ReferenceValue")
        public Long referenceValue;

        public static DescribeProjectStepMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepMetricResponseBodyData self = new DescribeProjectStepMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepMetricResponseBodyData setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public DescribeProjectStepMetricResponseBodyData setMetrics(java.util.List<DescribeProjectStepMetricResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeProjectStepMetricResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public DescribeProjectStepMetricResponseBodyData setReferenceValue(Long referenceValue) {
            this.referenceValue = referenceValue;
            return this;
        }
        public Long getReferenceValue() {
            return this.referenceValue;
        }

    }

    public static class DescribeProjectStepMetricResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectStepMetricResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepMetricResponseBodyErrorDetail self = new DescribeProjectStepMetricResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectStepMetricResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
