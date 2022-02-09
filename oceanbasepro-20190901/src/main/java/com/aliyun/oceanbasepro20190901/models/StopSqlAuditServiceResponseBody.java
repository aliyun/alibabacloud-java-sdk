// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopSqlAuditServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopSqlAuditServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSqlAuditServiceResponseBody self = new StopSqlAuditServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSqlAuditServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
