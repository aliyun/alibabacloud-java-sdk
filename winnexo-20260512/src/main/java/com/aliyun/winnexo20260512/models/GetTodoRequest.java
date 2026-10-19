// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoRequest extends TeaModel {
    /**
     * <p>assistant 消息ID（按消息反查多条）</p>
     * 
     * <strong>example:</strong>
     * <p>msg-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办ID（单条查询）</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    /**
     * <p>工作项ID（按来源反查多条）</p>
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
