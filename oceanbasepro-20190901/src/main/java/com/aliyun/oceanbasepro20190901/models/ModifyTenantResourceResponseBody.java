// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantResourceResponseBody self = new ModifyTenantResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTenantResourceResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
