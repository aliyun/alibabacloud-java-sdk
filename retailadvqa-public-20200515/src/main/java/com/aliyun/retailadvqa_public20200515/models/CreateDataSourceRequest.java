// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    @NameInMap("DatabasePort")
    public String databasePort;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabaseUserName")
    public String databaseUserName;

    @NameInMap("DatabasePassword")
    public String databasePassword;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("CreateType")
    public String createType;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDataSourceRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public CreateDataSourceRequest setDatabaseAddress(String databaseAddress) {
        this.databaseAddress = databaseAddress;
        return this;
    }
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    public CreateDataSourceRequest setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
        return this;
    }
    public String getDatabasePort() {
        return this.databasePort;
    }

    public CreateDataSourceRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDataSourceRequest setDatabaseUserName(String databaseUserName) {
        this.databaseUserName = databaseUserName;
        return this;
    }
    public String getDatabaseUserName() {
        return this.databaseUserName;
    }

    public CreateDataSourceRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public CreateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDataSourceRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

}
