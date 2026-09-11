// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAliDingGroupMessagesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The file information.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAliDingGroupMessagesResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The time when the next plan is scheduled.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T09:01:00+08:00</p>
     */
    @NameInMap("nextTime")
    public String nextTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAliDingGroupMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliDingGroupMessagesResponseBody self = new ListAliDingGroupMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliDingGroupMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAliDingGroupMessagesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListAliDingGroupMessagesResponseBody setItems(java.util.List<ListAliDingGroupMessagesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAliDingGroupMessagesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAliDingGroupMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAliDingGroupMessagesResponseBody setNextTime(String nextTime) {
        this.nextTime = nextTime;
        return this;
    }
    public String getNextTime() {
        return this.nextTime;
    }

    public ListAliDingGroupMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAliDingGroupMessagesResponseBodyItemsAttachments extends TeaModel {
        /**
         * <p>The attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment-example</p>
         */
        @NameInMap("attachmentId")
        public String attachmentId;

        /**
         * <p>The attachment type.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("attachmentType")
        public String attachmentType;

        /**
         * <p>The execution duration of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("durationMs")
        public Long durationMs;

        /**
         * <p>The new file name. This parameter is optional. If you do not specify this parameter or set it to an empty string, the original file name is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Plan.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The file size, in <strong>bytes</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The thumbnail height, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("height")
        public Long height;

        /**
         * <p>The media type. The file name extension is in uppercase, such as XLS, DOC, DOCX, PDF, or XLSX.</p>
         * 
         * <strong>example:</strong>
         * <p>application/pdf</p>
         */
        @NameInMap("mimeType")
        public String mimeType;

        /**
         * <p>The image width, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("width")
        public Long width;

        public static ListAliDingGroupMessagesResponseBodyItemsAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListAliDingGroupMessagesResponseBodyItemsAttachments self = new ListAliDingGroupMessagesResponseBodyItemsAttachments();
            return TeaModel.build(map, self);
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setAttachmentType(String attachmentType) {
            this.attachmentType = attachmentType;
            return this;
        }
        public String getAttachmentType() {
            return this.attachmentType;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public ListAliDingGroupMessagesResponseBodyItemsAttachments setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class ListAliDingGroupMessagesResponseBodyItems extends TeaModel {
        /**
         * <p>The comment attachments.</p>
         */
        @NameInMap("attachments")
        public java.util.List<ListAliDingGroupMessagesResponseBodyItemsAttachments> attachments;

        /**
         * <p>The returned content.</p>
         * 
         * <strong>example:</strong>
         * <p>See the attachment</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08 09:01:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-example</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><strong>MARKDOWN</strong>: Markdown message.</li>
         * <li><strong>ACTIONCARD</strong>: card message.</li>
         * </ul>
         * <blockquote>
         * <p>Markdown messages do not support message buttons.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The DingTalk ID of the business-side customer service representative.</p>
         * 
         * <strong>example:</strong>
         * <p>user-example</p>
         */
        @NameInMap("senderId")
        public String senderId;

        /**
         * <p>The name of the message sender.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("senderName")
        public String senderName;

        public static ListAliDingGroupMessagesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAliDingGroupMessagesResponseBodyItems self = new ListAliDingGroupMessagesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAliDingGroupMessagesResponseBodyItems setAttachments(java.util.List<ListAliDingGroupMessagesResponseBodyItemsAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<ListAliDingGroupMessagesResponseBodyItemsAttachments> getAttachments() {
            return this.attachments;
        }

        public ListAliDingGroupMessagesResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAliDingGroupMessagesResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAliDingGroupMessagesResponseBodyItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListAliDingGroupMessagesResponseBodyItems setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ListAliDingGroupMessagesResponseBodyItems setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListAliDingGroupMessagesResponseBodyItems setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

    }

}
