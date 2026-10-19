// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TransferTodoShrinkRequest extends TeaModel {
    /**
     * <p>交接说明</p>
     * 
     * <strong>example:</strong>
     * <p>请继续处理</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>转办目标用户ID列表（1~100）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("targetUserIds")
    public String targetUserIdsShrink;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static TransferTodoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTodoShrinkRequest self = new TransferTodoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TransferTodoShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public TransferTodoShrinkRequest setTargetUserIdsShrink(String targetUserIdsShrink) {
        this.targetUserIdsShrink = targetUserIdsShrink;
        return this;
    }
    public String getTargetUserIdsShrink() {
        return this.targetUserIdsShrink;
    }

    public TransferTodoShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TransferTodoShrinkRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
