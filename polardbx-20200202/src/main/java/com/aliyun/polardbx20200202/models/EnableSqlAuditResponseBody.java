// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableSqlAuditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC3ABA3E-0F8A-4596-9104-F5167C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnableSqlAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditResponseBody self = new EnableSqlAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSqlAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
