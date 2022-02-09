// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditServiceInfoRequest extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSqlAuditServiceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditServiceInfoRequest self = new DescribeSqlAuditServiceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditServiceInfoRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeSqlAuditServiceInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlAuditServiceInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
