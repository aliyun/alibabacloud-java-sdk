// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateAgentConversationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>conversation-request-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("initialMessage")
    public CreateAgentConversationRequestInitialMessage initialMessage;

    /**
     * <strong>example:</strong>
     * <p>消息堆积排查</p>
     */
    @NameInMap("title")
    public String title;

    public static CreateAgentConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConversationRequest self = new CreateAgentConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentConversationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAgentConversationRequest setInitialMessage(CreateAgentConversationRequestInitialMessage initialMessage) {
        this.initialMessage = initialMessage;
        return this;
    }
    public CreateAgentConversationRequestInitialMessage getInitialMessage() {
        return this.initialMessage;
    }

    public CreateAgentConversationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateAgentConversationRequestInitialMessageImages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAC0lEQVR4nGNgAAIAAAUAAXpeqz8AAAAASUVORK5CYII=</p>
         */
        @NameInMap("dataBase64")
        public String dataBase64;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("mediaType")
        public String mediaType;

        public static CreateAgentConversationRequestInitialMessageImages build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentConversationRequestInitialMessageImages self = new CreateAgentConversationRequestInitialMessageImages();
            return TeaModel.build(map, self);
        }

        public CreateAgentConversationRequestInitialMessageImages setDataBase64(String dataBase64) {
            this.dataBase64 = dataBase64;
            return this;
        }
        public String getDataBase64() {
            return this.dataBase64;
        }

        public CreateAgentConversationRequestInitialMessageImages setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class CreateAgentConversationRequestInitialMessage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>告警发生于 10:00</p>
         */
        @NameInMap("clientContext")
        public String clientContext;

        @NameInMap("images")
        public java.util.List<CreateAgentConversationRequestInitialMessageImages> images;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请排查实例消息堆积原因</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>ticket_request</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <strong>example:</strong>
         * <p>ticket-request-example-001</p>
         */
        @NameInMap("ticketRequestId")
        public String ticketRequestId;

        public static CreateAgentConversationRequestInitialMessage build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentConversationRequestInitialMessage self = new CreateAgentConversationRequestInitialMessage();
            return TeaModel.build(map, self);
        }

        public CreateAgentConversationRequestInitialMessage setClientContext(String clientContext) {
            this.clientContext = clientContext;
            return this;
        }
        public String getClientContext() {
            return this.clientContext;
        }

        public CreateAgentConversationRequestInitialMessage setImages(java.util.List<CreateAgentConversationRequestInitialMessageImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<CreateAgentConversationRequestInitialMessageImages> getImages() {
            return this.images;
        }

        public CreateAgentConversationRequestInitialMessage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateAgentConversationRequestInitialMessage setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public CreateAgentConversationRequestInitialMessage setTicketRequestId(String ticketRequestId) {
            this.ticketRequestId = ticketRequestId;
            return this;
        }
        public String getTicketRequestId() {
            return this.ticketRequestId;
        }

    }

}
