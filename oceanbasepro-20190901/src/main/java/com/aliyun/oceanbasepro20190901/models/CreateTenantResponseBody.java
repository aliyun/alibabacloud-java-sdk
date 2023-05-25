// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantResponseBody extends TeaModel {
    /**
     * <p>WB01144930</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>You can call this operation to create a tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreateTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantResponseBody self = new CreateTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
