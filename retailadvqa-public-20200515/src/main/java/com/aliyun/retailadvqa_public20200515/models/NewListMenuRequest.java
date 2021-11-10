// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class NewListMenuRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("RoleSign")
    public String roleSign;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static NewListMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        NewListMenuRequest self = new NewListMenuRequest();
        return TeaModel.build(map, self);
    }

    public NewListMenuRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public NewListMenuRequest setRoleSign(String roleSign) {
        this.roleSign = roleSign;
        return this;
    }
    public String getRoleSign() {
        return this.roleSign;
    }

    public NewListMenuRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public NewListMenuRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
