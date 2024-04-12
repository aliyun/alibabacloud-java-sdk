// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseAccountRequest extends TeaModel {
    @NameInMap("DatabaseAccountId")
    public String databaseAccountId;

    @NameInMap("DatabaseAccountName")
    public String databaseAccountName;

    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseAccountRequest self = new ModifyDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseAccountRequest setDatabaseAccountId(String databaseAccountId) {
        this.databaseAccountId = databaseAccountId;
        return this;
    }
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    public ModifyDatabaseAccountRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public ModifyDatabaseAccountRequest setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    public ModifyDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
