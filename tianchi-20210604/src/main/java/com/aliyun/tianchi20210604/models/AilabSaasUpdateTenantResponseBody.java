// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tianchi20210604.models;

import com.aliyun.tea.*;

public class AilabSaasUpdateTenantResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AilabSaasUpdateTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AilabSaasUpdateTenantResponseBody self = new AilabSaasUpdateTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public AilabSaasUpdateTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
