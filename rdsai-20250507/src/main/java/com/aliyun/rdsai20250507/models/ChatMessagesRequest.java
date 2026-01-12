// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesRequest extends TeaModel {
    /**
     * <p>The query content.</p>
     * 
     * <strong>example:</strong>
     * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The ID of the parent message.</p>
     */
    @NameInMap("Inputs")
    public ChatMessagesRequestInputs inputs;

    /**
     * <p>The ID of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ChatMessages</strong>.</p>
     * <p>This parameter is required.</p>
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

    public static class ChatMessagesRequestInputs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
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

        public ChatMessagesRequestInputs setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ChatMessagesRequestInputs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
