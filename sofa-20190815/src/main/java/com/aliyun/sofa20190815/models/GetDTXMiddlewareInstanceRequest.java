// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDTXMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDTXMiddlewareInstanceRequest self = new GetDTXMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDTXMiddlewareInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetDTXMiddlewareInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
