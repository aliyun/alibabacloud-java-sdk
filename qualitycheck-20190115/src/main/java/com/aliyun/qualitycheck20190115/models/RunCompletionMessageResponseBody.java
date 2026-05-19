// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RunCompletionMessageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunCompletionMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageResponseBody self = new RunCompletionMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunCompletionMessageResponseBody setData(RunCompletionMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunCompletionMessageResponseBodyData getData() {
        return this.data;
    }

    public RunCompletionMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunCompletionMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCompletionMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunCompletionMessageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        @NameInMap("LlmRequestId")
        public String llmRequestId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunCompletionMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionMessageResponseBodyData self = new RunCompletionMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunCompletionMessageResponseBodyData setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public RunCompletionMessageResponseBodyData setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunCompletionMessageResponseBodyData setLlmRequestId(String llmRequestId) {
            this.llmRequestId = llmRequestId;
            return this;
        }
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        public RunCompletionMessageResponseBodyData setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunCompletionMessageResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunCompletionMessageResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
