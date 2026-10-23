// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoRequest extends TeaModel {
    /**
     * <p>The ID of the assistant message. This parameter is used to query multiple to-do items by message.</p>
     * 
     * <strong>example:</strong>
     * <p>msg-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the to-do item (get).</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    /**
     * <p>The ID of the work item. This parameter is used to query multiple to-do items by source.</p>
     * 
     * <strong>example:</strong>
     * <p>wi_1</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static GetTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTodoRequest self = new GetTodoRequest();
        return TeaModel.build(map, self);
    }

    public GetTodoRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public GetTodoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetTodoRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public GetTodoRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
