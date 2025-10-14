// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableSqlAuditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC3DAE3E-0F8A-4596-9104-F5167C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableSqlAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlAuditResponseBody self = new DisableSqlAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSqlAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
