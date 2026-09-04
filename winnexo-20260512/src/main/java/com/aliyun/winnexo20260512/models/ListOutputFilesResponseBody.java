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
     * <p>The prompt message.</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of outputs that match the specified conditions.</p>
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
         * <p>The email body.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <p>The content type, such as MARKDOWN/JSONML/HTML.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The recipient list.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("recipients")
        public java.util.List<String> recipients;

        /**
         * <p>The email subject.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
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
         * <p>Sample description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file path (OSS object key).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The file type, such as .pdf or .md.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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
         * <p>1</p>
         */
        @NameInMap("completedSlides")
        public Long completedSlides;

        /**
         * <p>The PPT file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>examplePptId</p>
         */
        @NameInMap("pptId")
        public String pptId;

        /**
         * <p>The PPT name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("pptName")
        public String pptName;

        /**
         * <p>The total number of slides.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The email information. This field is present when the output type is email.</p>
         */
        @NameInMap("emailInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsEmailInfo emailInfo;

        /**
         * <p>The file information. This field is present when the output type is file.</p>
         */
        @NameInMap("fileInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsFileInfo fileInfo;

        /**
         * <p>The database creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The database update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleItemName</p>
         */
        @NameInMap("itemName")
        public String itemName;

        /**
         * <p>The type of the output item. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>ppt</p>
         */
        @NameInMap("itemType")
        public String itemType;

        /**
         * <p>The internationalized display name of the output detail type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("itemTypeDisplayName")
        public String itemTypeDisplayName;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleMessageId</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The output detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>string_example_value</p>
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
         * <p>The share token that is present when sharing is enabled. You can use this token to access the public share preview API.</p>
         * 
         * <strong>example:</strong>
         * <p>example_share_token</p>
         */
        @NameInMap("shareToken")
        public String shareToken;

        /**
         * <p>The skill output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSkillOutputId</p>
         */
        @NameInMap("skillOutputId")
        public String skillOutputId;

        /**
         * <p>The slides information. This field is present when the output type is slides.</p>
         */
        @NameInMap("slidesInfo")
        public ListOutputFilesResponseBodyItemsOutputItemsSlidesInfo slidesInfo;

        /**
         * <p>The task execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTaskExecutionId</p>
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
         * <p>exampleConversationId</p>
         */
        @NameInMap("conversationId")
        public String conversationId;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The output name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the digital employee (operating object).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public String operatingObjectName;

        /**
         * <p>The output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputId</p>
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
         * <p>The internationalized display name of the output type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("outputTypeDisplayName")
        public String outputTypeDisplayName;

        /**
         * <p>The skill output ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSkillOutputId</p>
         */
        @NameInMap("skillOutputId")
        public String skillOutputId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>string_example_value</p>
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
