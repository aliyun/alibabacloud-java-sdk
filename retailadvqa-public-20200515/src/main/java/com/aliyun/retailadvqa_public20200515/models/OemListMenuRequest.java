// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class OemListMenuRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleSign")
    public String roleSign;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OemListMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        OemListMenuRequest self = new OemListMenuRequest();
        return TeaModel.build(map, self);
    }

    public OemListMenuRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public OemListMenuRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OemListMenuRequest setRoleSign(String roleSign) {
        this.roleSign = roleSign;
        return this;
    }
    public String getRoleSign() {
        return this.roleSign;
    }

    public OemListMenuRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OemListMenuRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
