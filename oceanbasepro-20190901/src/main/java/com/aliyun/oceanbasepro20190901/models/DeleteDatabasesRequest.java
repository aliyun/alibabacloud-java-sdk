// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteDatabasesRequest extends TeaModel {
    // 数据库名称列表。 其为Json格式的数组，数组中每个对象都为数据库名称的字符串。
    @NameInMap("DatabaseNames")
    public String databaseNames;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
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
