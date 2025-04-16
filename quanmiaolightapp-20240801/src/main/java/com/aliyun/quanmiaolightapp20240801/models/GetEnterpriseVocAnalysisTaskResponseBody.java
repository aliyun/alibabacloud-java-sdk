// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEnterpriseVocAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnterpriseVocAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetEnterpriseVocAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseVocAnalysisTaskResponseBody self = new GetEnterpriseVocAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setData(GetEnterpriseVocAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseVocAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic extends TeaModel {
        @NameInMap("tagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("valueCount")
        public Integer valueCount;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics extends TeaModel {
        @NameInMap("tagValueCountStatistic")
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics setTagValueCountStatistic(java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic) {
            this.tagValueCountStatistic = tagValueCountStatistic;
            return this;
        }
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic extends TeaModel {
        @NameInMap("tagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("valueCount")
        public Integer valueCount;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics extends TeaModel {
        @NameInMap("tagValueCountStatistic")
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics setTagValueCountStatistic(java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic) {
            this.tagValueCountStatistic = tagValueCountStatistic;
            return this;
        }
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("count")
        public Integer count;

        @NameInMap("filterDimensionStatistics")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics filterDimensionStatistics;

        @NameInMap("tagDimensionStatistics")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics tagDimensionStatistics;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setFilterDimensionStatistics(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics filterDimensionStatistics) {
            this.filterDimensionStatistics = filterDimensionStatistics;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics getFilterDimensionStatistics() {
            return this.filterDimensionStatistics;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setTagDimensionStatistics(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics tagDimensionStatistics) {
            this.tagDimensionStatistics = tagDimensionStatistics;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics getTagDimensionStatistics() {
            return this.tagDimensionStatistics;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputTokens")
        public Integer outputTokens;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataUsage self = new GetEnterpriseVocAnalysisTaskResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyData extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelId")
        public String modelId;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("statisticsOverview")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview statisticsOverview;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("usage")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage usage;

        public static GetEnterpriseVocAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyData self = new GetEnterpriseVocAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setStatisticsOverview(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview statisticsOverview) {
            this.statisticsOverview = statisticsOverview;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview getStatisticsOverview() {
            return this.statisticsOverview;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setUsage(GetEnterpriseVocAnalysisTaskResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
