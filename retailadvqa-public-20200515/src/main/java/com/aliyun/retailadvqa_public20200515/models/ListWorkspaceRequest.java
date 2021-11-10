// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListWorkspaceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRequest self = new ListWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListWorkspaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
