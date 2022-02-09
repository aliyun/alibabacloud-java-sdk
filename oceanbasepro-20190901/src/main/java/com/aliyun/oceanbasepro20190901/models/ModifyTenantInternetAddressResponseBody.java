// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantInternetAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAddressResponseBody self = new ModifyTenantInternetAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
