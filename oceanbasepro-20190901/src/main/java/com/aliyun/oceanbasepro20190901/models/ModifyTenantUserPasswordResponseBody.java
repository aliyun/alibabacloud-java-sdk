// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserPasswordResponseBody self = new ModifyTenantUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
