// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantNameResponseBody self = new ModifyTenantNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
