// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyDataSourceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbVersion")
    public Integer dbVersion;

    @NameInMap("DbCertificate")
    public String dbCertificate;

    @NameInMap("DbUsername")
    public String dbUsername;

    @NameInMap("DbPassword")
    public String dbPassword;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DbAddresses")
    public java.util.List<String> dbAddresses;

    public static ModifyDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceRequest self = new ModifyDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDataSourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDataSourceRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public ModifyDataSourceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyDataSourceRequest setDbVersion(Integer dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }
    public Integer getDbVersion() {
        return this.dbVersion;
    }

    public ModifyDataSourceRequest setDbCertificate(String dbCertificate) {
        this.dbCertificate = dbCertificate;
        return this;
    }
    public String getDbCertificate() {
        return this.dbCertificate;
    }

    public ModifyDataSourceRequest setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
        return this;
    }
    public String getDbUsername() {
        return this.dbUsername;
    }

    public ModifyDataSourceRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public ModifyDataSourceRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyDataSourceRequest setDbAddresses(java.util.List<String> dbAddresses) {
        this.dbAddresses = dbAddresses;
        return this;
    }
    public java.util.List<String> getDbAddresses() {
        return this.dbAddresses;
    }

}
