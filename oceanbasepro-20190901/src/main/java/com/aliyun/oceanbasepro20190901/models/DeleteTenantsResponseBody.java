// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantIds")
    public java.util.List<String> tenantIds;

    public static DeleteTenantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantsResponseBody self = new DeleteTenantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTenantsResponseBody setTenantIds(java.util.List<String> tenantIds) {
        this.tenantIds = tenantIds;
        return this;
    }
    public java.util.List<String> getTenantIds() {
        return this.tenantIds;
    }

}
