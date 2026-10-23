// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOutputFilesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The output list.</p>
     */
    @NameInMap("items")
    public java.util.List<ListOutputFilesResponseBodyItems> items;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
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
    public Long page;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-42d3-a456-426614174007</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of matching outputs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListOutputFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutputFilesResponseBody self = new ListOutputFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutputFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutputFilesResponseBody setItems(java.util.List<ListOutputFilesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListOutputFilesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListOutputFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutputFilesResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListOutputFilesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOutputFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOutputFilesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListOutputFilesResponseBodyItemsOutputItemsEmailInfo extends TeaModel {
        /**
         * <p>The email content.</p>
         * 
         * <strong>example:</strong>
         * <p>The quarterly business report has been generated. Please review</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <p>The content type, such as MARKDOWN, JSONML, or HTML.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKDOWN</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The recipient list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="mailto:reader@example.com">reader@example.com</a>&quot;]</p>
         */
        @NameInMap("recipients")
        public java.util.List<String> recipients;

        /**
         * <p>The email subject.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly business analysis report</p>
         */
        @NameInMap("subject")
        public String subject;

        public static ListOutputFilesResponseBodyItemsOutputItemsEmailInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOutputFilesResponseBodyItemsOutputItemsEmailInfo self = new ListOutputFilesResponseBodyItemsOutputItemsEmailInfo();
            return TeaModel.build(map, self);
        }

        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo setRecipients(java.util.List<String> recipients) {
            this.recipients = recipients;
            return this;
        }
        public java.util.List<String> getRecipients() {
            return this.recipients;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class ListOutputFilesResponseBodyItemsOutputItemsFileInfo extends TeaModel {
        /**
         * <p>The file description.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly revenue, cost, and trend analysis report</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly business analysis report.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file location. It is compatible with file URLs and legacy OSS object keys. The specific value is derived from the output registration information.</p>
         * 
         * <strong>example:</strong>
         * <p>reports/2026/quarterly-report.pdf</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The file type, such as .pdf or .md.</p>
         * 
         * <strong>example:</strong>
         * <p>.pdf</p>
         */
        @NameInMap("type")
        public String type;

        public static ListOutputFilesResponseBodyItemsOutputItemsFileInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOutputFilesResponseBodyItemsOutputItemsFileInfo self = new ListOutputFilesResponseBodyItemsOutputItemsFileInfo();
            return TeaModel.build(map, self);
        }

        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo extends TeaModel {
        /**
         * <p>The number of completed slides.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("completedSlides")
        public Long completedSlides;

        /**
         * <p>The PPT file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ppt_123e4567-e89b-42d3-a456-426614174015</p>
         */
        @NameInMap("pptId")
        public String pptId;

        /**
         * <p>The PPT name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly Business Analysis Report</p>
         */
        @NameInMap("pptName")
        public String pptName;

        /**
         * <p>The total number of slides.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSlides")
        public Long totalSlides;

        public static ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo self = new ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo();
            return TeaModel.build(map, self);
        }

        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo setCompletedSlides(Long completedSlides) {
            this.completedSlides = completedSlides;
            return this;
        }
        public Long getCompletedSlides() {
            return this.completedSlides;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo setPptId(String pptId) {
            this.pptId = pptId;
            return this;
        }
        public String getPptId() {
            return this.pptId;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo setPptName(String pptName) {
            this.pptName = pptName;
            return this;
        }
        public String getPptName() {
            return this.pptName;
        }

        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo setTotalSlides(Long totalSlides) {
            this.totalSlides = totalSlides;
            return this;
        }
        public Long getTotalSlides() {
            return this.totalSlides;
        }

    }

    public static class ListOutputFilesResponseBodyItemsOutputItems extends TeaModel {
        /**
         * <p>The creation time of the output detail, serialized from a backend datetime value into an ISO 8601 string, with time zone information returned along with the original value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T03:10:00+00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The email information, present when the type is email.</p>
         */
        @NameInMap("emailInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo emailInfo;

        /**
         * <p>The file information, present when the type is file.</p>
         */
        @NameInMap("fileInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo fileInfo;

        /**
         * <p>The creation time of the output or detail, serialized from a backend datetime value into an ISO 8601 string, with time zone information returned along with the original value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T03:10:00+00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time of the output or detail, serialized from a backend datetime value into an ISO 8601 string, with time zone information returned along with the original value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T03:12:00+00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly business analysis report.pdf</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The output item type. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>The internationalized display name of the output detail type.</p>
         * 
         * <strong>example:</strong>
         * <p>Document</p>
         */
        @NameInMap("itemTypeDisplayName")
        public String itemTypeDisplayName;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>msg_123e4567-e89b-42d3-a456-426614174012</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The output detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>item_123e4567-e89b-42d3-a456-426614174010</p>
         */
        @NameInMap("outputItemId")
        public String outputItemId;

        /**
         * <p>Indicates whether sharing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("shareEnabled")
        public Boolean shareEnabled;

        /**
         * <p>The share token, present when sharing is enabled. You can use this token to access the public share preview API.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_public_preview_token</p>
         */
        @NameInMap("shareToken")
        public String shareToken;

        /**
         * <p>The skill output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillout_123e4567-e89b-42d3-a456-426614174011</p>
         */
        @NameInMap("skillOutputId")
        public String skillOutputId;

        /**
         * <p>The slide deck information, present when the type is slide deck.</p>
         */
        @NameInMap("slidesInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo slidesInfo;

        /**
         * <p>The task execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>execution_123e4567-e89b-42d3-a456-426614174013</p>
         */
        @NameInMap("taskExecutionId")
        public String taskExecutionId;

        public static ListOutputFilesResponseBodyItemsOutputItems build(java.util.Map<String, ?> map) throws Exception {
            ListOutputFilesResponseBodyItemsOutputItems self = new ListOutputFilesResponseBodyItemsOutputItems();
            return TeaModel.build(map, self);
        }

        public ListOutputFilesResponseBodyItemsOutputItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setEmailInfo(ListOutputFilesResponseBodyItemsOutputItemsEmailInfo emailInfo) {
            this.emailInfo = emailInfo;
            return this;
        }
        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo getEmailInfo() {
            return this.emailInfo;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setFileInfo(ListOutputFilesResponseBodyItemsOutputItemsFileInfo fileInfo) {
            this.fileInfo = fileInfo;
            return this;
        }
        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo getFileInfo() {
            return this.fileInfo;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setItemTypeDisplayName(String itemTypeDisplayName) {
            this.itemTypeDisplayName = itemTypeDisplayName;
            return this;
        }
        public String getItemTypeDisplayName() {
            return this.itemTypeDisplayName;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setOutputItemId(String outputItemId) {
            this.outputItemId = outputItemId;
            return this;
        }
        public String getOutputItemId() {
            return this.outputItemId;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setShareEnabled(Boolean shareEnabled) {
            this.shareEnabled = shareEnabled;
            return this;
        }
        public Boolean getShareEnabled() {
            return this.shareEnabled;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setShareToken(String shareToken) {
            this.shareToken = shareToken;
            return this;
        }
        public String getShareToken() {
            return this.shareToken;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setSkillOutputId(String skillOutputId) {
            this.skillOutputId = skillOutputId;
            return this;
        }
        public String getSkillOutputId() {
            return this.skillOutputId;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setSlidesInfo(ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo slidesInfo) {
            this.slidesInfo = slidesInfo;
            return this;
        }
        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo getSlidesInfo() {
            return this.slidesInfo;
        }

        public ListOutputFilesResponseBodyItemsOutputItems setTaskExecutionId(String taskExecutionId) {
            this.taskExecutionId = taskExecutionId;
            return this;
        }
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

    }

    public static class ListOutputFilesResponseBodyItems extends TeaModel {
        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session_123e4567-e89b-42d3-a456-426614174008</p>
         */
        @NameInMap("conversationId")
        public String conversationId;

        /**
         * <p>The creation time of the output or detail, serialized from a backend datetime value into an ISO 8601 string, with time zone information returned along with the original value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T03:10:00+00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time of the output or detail, serialized from a backend datetime value into an ISO 8601 string, with time zone information returned along with the original value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T03:12:00+00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly business analysis report.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the digital worker (operating object).</p>
         * 
         * <strong>example:</strong>
         * <p>Business Analysis Assistant</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>The output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>output_123e4567-e89b-42d3-a456-426614174009</p>
         */
        @NameInMap("outputId")
        public String outputId;

        /**
         * <p>The output detail list.</p>
         */
        @NameInMap("outputItems")
        public java.util.List<ListOutputFilesResponseBodyItemsOutputItems> outputItems;

        /**
         * <p>The output type: <code>conversation/skill/task</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation</p>
         */
        @NameInMap("outputType")
        public String outputType;

        /**
         * <p>The localized display name of the output type.</p>
         * 
         * <strong>example:</strong>
         * <p>Conversation output</p>
         */
        @NameInMap("outputTypeDisplayName")
        public String outputTypeDisplayName;

        /**
         * <p>The skill output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillout_123e4567-e89b-42d3-a456-426614174011</p>
         */
        @NameInMap("skillOutputId")
        public String skillOutputId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task_123e4567-e89b-42d3-a456-426614174014</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static ListOutputFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListOutputFilesResponseBodyItems self = new ListOutputFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListOutputFilesResponseBodyItems setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListOutputFilesResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOutputFilesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListOutputFilesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOutputFilesResponseBodyItems setOperatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public ListOutputFilesResponseBodyItems setOutputId(String outputId) {
            this.outputId = outputId;
            return this;
        }
        public String getOutputId() {
            return this.outputId;
        }

        public ListOutputFilesResponseBodyItems setOutputItems(java.util.List<ListOutputFilesResponseBodyItemsOutputItems> outputItems) {
            this.outputItems = outputItems;
            return this;
        }
        public java.util.List<ListOutputFilesResponseBodyItemsOutputItems> getOutputItems() {
            return this.outputItems;
        }

        public ListOutputFilesResponseBodyItems setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public ListOutputFilesResponseBodyItems setOutputTypeDisplayName(String outputTypeDisplayName) {
            this.outputTypeDisplayName = outputTypeDisplayName;
            return this;
        }
        public String getOutputTypeDisplayName() {
            return this.outputTypeDisplayName;
        }

        public ListOutputFilesResponseBodyItems setSkillOutputId(String skillOutputId) {
            this.skillOutputId = skillOutputId;
            return this;
        }
        public String getSkillOutputId() {
            return this.skillOutputId;
        }

        public ListOutputFilesResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
