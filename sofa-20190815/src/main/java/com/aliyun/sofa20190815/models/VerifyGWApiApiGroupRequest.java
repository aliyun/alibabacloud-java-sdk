// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class VerifyGWApiApiGroupRequest extends TeaModel {
    @NameInMap("ApiGroupId")
    public String apiGroupId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static VerifyGWApiApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyGWApiApiGroupRequest self = new VerifyGWApiApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public VerifyGWApiApiGroupRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public VerifyGWApiApiGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public VerifyGWApiApiGroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
