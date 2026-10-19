// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CancelTodoRequest extends TeaModel {
    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办ID（与 workItemId 二选一）</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    /**
     * <p>工作项ID（按来源批量作废；与 todoId 二选一）</p>
     * 
     * <strong>example:</strong>
     * <p>wi_1</p>
     */
    @NameInMap("workItemId")
    public String workItemId;

    public static CancelTodoRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTodoRequest self = new CancelTodoRequest();
        return TeaModel.build(map, self);
    }

    public CancelTodoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CancelTodoRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public CancelTodoRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
