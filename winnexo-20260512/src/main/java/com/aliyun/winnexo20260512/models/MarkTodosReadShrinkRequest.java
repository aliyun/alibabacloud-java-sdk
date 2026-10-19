// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadShrinkRequest extends TeaModel {
    /**
     * <p>全部标记已读（优先于 todoIds）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("markAllRead")
    public Boolean markAllRead;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>待办ID列表（≤100；markAllRead=true 时忽略）</p>
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
