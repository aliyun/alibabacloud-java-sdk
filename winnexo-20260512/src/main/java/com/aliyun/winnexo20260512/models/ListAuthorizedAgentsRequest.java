// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedAgentsRequest extends TeaModel {
    /**
     * <p>The userId of the responsible user.</p>
     * 
     * <strong>example:</strong>
     * <p>USE</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>The target user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("targetUserId")
    public Long targetUserId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAuthorizedAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAgentsRequest self = new ListAuthorizedAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAgentsRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ListAuthorizedAgentsRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public ListAuthorizedAgentsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
