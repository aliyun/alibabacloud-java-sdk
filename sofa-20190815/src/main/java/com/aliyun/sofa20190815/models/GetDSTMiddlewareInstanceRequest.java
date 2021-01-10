// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTMiddlewareInstanceRequest extends TeaModel {
    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Testf")
    public String testf;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetDSTMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDSTMiddlewareInstanceRequest self = new GetDSTMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetDSTMiddlewareInstanceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetDSTMiddlewareInstanceRequest setTestf(String testf) {
        this.testf = testf;
        return this;
    }
    public String getTestf() {
        return this.testf;
    }

    public GetDSTMiddlewareInstanceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
