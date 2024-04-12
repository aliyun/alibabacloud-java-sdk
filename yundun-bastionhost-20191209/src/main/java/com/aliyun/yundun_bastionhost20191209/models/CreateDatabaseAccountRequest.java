// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountRequest extends TeaModel {
    @NameInMap("DatabaseAccountName")
    public String databaseAccountName;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("DatabaseSchema")
    public String databaseSchema;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginAttribute")
    public String loginAttribute;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountRequest self = new CreateDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public CreateDatabaseAccountRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public CreateDatabaseAccountRequest setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    public CreateDatabaseAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDatabaseAccountRequest setLoginAttribute(String loginAttribute) {
        this.loginAttribute = loginAttribute;
        return this;
    }
    public String getLoginAttribute() {
        return this.loginAttribute;
    }

    public CreateDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDatabaseAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
