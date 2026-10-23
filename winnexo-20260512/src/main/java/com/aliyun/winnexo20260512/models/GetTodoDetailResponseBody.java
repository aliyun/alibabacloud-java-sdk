// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoDetailResponseBody extends TeaModel {
    /**
     * <p>The number of assignees.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("assigneeCount")
    public Long assigneeCount;

    /**
     * <p>All assignees.</p>
     */
    @NameInMap("assignees")
    public java.util.List<GetTodoDetailResponseBodyAssignees> assignees;

    /**
     * <p>The attachment policy. Attachments are not stored in the database in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>allowUpload=true</p>
     */
    @NameInMap("attachmentPolicy")
    public java.util.Map<String, ?> attachmentPolicy;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The completion time in UTC+8 (YYYY-MM-DD HH:mm:ss).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>The user ID of the user who completed the item. This field is empty if the item is not completed.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("completedByUserId")
    public String completedByUserId;

    /**
     * <p>The name of the user who completed the item. This field is empty if the item is not completed.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("completedByUserName")
    public String completedByUserName;

    /**
     * <p>The creation time in UTC+8 (YYYY-MM-DD HH:mm:ss).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The last modification time in UTC+8 (YYYY-MM-DD HH:mm:ss).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether the caller has read the item.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isRead")
    public Boolean isRead;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the assistant message that generated the to-do item. This field is empty if there is no conversation source.</p>
     * 
     * <strong>example:</strong>
     * <p>msg-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The action status of the caller as the assignee.</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("myAssigneeStatus")
    public String myAssigneeStatus;

    /**
     * <p>The list display status for the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("myDisplayState")
    public String myDisplayState;

    /**
     * <p>The permissions of the caller, such as canSubmit and canTransfer.</p>
     * 
     * <strong>example:</strong>
     * <p>APP/VIEW=true</p>
     */
    @NameInMap("myPermissions")
    public java.util.Map<String, ?> myPermissions;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>The list of questions (structured projection).</p>
     */
    @NameInMap("questions")
    public java.util.List<GetTodoDetailResponseBodyQuestions> questions;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response content in JSONB format as-is. Defaults to an empty object if not submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>result=Approved</p>
     */
    @NameInMap("resultPayload")
    public java.util.Map<String, ?> resultPayload;

    /**
     * <p>The source context. This context is passed through as-is during creation.</p>
     * 
     * <strong>example:</strong>
     * <p>source=openapi</p>
     */
    @NameInMap("sourceContext")
    public java.util.Map<String, ?> sourceContext;

    /**
     * <p>The source type of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The workflow ID. This field is required when sourceType is set to WORKFLOW.</p>
     * 
     * <strong>example:</strong>
     * <p>wf-1</p>
     */
    @NameInMap("sourceWorkflowId")
    public String sourceWorkflowId;

    /**
     * <p>The primary status of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The summary of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>Please approve the following items</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The title of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>Governance approval</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The ID of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static GetTodoDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTodoDetailResponseBody self = new GetTodoDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTodoDetailResponseBody setAssigneeCount(Long assigneeCount) {
        this.assigneeCount = assigneeCount;
        return this;
    }
    public Long getAssigneeCount() {
        return this.assigneeCount;
    }

    public GetTodoDetailResponseBody setAssignees(java.util.List<GetTodoDetailResponseBodyAssignees> assignees) {
        this.assignees = assignees;
        return this;
    }
    public java.util.List<GetTodoDetailResponseBodyAssignees> getAssignees() {
        return this.assignees;
    }

    public GetTodoDetailResponseBody setAttachmentPolicy(java.util.Map<String, ?> attachmentPolicy) {
        this.attachmentPolicy = attachmentPolicy;
        return this;
    }
    public java.util.Map<String, ?> getAttachmentPolicy() {
        return this.attachmentPolicy;
    }

    public GetTodoDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTodoDetailResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public GetTodoDetailResponseBody setCompletedByUserId(String completedByUserId) {
        this.completedByUserId = completedByUserId;
        return this;
    }
    public String getCompletedByUserId() {
        return this.completedByUserId;
    }

    public GetTodoDetailResponseBody setCompletedByUserName(String completedByUserName) {
        this.completedByUserName = completedByUserName;
        return this;
    }
    public String getCompletedByUserName() {
        return this.completedByUserName;
    }

    public GetTodoDetailResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetTodoDetailResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetTodoDetailResponseBody setIsRead(Boolean isRead) {
        this.isRead = isRead;
        return this;
    }
    public Boolean getIsRead() {
        return this.isRead;
    }

    public GetTodoDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTodoDetailResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public GetTodoDetailResponseBody setMyAssigneeStatus(String myAssigneeStatus) {
        this.myAssigneeStatus = myAssigneeStatus;
        return this;
    }
    public String getMyAssigneeStatus() {
        return this.myAssigneeStatus;
    }

    public GetTodoDetailResponseBody setMyDisplayState(String myDisplayState) {
        this.myDisplayState = myDisplayState;
        return this;
    }
    public String getMyDisplayState() {
        return this.myDisplayState;
    }

    public GetTodoDetailResponseBody setMyPermissions(java.util.Map<String, ?> myPermissions) {
        this.myPermissions = myPermissions;
        return this;
    }
    public java.util.Map<String, ?> getMyPermissions() {
        return this.myPermissions;
    }

    public GetTodoDetailResponseBody setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public GetTodoDetailResponseBody setQuestions(java.util.List<GetTodoDetailResponseBodyQuestions> questions) {
        this.questions = questions;
        return this;
    }
    public java.util.List<GetTodoDetailResponseBodyQuestions> getQuestions() {
        return this.questions;
    }

    public GetTodoDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTodoDetailResponseBody setResultPayload(java.util.Map<String, ?> resultPayload) {
        this.resultPayload = resultPayload;
        return this;
    }
    public java.util.Map<String, ?> getResultPayload() {
        return this.resultPayload;
    }

    public GetTodoDetailResponseBody setSourceContext(java.util.Map<String, ?> sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }
    public java.util.Map<String, ?> getSourceContext() {
        return this.sourceContext;
    }

    public GetTodoDetailResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetTodoDetailResponseBody setSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        return this;
    }
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
    }

    public GetTodoDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTodoDetailResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public GetTodoDetailResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetTodoDetailResponseBody setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public static class GetTodoDetailResponseBodyAssignees extends TeaModel {
        /**
         * <p>The action time in UTC+8. This field is empty if the item is not processed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("actedAt")
        public String actedAt;

        /**
         * <p>The source of the assignee. Valid values: ORIGINAL and TRANSFERRED.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("assigneeSource")
        public String assigneeSource;

        /**
         * <p>The user ID of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("assigneeUserId")
        public String assigneeUserId;

        /**
         * <p>The read time in UTC+8. This field is empty if the item is unread.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:01:00</p>
         */
        @NameInMap("readAt")
        public String readAt;

        /**
         * <p>The action status of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The user ID of the user who transferred the task. This field is populated only when the task is transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("transferredFromUserId")
        public String transferredFromUserId;

        public static GetTodoDetailResponseBodyAssignees build(java.util.Map<String, ?> map) throws Exception {
            GetTodoDetailResponseBodyAssignees self = new GetTodoDetailResponseBodyAssignees();
            return TeaModel.build(map, self);
        }

        public GetTodoDetailResponseBodyAssignees setActedAt(String actedAt) {
            this.actedAt = actedAt;
            return this;
        }
        public String getActedAt() {
            return this.actedAt;
        }

        public GetTodoDetailResponseBodyAssignees setAssigneeSource(String assigneeSource) {
            this.assigneeSource = assigneeSource;
            return this;
        }
        public String getAssigneeSource() {
            return this.assigneeSource;
        }

        public GetTodoDetailResponseBodyAssignees setAssigneeUserId(String assigneeUserId) {
            this.assigneeUserId = assigneeUserId;
            return this;
        }
        public String getAssigneeUserId() {
            return this.assigneeUserId;
        }

        public GetTodoDetailResponseBodyAssignees setReadAt(String readAt) {
            this.readAt = readAt;
            return this;
        }
        public String getReadAt() {
            return this.readAt;
        }

        public GetTodoDetailResponseBodyAssignees setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTodoDetailResponseBodyAssignees setTransferredFromUserId(String transferredFromUserId) {
            this.transferredFromUserId = transferredFromUserId;
            return this;
        }
        public String getTransferredFromUserId() {
            return this.transferredFromUserId;
        }

    }

    public static class GetTodoDetailResponseBodyQuestionsOptions extends TeaModel {
        /**
         * <p>The supplementary description of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplementary description of the option</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The option text (reference key).</p>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>Indicates whether the option is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("recommended")
        public Boolean recommended;

        public static GetTodoDetailResponseBodyQuestionsOptions build(java.util.Map<String, ?> map) throws Exception {
            GetTodoDetailResponseBodyQuestionsOptions self = new GetTodoDetailResponseBodyQuestionsOptions();
            return TeaModel.build(map, self);
        }

        public GetTodoDetailResponseBodyQuestionsOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTodoDetailResponseBodyQuestionsOptions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTodoDetailResponseBodyQuestionsOptions setRecommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }
        public Boolean getRecommended() {
            return this.recommended;
        }

    }

    public static class GetTodoDetailResponseBodyQuestions extends TeaModel {
        /**
         * <p>Indicates whether custom input is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowCustom")
        public Boolean allowCustom;

        /**
         * <p>The text for the custom input field.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("customLabel")
        public String customLabel;

        /**
         * <p>The maximum length for custom input.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("customMaxLength")
        public Long customMaxLength;

        /**
         * <p>The placeholder for custom input.</p>
         * 
         * <strong>example:</strong>
         * <p>Please specify</p>
         */
        @NameInMap("customPlaceholder")
        public String customPlaceholder;

        /**
         * <p>The maximum length for text questions.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("maxLength")
        public Long maxLength;

        /**
         * <p>The response mode. Valid values: SINGLE_CHOICE, MULTI_CHOICE, and TEXT.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_CHOICE</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The options. This field is required for choice questions.</p>
         */
        @NameInMap("options")
        public java.util.List<GetTodoDetailResponseBodyQuestionsOptions> options;

        /**
         * <p>The placeholder for text questions.</p>
         * 
         * <strong>example:</strong>
         * <p>Please enter</p>
         */
        @NameInMap("placeholder")
        public String placeholder;

        /**
         * <p>The question text (reference key).</p>
         * 
         * <strong>example:</strong>
         * <p>Whether to approve</p>
         */
        @NameInMap("question")
        public String question;

        /**
         * <p>Indicates whether the question is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        public static GetTodoDetailResponseBodyQuestions build(java.util.Map<String, ?> map) throws Exception {
            GetTodoDetailResponseBodyQuestions self = new GetTodoDetailResponseBodyQuestions();
            return TeaModel.build(map, self);
        }

        public GetTodoDetailResponseBodyQuestions setAllowCustom(Boolean allowCustom) {
            this.allowCustom = allowCustom;
            return this;
        }
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        public GetTodoDetailResponseBodyQuestions setCustomLabel(String customLabel) {
            this.customLabel = customLabel;
            return this;
        }
        public String getCustomLabel() {
            return this.customLabel;
        }

        public GetTodoDetailResponseBodyQuestions setCustomMaxLength(Long customMaxLength) {
            this.customMaxLength = customMaxLength;
            return this;
        }
        public Long getCustomMaxLength() {
            return this.customMaxLength;
        }

        public GetTodoDetailResponseBodyQuestions setCustomPlaceholder(String customPlaceholder) {
            this.customPlaceholder = customPlaceholder;
            return this;
        }
        public String getCustomPlaceholder() {
            return this.customPlaceholder;
        }

        public GetTodoDetailResponseBodyQuestions setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public GetTodoDetailResponseBodyQuestions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetTodoDetailResponseBodyQuestions setOptions(java.util.List<GetTodoDetailResponseBodyQuestionsOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<GetTodoDetailResponseBodyQuestionsOptions> getOptions() {
            return this.options;
        }

        public GetTodoDetailResponseBodyQuestions setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public GetTodoDetailResponseBodyQuestions setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public GetTodoDetailResponseBodyQuestions setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
