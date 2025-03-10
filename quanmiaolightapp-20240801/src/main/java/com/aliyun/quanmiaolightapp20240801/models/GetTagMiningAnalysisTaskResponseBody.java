// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetTagMiningAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTagMiningAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTagMiningAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagMiningAnalysisTaskResponseBody self = new GetTagMiningAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagMiningAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTagMiningAnalysisTaskResponseBody setData(GetTagMiningAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTagMiningAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTagMiningAnalysisTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTagMiningAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTagMiningAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagMiningAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTagMiningAnalysisTaskResponseBodyDataResultsHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DataNotExists</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-finished</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>085BE2D2-BB7E-59A6-B688-F2CB32124E7F</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static GetTagMiningAnalysisTaskResponseBodyDataResultsHeader build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyDataResultsHeader self = new GetTagMiningAnalysisTaskResponseBodyDataResultsHeader();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("text")
        public String text;

        public static GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput self = new GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("inputToken")
        public Long inputToken;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("outputToken")
        public Long outputToken;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("totalToken")
        public Long totalToken;

        public static GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage self = new GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage setOutputToken(Long outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Long getOutputToken() {
            return this.outputToken;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage setTotalToken(Long totalToken) {
            this.totalToken = totalToken;
            return this;
        }
        public Long getTotalToken() {
            return this.totalToken;
        }

    }

    public static class GetTagMiningAnalysisTaskResponseBodyDataResultsPayload extends TeaModel {
        @NameInMap("output")
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput output;

        @NameInMap("usage")
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage usage;

        public static GetTagMiningAnalysisTaskResponseBodyDataResultsPayload build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyDataResultsPayload self = new GetTagMiningAnalysisTaskResponseBodyDataResultsPayload();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayload setOutput(GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput output) {
            this.output = output;
            return this;
        }
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadOutput getOutput() {
            return this.output;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayload setUsage(GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayloadUsage getUsage() {
            return this.usage;
        }

    }

    public static class GetTagMiningAnalysisTaskResponseBodyDataResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("customId")
        public String customId;

        @NameInMap("header")
        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader header;

        @NameInMap("payload")
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayload payload;

        public static GetTagMiningAnalysisTaskResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyDataResults self = new GetTagMiningAnalysisTaskResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResults setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResults setHeader(GetTagMiningAnalysisTaskResponseBodyDataResultsHeader header) {
            this.header = header;
            return this;
        }
        public GetTagMiningAnalysisTaskResponseBodyDataResultsHeader getHeader() {
            return this.header;
        }

        public GetTagMiningAnalysisTaskResponseBodyDataResults setPayload(GetTagMiningAnalysisTaskResponseBodyDataResultsPayload payload) {
            this.payload = payload;
            return this;
        }
        public GetTagMiningAnalysisTaskResponseBodyDataResultsPayload getPayload() {
            return this.payload;
        }

    }

    public static class GetTagMiningAnalysisTaskResponseBodyData extends TeaModel {
        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("results")
        public java.util.List<GetTagMiningAnalysisTaskResponseBodyDataResults> results;

        /**
         * <strong>example:</strong>
         * <p>RUNNIN</p>
         */
        @NameInMap("status")
        public String status;

        public static GetTagMiningAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTagMiningAnalysisTaskResponseBodyData self = new GetTagMiningAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTagMiningAnalysisTaskResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTagMiningAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTagMiningAnalysisTaskResponseBodyData setResults(java.util.List<GetTagMiningAnalysisTaskResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<GetTagMiningAnalysisTaskResponseBodyDataResults> getResults() {
            return this.results;
        }

        public GetTagMiningAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
