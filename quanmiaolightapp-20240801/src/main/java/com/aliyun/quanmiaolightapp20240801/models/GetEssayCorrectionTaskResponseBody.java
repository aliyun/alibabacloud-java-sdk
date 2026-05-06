// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEssayCorrectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEssayCorrectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
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

    public static GetEssayCorrectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEssayCorrectionTaskResponseBody self = new GetEssayCorrectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEssayCorrectionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEssayCorrectionTaskResponseBody setData(GetEssayCorrectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEssayCorrectionTaskResponseBodyData getData() {
        return this.data;
    }

    public GetEssayCorrectionTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEssayCorrectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEssayCorrectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEssayCorrectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文章内容较为完整，涵盖了题目的核心要求，但部分论述略显简略。</p>
         */
        @NameInMap("analysis")
        public String analysis;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("maxScore")
        public Double maxScore;

        /**
         * <strong>example:</strong>
         * <p>内容完整度</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>25.5</p>
         */
        @NameInMap("score")
        public Double score;

        public static GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults build(java.util.Map<String, ?> map) throws Exception {
            GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults self = new GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults();
            return TeaModel.build(map, self);
        }

        public GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults setAnalysis(String analysis) {
            this.analysis = analysis;
            return this;
        }
        public String getAnalysis() {
            return this.analysis;
        }

        public GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults setMaxScore(Double maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Double getMaxScore() {
            return this.maxScore;
        }

        public GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class GetEssayCorrectionTaskResponseBodyDataResults extends TeaModel {
        /**
         * <p>xxx</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("customId")
        public String customId;

        @NameInMap("dimensionResults")
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults> dimensionResults;

        /**
         * <strong>example:</strong>
         * <p>RateLimit</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>触发模型限流</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>整体表现良好，建议在论述深度上进一步加强。</p>
         */
        @NameInMap("overallComment")
        public String overallComment;

        /**
         * <strong>example:</strong>
         * <p>本文整体结构清晰，语言流畅...</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("score")
        public Integer score;

        @NameInMap("usage")
        public ModelUsage usage;

        public static GetEssayCorrectionTaskResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            GetEssayCorrectionTaskResponseBodyDataResults self = new GetEssayCorrectionTaskResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setDimensionResults(java.util.List<GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults> dimensionResults) {
            this.dimensionResults = dimensionResults;
            return this;
        }
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResultsDimensionResults> getDimensionResults() {
            return this.dimensionResults;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setOverallComment(String overallComment) {
            this.overallComment = overallComment;
            return this;
        }
        public String getOverallComment() {
            return this.overallComment;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetEssayCorrectionTaskResponseBodyDataResults setUsage(ModelUsage usage) {
            this.usage = usage;
            return this;
        }
        public ModelUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetEssayCorrectionTaskResponseBodyData extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("results")
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> results;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("totalUsage")
        public ModelUsage totalUsage;

        public static GetEssayCorrectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEssayCorrectionTaskResponseBodyData self = new GetEssayCorrectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEssayCorrectionTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetEssayCorrectionTaskResponseBodyData setResults(java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetEssayCorrectionTaskResponseBodyDataResults> getResults() {
            return this.results;
        }

        public GetEssayCorrectionTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEssayCorrectionTaskResponseBodyData setTotalUsage(ModelUsage totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public ModelUsage getTotalUsage() {
            return this.totalUsage;
        }

    }

}
