// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoShrinkRequest extends TeaModel {
    /**
     * <p>处理人平台用户ID列表（1~100，去重后生效）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("assigneeUserIds")
    public String assigneeUserIdsShrink;

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
    public String questionsShrink;

    /**
     * <p>来源上下文（原样透传落库，不校验）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceContext")
    public String sourceContextShrink;

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
