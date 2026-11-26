// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
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
    public RunCompletionMessageResponseBodyData data;

    /**
     * <p>The error details if an error occurs, or <strong>successful</strong> if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of false indicates failure. A value of true or null indicates success.</p>
     * 
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
         * <p>The reason why the generation stopped. For streaming output, this parameter is null during generation and is set to stop when the generation ends due to a stop token.</p>
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
         * <p>This conversation appears to be a discussion between a customer service representative and a customer about a service or product, but the specific content is difficult to clearly understand because the language in the conversation is relatively fragmented and abstract</p>
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
