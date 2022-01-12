// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditLogConfigResponseBody extends TeaModel {
    @NameInMap("DbAudit")
    public String dbAudit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Retention")
    public String retention;

    public static DescribeAuditLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogConfigResponseBody self = new DescribeAuditLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogConfigResponseBody setDbAudit(String dbAudit) {
        this.dbAudit = dbAudit;
        return this;
    }
    public String getDbAudit() {
        return this.dbAudit;
    }

    public DescribeAuditLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogConfigResponseBody setRetention(String retention) {
        this.retention = retention;
        return this;
    }
    public String getRetention() {
        return this.retention;
    }

}
