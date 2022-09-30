// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantPrimaryZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantPrimaryZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantPrimaryZoneResponseBody self = new ModifyTenantPrimaryZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantPrimaryZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
