// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantReadOnlyConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTenantReadOnlyConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantReadOnlyConnectionResponseBody self = new CreateTenantReadOnlyConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantReadOnlyConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
