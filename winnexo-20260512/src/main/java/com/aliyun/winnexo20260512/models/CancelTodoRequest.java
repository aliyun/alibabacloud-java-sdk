// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CancelTodoRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the to-do item. You must specify either this parameter or workItemId.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    /**
     * <p>The ID of the work item. You can use this parameter to cancel to-do items in batches by source. You must specify either this parameter or todoId.</p>
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
