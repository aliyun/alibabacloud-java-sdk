// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoDetailResponseBody extends TeaModel {
    /**
     * <p>处理人数量</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("assigneeCount")
    public Long assigneeCount;

    /**
     * <p>全部处理人</p>
     */
    @NameInMap("assignees")
    public java.util.List<GetTodoDetailResponseBodyAssignees> assignees;

    /**
     * <p>附件策略（当前版本附件不落库）</p>
     * 
     * <strong>example:</strong>
     * <p>allowUpload=true</p>
     */
    @NameInMap("attachmentPolicy")
    public java.util.Map<String, ?> attachmentPolicy;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>完成时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>完成人用户ID；未完成为空</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("completedByUserId")
    public String completedByUserId;

    /**
     * <p>完成人姓名；未完成为空</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("completedByUserName")
    public String completedByUserName;

    /**
     * <p>创建时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>最后修改时间（北京时间 YYYY-MM-DD HH:mm:ss）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12 10:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>调用者是否已读</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isRead")
    public Boolean isRead;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>发出该待办的 assistant 消息ID；无会话来源为空</p>
     * 
     * <strong>example:</strong>
     * <p>msg-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>调用者的处理人行状态</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("myAssigneeStatus")
    public String myAssigneeStatus;

    /**
     * <p>调用者的列表展示状态</p>
     * 
     * <strong>example:</strong>
     * <p>TODO</p>
     */
    @NameInMap("myDisplayState")
    public String myDisplayState;

    /**
     * <p>调用者权限（canSubmit/canTransfer）</p>
     * 
     * <strong>example:</strong>
     * <p>APP/VIEW=true</p>
     */
    @NameInMap("myPermissions")
    public java.util.Map<String, ?> myPermissions;

    /**
     * <p>优先级</p>
     * 
     * <strong>example:</strong>
     * <p>HIGH</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>问题清单（结构化投影）</p>
     */
    @NameInMap("questions")
    public java.util.List<GetTodoDetailResponseBodyQuestions> questions;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>作答内容（JSONB 原样；未提交为空对象缺省）</p>
     * 
     * <strong>example:</strong>
     * <p>result=同意</p>
     */
    @NameInMap("resultPayload")
    public java.util.Map<String, ?> resultPayload;

    /**
     * <p>来源上下文（创建时原样透传）</p>
     * 
     * <strong>example:</strong>
     * <p>source=openapi</p>
     */
    @NameInMap("sourceContext")
    public java.util.Map<String, ?> sourceContext;

    /**
     * <p>待办来源类型</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>工作流ID（sourceType=WORKFLOW 时必有）</p>
     * 
     * <strong>example:</strong>
     * <p>wf-1</p>
     */
    @NameInMap("sourceWorkflowId")
    public String sourceWorkflowId;

    /**
     * <p>待办主状态</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>待办摘要</p>
     * 
     * <strong>example:</strong>
     * <p>请审批以下事项</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>待办标题</p>
     * 
     * <strong>example:</strong>
     * <p>治理审批</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>待办ID</p>
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
         * <p>处理时间（北京时间）；未处理为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("actedAt")
        public String actedAt;

        /**
         * <p>处理人来源：ORIGINAL/TRANSFERRED</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("assigneeSource")
        public String assigneeSource;

        /**
         * <p>处理人用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("assigneeUserId")
        public String assigneeUserId;

        /**
         * <p>已读时间（北京时间）；未读为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:01:00</p>
         */
        @NameInMap("readAt")
        public String readAt;

        /**
         * <p>处理人行状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>转出人用户ID；仅转办产生</p>
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
         * <p>选项补充说明</p>
         * 
         * <strong>example:</strong>
         * <p>选项补充说明</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>选项文案（引用键）</p>
         * 
         * <strong>example:</strong>
         * <p>通过</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>是否推荐</p>
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
         * <p>是否允许自定义输入</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowCustom")
        public Boolean allowCustom;

        /**
         * <p>自定义输入项文案</p>
         * 
         * <strong>example:</strong>
         * <p>其他</p>
         */
        @NameInMap("customLabel")
        public String customLabel;

        /**
         * <p>自定义输入长度上限</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("customMaxLength")
        public Long customMaxLength;

        /**
         * <p>自定义输入占位符</p>
         * 
         * <strong>example:</strong>
         * <p>请说明</p>
         */
        @NameInMap("customPlaceholder")
        public String customPlaceholder;

        /**
         * <p>TEXT 题长度上限</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("maxLength")
        public Long maxLength;

        /**
         * <p>作答形态：SINGLE_CHOICE/MULTI_CHOICE/TEXT</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_CHOICE</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>选项（选择类必有）</p>
         */
        @NameInMap("options")
        public java.util.List<GetTodoDetailResponseBodyQuestionsOptions> options;

        /**
         * <p>TEXT 题占位符</p>
         * 
         * <strong>example:</strong>
         * <p>请输入</p>
         */
        @NameInMap("placeholder")
        public String placeholder;

        /**
         * <p>问题正文（引用键）</p>
         * 
         * <strong>example:</strong>
         * <p>是否通过审批</p>
         */
        @NameInMap("question")
        public String question;

        /**
         * <p>是否必答</p>
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
