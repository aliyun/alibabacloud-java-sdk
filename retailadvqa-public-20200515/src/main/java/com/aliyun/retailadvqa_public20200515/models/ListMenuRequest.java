// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListMenuRequest extends TeaModel {
    @NameInMap("RoleSign")
    public String roleSign;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMenuRequest self = new ListMenuRequest();
        return TeaModel.build(map, self);
    }

    public ListMenuRequest setRoleSign(String roleSign) {
        this.roleSign = roleSign;
        return this;
    }
    public String getRoleSign() {
        return this.roleSign;
    }

    public ListMenuRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListMenuRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMenuRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
