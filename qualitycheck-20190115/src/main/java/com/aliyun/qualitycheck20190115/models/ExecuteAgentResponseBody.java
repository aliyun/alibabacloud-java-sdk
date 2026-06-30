// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ExecuteAgentResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ExecuteAgentResponseBodyData data;

    /**
     * <p>The error message returned when an error occurs.</p>
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
     * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. The caller can use this field to determine whether the request was successful. Valid values: <strong>true</strong>: The request was successful. <strong>false/null</strong>: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExecuteAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAgentResponseBody self = new ExecuteAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteAgentResponseBody setData(ExecuteAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAgentResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAgentResponseBodyData extends TeaModel {
        /**
         * <p>If streaming output is used, this value is null during generation. When generation is complete, the value is stop if the generation ended due to a stop token.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The request ID returned by the large language model service.</p>
         * 
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        @NameInMap("LlmRequestId")
        public String llmRequestId;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The result returned by the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>这段对话似乎是客服与客户之间关于一个服务或产品的讨论，但具体内容难以明确理解，因为对话中的言语比较零散和抽象。</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        /**
         * <p>The number of times the plus model was used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TyxmPlusCount")
        public String tyxmPlusCount;

        /**
         * <p>The number of times the turbo model was used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TyxmTurboCount")
        public String tyxmTurboCount;

        public static ExecuteAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAgentResponseBodyData self = new ExecuteAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAgentResponseBodyData setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public ExecuteAgentResponseBodyData setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public ExecuteAgentResponseBodyData setLlmRequestId(String llmRequestId) {
            this.llmRequestId = llmRequestId;
            return this;
        }
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        public ExecuteAgentResponseBodyData setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public ExecuteAgentResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ExecuteAgentResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public ExecuteAgentResponseBodyData setTyxmPlusCount(String tyxmPlusCount) {
            this.tyxmPlusCount = tyxmPlusCount;
            return this;
        }
        public String getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        public ExecuteAgentResponseBodyData setTyxmTurboCount(String tyxmTurboCount) {
            this.tyxmTurboCount = tyxmTurboCount;
            return this;
        }
        public String getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

    }

}
