// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesRequest extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Users")
    public String users;

    public static ModifyDatabaseUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseUserRolesRequest self = new ModifyDatabaseUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseUserRolesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ModifyDatabaseUserRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseUserRolesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyDatabaseUserRolesRequest setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
