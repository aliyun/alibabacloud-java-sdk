// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetTSMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetTSMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTSMiddlewareInstanceRequest self = new GetTSMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetTSMiddlewareInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetTSMiddlewareInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
