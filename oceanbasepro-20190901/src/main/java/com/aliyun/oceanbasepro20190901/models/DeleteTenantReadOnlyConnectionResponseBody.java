// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantReadOnlyConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTenantReadOnlyConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantReadOnlyConnectionResponseBody self = new DeleteTenantReadOnlyConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTenantReadOnlyConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
