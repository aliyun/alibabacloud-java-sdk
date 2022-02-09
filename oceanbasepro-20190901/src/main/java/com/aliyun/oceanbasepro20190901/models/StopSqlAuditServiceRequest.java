// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopSqlAuditServiceRequest extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static StopSqlAuditServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSqlAuditServiceRequest self = new StopSqlAuditServiceRequest();
        return TeaModel.build(map, self);
    }

    public StopSqlAuditServiceRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public StopSqlAuditServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopSqlAuditServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
