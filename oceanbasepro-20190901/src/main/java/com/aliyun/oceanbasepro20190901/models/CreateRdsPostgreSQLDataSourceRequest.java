// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateRdsPostgreSQLDataSourceRequest extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("UserName")
    public String userName;

    public static CreateRdsPostgreSQLDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRdsPostgreSQLDataSourceRequest self = new CreateRdsPostgreSQLDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRdsPostgreSQLDataSourceRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateRdsPostgreSQLDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRdsPostgreSQLDataSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRdsPostgreSQLDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRdsPostgreSQLDataSourceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRdsPostgreSQLDataSourceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
