// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDatabaseDescriptionRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DbDescription")
    public String dbDescription;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDatabaseDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseDescriptionRequest self = new ModifyDatabaseDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseDescriptionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDatabaseDescriptionRequest setDbDescription(String dbDescription) {
        this.dbDescription = dbDescription;
        return this;
    }
    public String getDbDescription() {
        return this.dbDescription;
    }

    public ModifyDatabaseDescriptionRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ModifyDatabaseDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
