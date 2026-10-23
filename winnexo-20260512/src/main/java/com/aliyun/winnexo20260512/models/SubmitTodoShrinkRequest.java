// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SubmitTodoShrinkRequest extends TeaModel {
    /**
     * <p>The array of answers. The original text of the question must match the to-do question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("answers")
    public String answersShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the to-do item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static SubmitTodoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTodoShrinkRequest self = new SubmitTodoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTodoShrinkRequest setAnswersShrink(String answersShrink) {
        this.answersShrink = answersShrink;
        return this;
    }
    public String getAnswersShrink() {
        return this.answersShrink;
    }

    public SubmitTodoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitTodoShrinkRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
