// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TransferTodoRequest extends TeaModel {
    /**
     * <p>The handover note.</p>
     * 
     * <strong>example:</strong>
     * <p>Please continue processing</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The list of target user IDs for the transfer (1 to 100).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("targetUserIds")
    public java.util.List<String> targetUserIds;

    /**
     * <p>The to-do item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of target user IDs for the transfer (1 to 100).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static TransferTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTodoRequest self = new TransferTodoRequest();
        return TeaModel.build(map, self);
    }

    public TransferTodoRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public TransferTodoRequest setTargetUserIds(java.util.List<String> targetUserIds) {
        this.targetUserIds = targetUserIds;
        return this;
    }
    public java.util.List<String> getTargetUserIds() {
        return this.targetUserIds;
    }

    public TransferTodoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TransferTodoRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
