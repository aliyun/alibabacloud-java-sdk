// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffChatRequest extends TeaModel {
    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The chat ID. Pass in this parameter to resume a conversation after an interruption.</p>
     * 
     * <strong>example:</strong>
     * <p>3b465fe1-6f06-4899-af9f-d43d9338df25</p>
     */
    @NameInMap("ChatId")
    public String chatId;

    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The list of conversation messages.</p>
     */
    @NameInMap("Messages")
    public java.util.List<CreateAIStaffChatRequestMessages> messages;

    /**
     * <p>The additional information for the conversation.</p>
     */
    @NameInMap("MetaData")
    public java.util.Map<String, String> metaData;

    public static CreateAIStaffChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIStaffChatRequest self = new CreateAIStaffChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIStaffChatRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateAIStaffChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public CreateAIStaffChatRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateAIStaffChatRequest setMessages(java.util.List<CreateAIStaffChatRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateAIStaffChatRequestMessages> getMessages() {
        return this.messages;
    }

    public CreateAIStaffChatRequest setMetaData(java.util.Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    public static class CreateAIStaffChatRequestMessages extends TeaModel {
        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;CodeRevision\&quot;: \&quot;1750040991876284109\&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The business extension metadata in Map format. The value must be a JSON string.</p>
         */
        @NameInMap("MetaData")
        public java.util.Map<String, String> metaData;

        /**
         * <p>The conversation role.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx_dn</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAIStaffChatRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateAIStaffChatRequestMessages self = new CreateAIStaffChatRequestMessages();
            return TeaModel.build(map, self);
        }

        public CreateAIStaffChatRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAIStaffChatRequestMessages setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateAIStaffChatRequestMessages setMetaData(java.util.Map<String, String> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, String> getMetaData() {
            return this.metaData;
        }

        public CreateAIStaffChatRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateAIStaffChatRequestMessages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
