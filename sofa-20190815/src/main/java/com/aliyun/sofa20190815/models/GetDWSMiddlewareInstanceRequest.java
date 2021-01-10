// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDWSMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMiddlewareInstanceRequest self = new GetDWSMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSMiddlewareInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetDWSMiddlewareInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
