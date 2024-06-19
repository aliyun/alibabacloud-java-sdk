// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAuditLogConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the audit log feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled</li>
     * <li><strong>false</strong>: disabled</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/130206.html">ModifyAuditLogConfig</a> operation to enable or disable the audit log feature for an ApsaraDB for Redis instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DbAudit")
    public String dbAudit;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The retention period of audit logs. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
