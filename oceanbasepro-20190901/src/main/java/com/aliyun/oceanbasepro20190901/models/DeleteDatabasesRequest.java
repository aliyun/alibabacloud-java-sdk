// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteDatabasesRequest extends TeaModel {
    /**
     * <p>The list of database names.    </p>
     * <p>It is a JSON array. Each object in the array is a database name string.</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabasesRequest self = new DeleteDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabasesRequest setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    public DeleteDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDatabasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
