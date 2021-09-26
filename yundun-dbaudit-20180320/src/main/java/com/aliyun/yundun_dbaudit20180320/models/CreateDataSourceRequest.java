// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("AssetType")
    public Integer assetType;

    @NameInMap("DbType")
    public Integer dbType;

    @NameInMap("DbVersion")
    public Integer dbVersion;

    @NameInMap("DbCertificate")
    public String dbCertificate;

    @NameInMap("DbUsername")
    public String dbUsername;

    @NameInMap("DbPassword")
    public String dbPassword;

    @NameInMap("DbAddresses")
    public java.util.List<String> dbAddresses;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDataSourceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDataSourceRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public CreateDataSourceRequest setAssetType(Integer assetType) {
        this.assetType = assetType;
        return this;
    }
    public Integer getAssetType() {
        return this.assetType;
    }

    public CreateDataSourceRequest setDbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }
    public Integer getDbType() {
        return this.dbType;
    }

    public CreateDataSourceRequest setDbVersion(Integer dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public Integer getDbVersion() {
        return this.dbVersion;
    }

    public CreateDataSourceRequest setDbCertificate(String dbCertificate) {
        this.dbCertificate = dbCertificate;
        return this;
    }
    public String getDbCertificate() {
        return this.dbCertificate;
    }

    public CreateDataSourceRequest setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }

    public CreateDataSourceRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public CreateDataSourceRequest setDbAddresses(java.util.List<String> dbAddresses) {
        this.dbAddresses = dbAddresses;
        return this;
    }
    public java.util.List<String> getDbAddresses() {
        return this.dbAddresses;
    }

}
