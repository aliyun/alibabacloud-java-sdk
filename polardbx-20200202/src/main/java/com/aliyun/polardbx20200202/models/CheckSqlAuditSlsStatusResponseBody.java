// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckSqlAuditSlsStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckSqlAuditSlsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSqlAuditSlsStatusResponseBody self = new CheckSqlAuditSlsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSqlAuditSlsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSqlAuditSlsStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
