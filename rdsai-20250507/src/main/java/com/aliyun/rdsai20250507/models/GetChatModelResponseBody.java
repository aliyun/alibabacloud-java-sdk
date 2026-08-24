// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetChatModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetChatModelResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatModelResponseBody self = new GetChatModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatModelResponseBody setData(java.util.List<GetChatModelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChatModelResponseBodyData> getData() {
        return this.data;
    }

    public GetChatModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatModelResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("ContextWindow")
        public Long contextWindow;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Default")
        public Boolean _default;

        @NameInMap("Features")
        public java.util.List<String> features;

        /**
         * <strong>example:</strong>
         * <p>qwen3.7-max</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("ThinkingLevels")
        public java.util.List<String> thinkingLevels;

        public static GetChatModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatModelResponseBodyData self = new GetChatModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatModelResponseBodyData setContextWindow(Long contextWindow) {
            this.contextWindow = contextWindow;
            return this;
        }
        public Long getContextWindow() {
            return this.contextWindow;
        }

        public GetChatModelResponseBodyData set_default(Boolean _default) {
            this._default = _default;
            return this;
        }
        public Boolean get_default() {
            return this._default;
        }

        public GetChatModelResponseBodyData setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public GetChatModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetChatModelResponseBodyData setThinkingLevels(java.util.List<String> thinkingLevels) {
            this.thinkingLevels = thinkingLevels;
            return this;
        }
        public java.util.List<String> getThinkingLevels() {
            return this.thinkingLevels;
        }

    }

}
