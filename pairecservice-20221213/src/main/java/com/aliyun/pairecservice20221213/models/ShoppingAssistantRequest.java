// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ShoppingAssistantRequest extends TeaModel {
    /**
     * <p>The additional configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The contents.</p>
     */
    @NameInMap("Contents")
    public ShoppingAssistantRequestContents contents;

    /**
     * <p>The conversation ID. This parameter is not yet effective.</p>
     * 
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p><strong>The environment.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Prod: productionPre: pre-release.</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The input message.</p>
     */
    @NameInMap("InputMessage")
    public ShoppingAssistantRequestInputMessage inputMessage;

    /**
     * <p><strong>The instance ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh/en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p><strong>The scene ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>ai_shopping</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p><strong>The service ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>ServiceId.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>user id。</p>
     * 
     * <strong>example:</strong>
     * <p>0001</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static ShoppingAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        ShoppingAssistantRequest self = new ShoppingAssistantRequest();
        return TeaModel.build(map, self);
    }

    public ShoppingAssistantRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ShoppingAssistantRequest setContents(ShoppingAssistantRequestContents contents) {
        this.contents = contents;
        return this;
    }
    public ShoppingAssistantRequestContents getContents() {
        return this.contents;
    }

    public ShoppingAssistantRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ShoppingAssistantRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ShoppingAssistantRequest setInputMessage(ShoppingAssistantRequestInputMessage inputMessage) {
        this.inputMessage = inputMessage;
        return this;
    }
    public ShoppingAssistantRequestInputMessage getInputMessage() {
        return this.inputMessage;
    }

    public ShoppingAssistantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ShoppingAssistantRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ShoppingAssistantRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ShoppingAssistantRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ShoppingAssistantRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ShoppingAssistantRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class ShoppingAssistantRequestContents extends TeaModel {
        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>Recommend some light-colored long-sleeve shirts suitable for spring, budget under 300</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static ShoppingAssistantRequestContents build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantRequestContents self = new ShoppingAssistantRequestContents();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantRequestContents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ShoppingAssistantRequestContents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ShoppingAssistantRequestInputMessageContent extends TeaModel {
        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>Recommend some light-colored long-sleeve shirts suitable for spring, budget under 300</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static ShoppingAssistantRequestInputMessageContent build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantRequestInputMessageContent self = new ShoppingAssistantRequestInputMessageContent();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantRequestInputMessageContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ShoppingAssistantRequestInputMessageContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ShoppingAssistantRequestInputMessage extends TeaModel {
        /**
         * <p>The message content.</p>
         */
        @NameInMap("Content")
        public java.util.List<ShoppingAssistantRequestInputMessageContent> content;

        public static ShoppingAssistantRequestInputMessage build(java.util.Map<String, ?> map) throws Exception {
            ShoppingAssistantRequestInputMessage self = new ShoppingAssistantRequestInputMessage();
            return TeaModel.build(map, self);
        }

        public ShoppingAssistantRequestInputMessage setContent(java.util.List<ShoppingAssistantRequestInputMessageContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ShoppingAssistantRequestInputMessageContent> getContent() {
            return this.content;
        }

    }

}
