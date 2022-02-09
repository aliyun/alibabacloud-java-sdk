// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantReadOnlyInternetConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantReadOnlyInternetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantReadOnlyInternetConnectionResponseBody self = new ModifyTenantReadOnlyInternetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantReadOnlyInternetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
