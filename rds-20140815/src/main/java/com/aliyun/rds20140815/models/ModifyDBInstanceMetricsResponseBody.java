// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMetricsResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1s1j103lo6****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B55934BB-FFAA-5276-80A8-E0FDB12810B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The application scope of this modification. Valid values:</p>
     * <ul>
     * <li><strong>instance</strong>: This modification is applied only to the current instance.</li>
     * <li><strong>region</strong>: This modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with the same type of storage media as the current instance in the region to which the current instance belongs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static ModifyDBInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMetricsResponseBody self = new ModifyDBInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMetricsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBInstanceMetricsResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
