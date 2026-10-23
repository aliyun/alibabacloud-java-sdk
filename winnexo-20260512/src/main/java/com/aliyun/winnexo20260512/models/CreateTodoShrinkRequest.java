// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoShrinkRequest extends TeaModel {
    /**
     * <p>The list of platform user IDs of the assignees. You can specify 1 to 100 IDs. Duplicate IDs are automatically removed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("assigneeUserIds")
    public String assigneeUserIdsShrink;

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
    public String questionsShrink;

    /**
     * <p>The source context. The value is passed through and stored in the database as-is without validation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceContext")
    public String sourceContextShrink;

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

    public static CreateTodoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoShrinkRequest self = new CreateTodoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTodoShrinkRequest setAssigneeUserIdsShrink(String assigneeUserIdsShrink) {
        this.assigneeUserIdsShrink = assigneeUserIdsShrink;
        return this;
    }
    public String getAssigneeUserIdsShrink() {
        return this.assigneeUserIdsShrink;
    }

    public CreateTodoShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public CreateTodoShrinkRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateTodoShrinkRequest setQuestionsShrink(String questionsShrink) {
        this.questionsShrink = questionsShrink;
        return this;
    }
    public String getQuestionsShrink() {
        return this.questionsShrink;
    }

    public CreateTodoShrinkRequest setSourceContextShrink(String sourceContextShrink) {
        this.sourceContextShrink = sourceContextShrink;
        return this;
    }
    public String getSourceContextShrink() {
        return this.sourceContextShrink;
    }

    public CreateTodoShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateTodoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTodoShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
