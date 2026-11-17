// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListChatMessageContentsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Specifies whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The list of MCP cards.</p>
     */
    @NameInMap("items")
    public java.util.List<ListChatMessageContentsResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The maximum number of data records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-chat-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the original project.</p>
     * 
     * <strong>example:</strong>
     * <p>source-chat-1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListChatMessageContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatMessageContentsResponseBody self = new ListChatMessageContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatMessageContentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatMessageContentsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListChatMessageContentsResponseBody setItems(java.util.List<ListChatMessageContentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListChatMessageContentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListChatMessageContentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatMessageContentsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListChatMessageContentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChatMessageContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatMessageContentsResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListChatMessageContentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListChatMessageContentsResponseBodyItemsAttachments extends TeaModel {
        /**
         * <p>The ID of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>file-1</p>
         */
        @NameInMap("attachmentId")
        public String attachmentId;

        /**
         * <p>The total number of characters in the content.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("charCount")
        public Long charCount;

        /**
         * <p>The number of chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("chunkCount")
        public Integer chunkCount;

        /**
         * <p>The content of the user message.</p>
         * 
         * <strong>example:</strong>
         * <p>Attachment content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The reason why the content is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("emptyReason")
        public String emptyReason;

        /**
         * <p>The failure code of the batch. Valid values:</p>
         * <ul>
         * <li>ARREARAGE: The account has an overdue payment.</li>
         * <li>NO_TARGET: No valid inspection instance is available.</li>
         * <li>TIMEOUT: The batch execution timed out.</li>
         * <li>SYSTEM_ERROR: A system error occurred.</li>
         * <li>ALL_INSTANCE_FAILED: All instance inspections failed.</li>
         * </ul>
         * <p>This parameter is empty if the batch does not fail.</p>
         * 
         * <strong>example:</strong>
         * <p>ARREARAGE</p>
         */
        @NameInMap("failureCode")
        public String failureCode;

        /**
         * <p>The failure summary of the asynchronous task. This parameter is not returned if no failure information is available. You can use the taskId and requestId to troubleshoot the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduling failed</p>
         */
        @NameInMap("failureReason")
        public String failureReason;

        /**
         * <p>The new file name. This parameter is optional. If you do not specify this parameter or specify an empty string, the original file name is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly_Report.pdf</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>Specifies whether the standard package instance is found.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("found")
        public Boolean found;

        /**
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The type of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("modality")
        public String modality;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Online.</li>
         * <li><strong>0</strong>: Offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PARSED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether the scan result is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("truncated")
        public Boolean truncated;

        public static ListChatMessageContentsResponseBodyItemsAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListChatMessageContentsResponseBodyItemsAttachments self = new ListChatMessageContentsResponseBodyItemsAttachments();
            return TeaModel.build(map, self);
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setCharCount(Long charCount) {
            this.charCount = charCount;
            return this;
        }
        public Long getCharCount() {
            return this.charCount;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setChunkCount(Integer chunkCount) {
            this.chunkCount = chunkCount;
            return this;
        }
        public Integer getChunkCount() {
            return this.chunkCount;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setEmptyReason(String emptyReason) {
            this.emptyReason = emptyReason;
            return this;
        }
        public String getEmptyReason() {
            return this.emptyReason;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setFailureCode(String failureCode) {
            this.failureCode = failureCode;
            return this;
        }
        public String getFailureCode() {
            return this.failureCode;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setFound(Boolean found) {
            this.found = found;
            return this;
        }
        public Boolean getFound() {
            return this.found;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setModality(String modality) {
            this.modality = modality;
            return this;
        }
        public String getModality() {
            return this.modality;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListChatMessageContentsResponseBodyItemsAttachments setTruncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }
        public Boolean getTruncated() {
            return this.truncated;
        }

    }

    public static class ListChatMessageContentsResponseBodyItems extends TeaModel {
        /**
         * <p>The content type. Valid values:</p>
         * <ul>
         * <li>0: Text.</li>
         * <li>1: Image material.</li>
         * <li>2: Handwritten text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("attachments")
        public java.util.List<ListChatMessageContentsResponseBodyItemsAttachments> attachments;

        /**
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><strong>MARKDOWN</strong>: Markdown message.</li>
         * <li><strong>ACTIONCARD</strong>: Card message.</li>
         * </ul>
         * <blockquote>
         * <p>Message buttons cannot be used in Markdown messages.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The ID of the service record.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("recordId")
        public Long recordId;

        /**
         * <p>The DingTalk ID of the customer service representative.</p>
         * 
         * <strong>example:</strong>
         * <p>sender-1</p>
         */
        @NameInMap("senderId")
        public String senderId;

        /**
         * <p>The name of the message sender.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("senderName")
        public String senderName;

        /**
         * <p>The time when the message was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-09T10:00:00+08:00</p>
         */
        @NameInMap("sentAt")
        public String sentAt;

        /**
         * <p>The batch text to be translated.</p>
         * 
         * <strong>example:</strong>
         * <p>Please check the attachment</p>
         */
        @NameInMap("text")
        public String text;

        public static ListChatMessageContentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListChatMessageContentsResponseBodyItems self = new ListChatMessageContentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListChatMessageContentsResponseBodyItems setAttachments(java.util.List<ListChatMessageContentsResponseBodyItemsAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<ListChatMessageContentsResponseBodyItemsAttachments> getAttachments() {
            return this.attachments;
        }

        public ListChatMessageContentsResponseBodyItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListChatMessageContentsResponseBodyItems setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ListChatMessageContentsResponseBodyItems setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListChatMessageContentsResponseBodyItems setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListChatMessageContentsResponseBodyItems setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public ListChatMessageContentsResponseBodyItems setSentAt(String sentAt) {
            this.sentAt = sentAt;
            return this;
        }
        public String getSentAt() {
            return this.sentAt;
        }

        public ListChatMessageContentsResponseBodyItems setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
