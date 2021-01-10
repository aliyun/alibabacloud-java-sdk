// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMeshMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetMeshMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMeshMiddlewareInstanceRequest self = new GetMeshMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetMeshMiddlewareInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMeshMiddlewareInstanceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetMeshMiddlewareInstanceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
