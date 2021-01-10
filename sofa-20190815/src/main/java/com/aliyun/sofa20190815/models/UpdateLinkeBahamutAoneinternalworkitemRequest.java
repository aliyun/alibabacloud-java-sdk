// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAoneinternalworkitemRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkItemId")
    public String workItemId;

    public static UpdateLinkeBahamutAoneinternalworkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAoneinternalworkitemRequest self = new UpdateLinkeBahamutAoneinternalworkitemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAoneinternalworkitemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLinkeBahamutAoneinternalworkitemRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateLinkeBahamutAoneinternalworkitemRequest setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }
    public String getWorkItemId() {
        return this.workItemId;
    }

}
