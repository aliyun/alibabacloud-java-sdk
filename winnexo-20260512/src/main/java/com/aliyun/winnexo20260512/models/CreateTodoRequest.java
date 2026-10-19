// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoRequest extends TeaModel {
    /**
     * <p>处理人平台用户ID列表（1~100，去重后生效）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("assigneeUserIds")
    public java.util.List<String> assigneeUserIds;

    /**
     * <p>协作空间 ID（可选）</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>优先级</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>问题清单（1~N）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("questions")
    public java.util.List<CreateTodoRequestQuestions> questions;

    /**
     * <p>来源上下文（原样透传落库，不校验）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceContext")
    public java.util.Map<String, ?> sourceContext;

    /**
     * <p>待办来源（仅 OPEN_API）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN_API</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办标题（≤200 字）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>治理审批</p>
     */
    @NameInMap("title")
    public String title;

    public static CreateTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoRequest self = new CreateTodoRequest();
        return TeaModel.build(map, self);
    }

    public CreateTodoRequest setAssigneeUserIds(java.util.List<String> assigneeUserIds) {
        this.assigneeUserIds = assigneeUserIds;
        return this;
    }
    public java.util.List<String> getAssigneeUserIds() {
        return this.assigneeUserIds;
    }

    public CreateTodoRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateTodoRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateTodoRequest setQuestions(java.util.List<CreateTodoRequestQuestions> questions) {
        this.questions = questions;
        return this;
    }
    public java.util.List<CreateTodoRequestQuestions> getQuestions() {
        return this.questions;
    }

    public CreateTodoRequest setSourceContext(java.util.Map<String, ?> sourceContext) {
        this.sourceContext = sourceContext;
        return this;
    }
    public java.util.Map<String, ?> getSourceContext() {
        return this.sourceContext;
    }

    public CreateTodoRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateTodoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTodoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateTodoRequestQuestionsOptions extends TeaModel {
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
         * <p>This parameter is required.</p>
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

        public static CreateTodoRequestQuestionsOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoRequestQuestionsOptions self = new CreateTodoRequestQuestionsOptions();
            return TeaModel.build(map, self);
        }

        public CreateTodoRequestQuestionsOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTodoRequestQuestionsOptions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CreateTodoRequestQuestionsOptions setRecommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }
        public Boolean getRecommended() {
            return this.recommended;
        }

    }

    public static class CreateTodoRequestQuestions extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_CHOICE</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>问题的选项列表；选择题必填，每项含选项文案（label）、补充说明（description）与是否推荐（recommended）</p>
         */
        @NameInMap("options")
        public java.util.List<CreateTodoRequestQuestionsOptions> options;

        /**
         * <p>TEXT 题占位符</p>
         * 
         * <strong>example:</strong>
         * <p>请输入</p>
         */
        @NameInMap("placeholder")
        public String placeholder;

        /**
         * <p>问题正文（引用键，清单内唯一）</p>
         * <p>This parameter is required.</p>
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

        public static CreateTodoRequestQuestions build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoRequestQuestions self = new CreateTodoRequestQuestions();
            return TeaModel.build(map, self);
        }

        public CreateTodoRequestQuestions setAllowCustom(Boolean allowCustom) {
            this.allowCustom = allowCustom;
            return this;
        }
        public Boolean getAllowCustom() {
            return this.allowCustom;
        }

        public CreateTodoRequestQuestions setCustomLabel(String customLabel) {
            this.customLabel = customLabel;
            return this;
        }
        public String getCustomLabel() {
            return this.customLabel;
        }

        public CreateTodoRequestQuestions setCustomMaxLength(Long customMaxLength) {
            this.customMaxLength = customMaxLength;
            return this;
        }
        public Long getCustomMaxLength() {
            return this.customMaxLength;
        }

        public CreateTodoRequestQuestions setCustomPlaceholder(String customPlaceholder) {
            this.customPlaceholder = customPlaceholder;
            return this;
        }
        public String getCustomPlaceholder() {
            return this.customPlaceholder;
        }

        public CreateTodoRequestQuestions setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public CreateTodoRequestQuestions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateTodoRequestQuestions setOptions(java.util.List<CreateTodoRequestQuestionsOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<CreateTodoRequestQuestionsOptions> getOptions() {
            return this.options;
        }

        public CreateTodoRequestQuestions setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public CreateTodoRequestQuestions setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public CreateTodoRequestQuestions setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

}
