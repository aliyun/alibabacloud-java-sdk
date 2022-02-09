// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAdressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantInternetAdressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAdressResponseBody self = new ModifyTenantInternetAdressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAdressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
