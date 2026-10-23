// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoRequest extends TeaModel {
    /**
     * <p>The list of platform user IDs of the assignees. You can specify 1 to 100 IDs. Duplicate IDs are automatically removed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("assigneeUserIds")
    public java.util.List<String> assigneeUserIds;

    /**
     * <p>The ID of the collaboration workspace. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("priority")
    public String priority;

    /**
     * <p>The list of questions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("questions")
    public java.util.List<CreateTodoRequestQuestions> questions;

    /**
     * <p>The source context. The value is passed through and stored in the database as-is without validation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceContext")
    public java.util.Map<String, ?> sourceContext;

    /**
     * <p>The source of the to-do item. Only OPEN_API is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN_API</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The title of the to-do item. The maximum length is 200 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Governance approval</p>
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
         * <p>The supplementary description of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplementary description of the option</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The option text. This is a reference key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>Specifies whether the option is recommended.</p>
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
         * <p>Specifies whether custom input is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowCustom")
        public Boolean allowCustom;

        /**
         * <p>The text for the custom input item.</p>
         * 
         * <strong>example:</strong>
         * <p>Other</p>
         */
        @NameInMap("customLabel")
        public String customLabel;

        /**
         * <p>The maximum length of the custom input.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("customMaxLength")
        public Long customMaxLength;

        /**
         * <p>The placeholder for the custom input.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_CHOICE</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>The list of options for the question. This parameter is required for choice questions. Each option includes the option text (label), supplementary description (description), and whether it is recommended (recommended).</p>
         */
        @NameInMap("options")
        public java.util.List<CreateTodoRequestQuestionsOptions> options;

        /**
         * <p>The placeholder for text questions.</p>
         * 
         * <strong>example:</strong>
         * <p>Please enter</p>
         */
        @NameInMap("placeholder")
        public String placeholder;

        /**
         * <p>The question text. This is a reference key and must be unique within the list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Whether to approve the request</p>
         */
        @NameInMap("question")
        public String question;

        /**
         * <p>Specifies whether the question is required.</p>
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
