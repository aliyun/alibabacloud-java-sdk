// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to mark all to-do items as read. This parameter takes precedence over the todoIds parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("markAllRead")
    public Boolean markAllRead;

    /**
     * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of to-do item IDs. You can specify up to 100 IDs. This parameter is ignored if markAllRead is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoIds")
    public String todoIdsShrink;

    public static MarkTodosReadShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkTodosReadShrinkRequest self = new MarkTodosReadShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MarkTodosReadShrinkRequest setMarkAllRead(Boolean markAllRead) {
        this.markAllRead = markAllRead;
        return this;
    }
    public Boolean getMarkAllRead() {
        return this.markAllRead;
    }

    public MarkTodosReadShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MarkTodosReadShrinkRequest setTodoIdsShrink(String todoIdsShrink) {
        this.todoIdsShrink = todoIdsShrink;
        return this;
    }
    public String getTodoIdsShrink() {
        return this.todoIdsShrink;
    }

}
