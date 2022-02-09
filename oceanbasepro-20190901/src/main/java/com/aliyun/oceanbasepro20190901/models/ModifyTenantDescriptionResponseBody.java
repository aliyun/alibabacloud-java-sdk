// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantDescriptionResponseBody self = new ModifyTenantDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
