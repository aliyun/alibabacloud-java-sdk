// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalworkitemRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkItemId")
    public String workItemId;

    public static GetLinkeBahamutAoneinternalworkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalworkitemRequest self = new GetLinkeBahamutAoneinternalworkitemRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalworkitemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutAoneinternalworkitemRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
