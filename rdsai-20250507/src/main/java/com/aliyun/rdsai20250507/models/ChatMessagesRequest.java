// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesRequest extends TeaModel {
    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The event output type. Valid values: inline and separate. Default value: inline. When set to inline, tool invocation events, sub-node events, and document events are included in the answer field of event = message. When set to separate, tool invocation events, sub-node events, and document events each have their own event.</p>
     * 
     * <strong>example:</strong>
     * <p>inline</p>
     */
    @NameInMap("EventMode")
    public String eventMode;

    @NameInMap("Files")
    public java.util.List<ChatMessagesRequestFiles> files;

    /**
     * <p>The task input.</p>
     */
    @NameInMap("Inputs")
    public ChatMessagesRequestInputs inputs;

    /**
     * <p>The parent message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The query content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disk usage of instance rm-bp14as9914vd3****, is capacity expansion needed</p>
     */
    @NameInMap("Query")
    public String query;

    public static ChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesRequest self = new ChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ChatMessagesRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatMessagesRequest setEventMode(String eventMode) {
        this.eventMode = eventMode;
        return this;
    }
    public String getEventMode() {
        return this.eventMode;
    }

    public ChatMessagesRequest setFiles(java.util.List<ChatMessagesRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ChatMessagesRequestFiles> getFiles() {
        return this.files;
    }

    public ChatMessagesRequest setInputs(ChatMessagesRequestInputs inputs) {
        this.inputs = inputs;
        return this;
    }
    public ChatMessagesRequestInputs getInputs() {
        return this.inputs;
    }

    public ChatMessagesRequest setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
        return this;
    }
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    public ChatMessagesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public static class ChatMessagesRequestFiles extends TeaModel {
        @NameInMap("TransferMethod")
        public String transferMethod;

        @NameInMap("Type")
        public String type;

        @NameInMap("UploadFileId")
        public String uploadFileId;

        public static ChatMessagesRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            ChatMessagesRequestFiles self = new ChatMessagesRequestFiles();
            return TeaModel.build(map, self);
        }

        public ChatMessagesRequestFiles setTransferMethod(String transferMethod) {
            this.transferMethod = transferMethod;
            return this;
        }
        public String getTransferMethod() {
            return this.transferMethod;
        }

        public ChatMessagesRequestFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatMessagesRequestFiles setUploadFileId(String uploadFileId) {
            this.uploadFileId = uploadFileId;
            return this;
        }
        public String getUploadFileId() {
            return this.uploadFileId;
        }

    }

    public static class ChatMessagesRequestInputs extends TeaModel {
        /**
         * <p>The custom agent ID for the user.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>Specifies whether to enable deep thinking mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableThinking")
        public String enableThinking;

        /**
         * <p>The conversation language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-max</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The thinking depth.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ThinkEffort")
        public String thinkEffort;

        /**
         * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static ChatMessagesRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            ChatMessagesRequestInputs self = new ChatMessagesRequestInputs();
            return TeaModel.build(map, self);
        }

        public ChatMessagesRequestInputs setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ChatMessagesRequestInputs setEnableThinking(String enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public String getEnableThinking() {
            return this.enableThinking;
        }

        public ChatMessagesRequestInputs setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ChatMessagesRequestInputs setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ChatMessagesRequestInputs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ChatMessagesRequestInputs setThinkEffort(String thinkEffort) {
            this.thinkEffort = thinkEffort;
            return this;
        }
        public String getThinkEffort() {
            return this.thinkEffort;
        }

        public ChatMessagesRequestInputs setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

}
