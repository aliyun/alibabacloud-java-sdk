// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseDescriptionRequest extends TeaModel {
    /**
     * <p>The name of the database.    </p>
     * <p>You cannot use reserved keywords, such as test and mysql.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The description of the database.</p>
     */
    @NameInMap("Description")
    public String description;

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

    public static ModifyDatabaseDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseDescriptionRequest self = new ModifyDatabaseDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseDescriptionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ModifyDatabaseDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDatabaseDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseDescriptionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
