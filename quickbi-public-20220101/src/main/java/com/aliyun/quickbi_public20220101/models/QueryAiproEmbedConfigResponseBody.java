// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAiproEmbedConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D8749***C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryAiproEmbedConfigResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiproEmbedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiproEmbedConfigResponseBody self = new QueryAiproEmbedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiproEmbedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiproEmbedConfigResponseBody setResult(java.util.List<QueryAiproEmbedConfigResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryAiproEmbedConfigResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryAiproEmbedConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiproEmbedConfigResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>小Q</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>123124</p>
         */
        @NameInMap("AiProId")
        public String aiProId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatHistoryStatus")
        public Integer chatHistoryStatus;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MemoryEnabled")
        public Integer memoryEnabled;

        /**
         * <strong>example:</strong>
         * <p>0327</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UploadEnabled")
        public Integer uploadEnabled;

        public static QueryAiproEmbedConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAiproEmbedConfigResponseBodyResult self = new QueryAiproEmbedConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryAiproEmbedConfigResponseBodyResult setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryAiproEmbedConfigResponseBodyResult setAiProId(String aiProId) {
            this.aiProId = aiProId;
            return this;
        }
        public String getAiProId() {
            return this.aiProId;
        }

        public QueryAiproEmbedConfigResponseBodyResult setChatHistoryStatus(Integer chatHistoryStatus) {
            this.chatHistoryStatus = chatHistoryStatus;
            return this;
        }
        public Integer getChatHistoryStatus() {
            return this.chatHistoryStatus;
        }

        public QueryAiproEmbedConfigResponseBodyResult setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryAiproEmbedConfigResponseBodyResult setMemoryEnabled(Integer memoryEnabled) {
            this.memoryEnabled = memoryEnabled;
            return this;
        }
        public Integer getMemoryEnabled() {
            return this.memoryEnabled;
        }

        public QueryAiproEmbedConfigResponseBodyResult setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryAiproEmbedConfigResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAiproEmbedConfigResponseBodyResult setUploadEnabled(Integer uploadEnabled) {
            this.uploadEnabled = uploadEnabled;
            return this;
        }
        public Integer getUploadEnabled() {
            return this.uploadEnabled;
        }

    }

}
