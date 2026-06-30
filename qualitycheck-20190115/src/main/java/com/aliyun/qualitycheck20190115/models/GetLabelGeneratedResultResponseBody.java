// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetLabelGeneratedResultResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetLabelGeneratedResultResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true: The call was successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLabelGeneratedResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelGeneratedResultResponseBody self = new GetLabelGeneratedResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelGeneratedResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLabelGeneratedResultResponseBody setData(GetLabelGeneratedResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLabelGeneratedResultResponseBodyData getData() {
        return this.data;
    }

    public GetLabelGeneratedResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLabelGeneratedResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLabelGeneratedResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLabelGeneratedResultResponseBodyData extends TeaModel {
        /**
         * <p>The number of input tokens for the LLM.</p>
         * 
         * <strong>example:</strong>
         * <p>7371</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <p>The number of LLM calls.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LlmCallNum")
        public Integer llmCallNum;

        /**
         * <p>The number of output tokens for the LLM.</p>
         * 
         * <strong>example:</strong>
         * <p>355</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <p>The pre-signed download URL of the result file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sca-eas-mining.oss-cn-beijing.aliyuncs.com/xxx.xlsx?Expires=">https://sca-eas-mining.oss-cn-beijing.aliyuncs.com/xxx.xlsx?Expires=</a>...</p>
         */
        @NameInMap("ResultFileUrl")
        public String resultFileUrl;

        /**
         * <p>The ID of the generation task.</p>
         * 
         * <strong>example:</strong>
         * <p>20260616-4955F615-A74E-171E-86ED-080F60C72EC9</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetLabelGeneratedResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLabelGeneratedResultResponseBodyData self = new GetLabelGeneratedResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLabelGeneratedResultResponseBodyData setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public GetLabelGeneratedResultResponseBodyData setLlmCallNum(Integer llmCallNum) {
            this.llmCallNum = llmCallNum;
            return this;
        }
        public Integer getLlmCallNum() {
            return this.llmCallNum;
        }

        public GetLabelGeneratedResultResponseBodyData setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public GetLabelGeneratedResultResponseBodyData setResultFileUrl(String resultFileUrl) {
            this.resultFileUrl = resultFileUrl;
            return this;
        }
        public String getResultFileUrl() {
            return this.resultFileUrl;
        }

        public GetLabelGeneratedResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
