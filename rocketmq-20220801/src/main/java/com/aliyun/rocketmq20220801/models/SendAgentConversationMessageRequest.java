// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class SendAgentConversationMessageRequest extends TeaModel {
    @NameInMap("attachments")
    public java.util.List<SendAgentConversationMessageRequestAttachments> attachments;

    /**
     * <strong>example:</strong>
     * <p>告警时间为 2026-08-19 19:30:00</p>
     */
    @NameInMap("clientContext")
    public String clientContext;

    @NameInMap("images")
    public java.util.List<SendAgentConversationMessageRequestImages> images;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>实例 rmq-cn-example 的消息为什么持续堆积？</p>
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

    public static SendAgentConversationMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAgentConversationMessageRequest self = new SendAgentConversationMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendAgentConversationMessageRequest setAttachments(java.util.List<SendAgentConversationMessageRequestAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<SendAgentConversationMessageRequestAttachments> getAttachments() {
        return this.attachments;
    }

    public SendAgentConversationMessageRequest setClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }
    public String getClientContext() {
        return this.clientContext;
    }

    public SendAgentConversationMessageRequest setImages(java.util.List<SendAgentConversationMessageRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<SendAgentConversationMessageRequestImages> getImages() {
        return this.images;
    }

    public SendAgentConversationMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendAgentConversationMessageRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendAgentConversationMessageRequest setTicketRequestId(String ticketRequestId) {
        this.ticketRequestId = ticketRequestId;
        return this;
    }
    public String getTicketRequestId() {
        return this.ticketRequestId;
    }

    public static class SendAgentConversationMessageRequestAttachments extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client.log</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("keptLines")
        public Long keptLines;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client_log</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-logs/0198c8a91f4d7f01a3c21e99/client.log</p>
         */
        @NameInMap("sandboxPath")
        public String sandboxPath;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>114</p>
         */
        @NameInMap("sizeBytes")
        public Long sizeBytes;

        /**
         * <strong>example:</strong>
         * <p>2026-09-12T11:00:00+08:00</p>
         */
        @NameInMap("timeRangeEnd")
        public String timeRangeEnd;

        /**
         * <strong>example:</strong>
         * <p>2026-09-12T10:00:00+08:00</p>
         */
        @NameInMap("timeRangeStart")
        public String timeRangeStart;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalLines")
        public Long totalLines;

        public static SendAgentConversationMessageRequestAttachments build(java.util.Map<String, ?> map) throws Exception {
            SendAgentConversationMessageRequestAttachments self = new SendAgentConversationMessageRequestAttachments();
            return TeaModel.build(map, self);
        }

        public SendAgentConversationMessageRequestAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SendAgentConversationMessageRequestAttachments setKeptLines(Long keptLines) {
            this.keptLines = keptLines;
            return this;
        }
        public Long getKeptLines() {
            return this.keptLines;
        }

        public SendAgentConversationMessageRequestAttachments setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public SendAgentConversationMessageRequestAttachments setSandboxPath(String sandboxPath) {
            this.sandboxPath = sandboxPath;
            return this;
        }
        public String getSandboxPath() {
            return this.sandboxPath;
        }

        public SendAgentConversationMessageRequestAttachments setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public SendAgentConversationMessageRequestAttachments setTimeRangeEnd(String timeRangeEnd) {
            this.timeRangeEnd = timeRangeEnd;
            return this;
        }
        public String getTimeRangeEnd() {
            return this.timeRangeEnd;
        }

        public SendAgentConversationMessageRequestAttachments setTimeRangeStart(String timeRangeStart) {
            this.timeRangeStart = timeRangeStart;
            return this;
        }
        public String getTimeRangeStart() {
            return this.timeRangeStart;
        }

        public SendAgentConversationMessageRequestAttachments setTotalLines(Long totalLines) {
            this.totalLines = totalLines;
            return this;
        }
        public Long getTotalLines() {
            return this.totalLines;
        }

    }

    public static class SendAgentConversationMessageRequestImages extends TeaModel {
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

        public static SendAgentConversationMessageRequestImages build(java.util.Map<String, ?> map) throws Exception {
            SendAgentConversationMessageRequestImages self = new SendAgentConversationMessageRequestImages();
            return TeaModel.build(map, self);
        }

        public SendAgentConversationMessageRequestImages setDataBase64(String dataBase64) {
            this.dataBase64 = dataBase64;
            return this;
        }
        public String getDataBase64() {
            return this.dataBase64;
        }

        public SendAgentConversationMessageRequestImages setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

}
