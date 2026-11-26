// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If you specify this parameter, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>Specifies whether to mark all to-do items as read. This parameter takes precedence over todoIds.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("markAllRead")
    public Boolean markAllRead;

    /**
     * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxy user, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The list of to-do IDs. You can specify up to 100 IDs. This parameter is ignored when markAllRead is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The list of to-do IDs. You can specify up to 100 IDs. This parameter is ignored when markAllRead is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;todo_abc123&quot;,&quot;todo_def456&quot;]</p>
     */
    @NameInMap("todoIds")
    public java.util.List<String> todoIds;

    public static MarkTodosReadRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkTodosReadRequest self = new MarkTodosReadRequest();
        return TeaModel.build(map, self);
    }

    public MarkTodosReadRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public MarkTodosReadRequest setMarkAllRead(Boolean markAllRead) {
        this.markAllRead = markAllRead;
        return this;
    }
    public Boolean getMarkAllRead() {
        return this.markAllRead;
    }

    public MarkTodosReadRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public MarkTodosReadRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public MarkTodosReadRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MarkTodosReadRequest setTodoIds(java.util.List<String> todoIds) {
        this.todoIds = todoIds;
        return this;
    }
    public java.util.List<String> getTodoIds() {
        return this.todoIds;
    }

}
