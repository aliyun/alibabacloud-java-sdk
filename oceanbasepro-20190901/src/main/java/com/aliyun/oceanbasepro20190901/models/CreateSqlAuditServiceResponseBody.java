// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSqlAuditServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSqlAuditServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlAuditServiceResponseBody self = new CreateSqlAuditServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlAuditServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
