// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoDetailRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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

    public static GetTodoDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTodoDetailRequest self = new GetTodoDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTodoDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetTodoDetailRequest setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
