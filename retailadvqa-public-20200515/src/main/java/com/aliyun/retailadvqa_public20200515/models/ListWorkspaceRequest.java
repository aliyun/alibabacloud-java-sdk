// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListWorkspaceRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("AccessId")
    public String accessId;

    public static ListWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRequest self = new ListWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListWorkspaceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
