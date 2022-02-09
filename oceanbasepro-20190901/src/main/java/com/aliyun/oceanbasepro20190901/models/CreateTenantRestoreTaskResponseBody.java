// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantRestoreTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTenantRestoreTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRestoreTaskResponseBody self = new CreateTenantRestoreTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantRestoreTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
