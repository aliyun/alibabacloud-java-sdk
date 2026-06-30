// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListLLMTokenUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11345</p>
     */
    @NameInMap("CompletionTokens")
    public Long completionTokens;

    /**
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("ExplicitCachedTokens")
    public Long explicitCachedTokens;

    /**
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("ImplicitCachedTokens")
    public Long implicitCachedTokens;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PromptTokens")
    public Long promptTokens;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenUsages")
    public java.util.List<ListLLMTokenUsageResponseBodyTokenUsages> tokenUsages;

    /**
     * <strong>example:</strong>
     * <p>15345</p>
     */
    @NameInMap("TotalTokens")
    public Long totalTokens;

    public static ListLLMTokenUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLLMTokenUsageResponseBody self = new ListLLMTokenUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLLMTokenUsageResponseBody setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public ListLLMTokenUsageResponseBody setExplicitCachedTokens(Long explicitCachedTokens) {
        this.explicitCachedTokens = explicitCachedTokens;
        return this;
    }
    public Long getExplicitCachedTokens() {
        return this.explicitCachedTokens;
    }

    public ListLLMTokenUsageResponseBody setImplicitCachedTokens(Long implicitCachedTokens) {
        this.implicitCachedTokens = implicitCachedTokens;
        return this;
    }
    public Long getImplicitCachedTokens() {
        return this.implicitCachedTokens;
    }

    public ListLLMTokenUsageResponseBody setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Long getPromptTokens() {
        return this.promptTokens;
    }

    public ListLLMTokenUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLLMTokenUsageResponseBody setTokenUsages(java.util.List<ListLLMTokenUsageResponseBodyTokenUsages> tokenUsages) {
        this.tokenUsages = tokenUsages;
        return this;
    }
    public java.util.List<ListLLMTokenUsageResponseBodyTokenUsages> getTokenUsages() {
        return this.tokenUsages;
    }

    public ListLLMTokenUsageResponseBody setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public static class ListLLMTokenUsageResponseBodyTokenUsages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("CompletionReasoningTokens")
        public Long completionReasoningTokens;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("CompletionTokens")
        public Long completionTokens;

        /**
         * <strong>example:</strong>
         * <p>2025-12-01T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ExplicitCachedTokens")
        public Long explicitCachedTokens;

        /**
         * <strong>example:</strong>
         * <p>1408</p>
         */
        @NameInMap("ImplicitCachedTokens")
        public Long implicitCachedTokens;

        /**
         * <strong>example:</strong>
         * <p>glm-5</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("PromptTokens")
        public Long promptTokens;

        /**
         * <strong>example:</strong>
         * <p>2025-03-27</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static ListLLMTokenUsageResponseBodyTokenUsages build(java.util.Map<String, ?> map) throws Exception {
            ListLLMTokenUsageResponseBodyTokenUsages self = new ListLLMTokenUsageResponseBodyTokenUsages();
            return TeaModel.build(map, self);
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setCompletionReasoningTokens(Long completionReasoningTokens) {
            this.completionReasoningTokens = completionReasoningTokens;
            return this;
        }
        public Long getCompletionReasoningTokens() {
            return this.completionReasoningTokens;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setCompletionTokens(Long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public Long getCompletionTokens() {
            return this.completionTokens;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setExplicitCachedTokens(Long explicitCachedTokens) {
            this.explicitCachedTokens = explicitCachedTokens;
            return this;
        }
        public Long getExplicitCachedTokens() {
            return this.explicitCachedTokens;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setImplicitCachedTokens(Long implicitCachedTokens) {
            this.implicitCachedTokens = implicitCachedTokens;
            return this;
        }
        public Long getImplicitCachedTokens() {
            return this.implicitCachedTokens;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setPromptTokens(Long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public Long getPromptTokens() {
            return this.promptTokens;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListLLMTokenUsageResponseBodyTokenUsages setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
