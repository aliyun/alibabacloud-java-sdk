// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchCancelTodosShrinkRequest extends TeaModel {
    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of to-do IDs. You can specify 1 to 100 IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoIds")
    public String todoIdsShrink;

    public static BatchCancelTodosShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTodosShrinkRequest self = new BatchCancelTodosShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCancelTodosShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchCancelTodosShrinkRequest setTodoIdsShrink(String todoIdsShrink) {
        this.todoIdsShrink = todoIdsShrink;
        return this;
    }
    public String getTodoIdsShrink() {
        return this.todoIdsShrink;
    }

}
