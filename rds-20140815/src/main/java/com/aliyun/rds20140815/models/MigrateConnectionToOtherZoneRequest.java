// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("ZoneId")
    public String zoneId;

    public static MigrateConnectionToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneRequest self = new MigrateConnectionToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateConnectionToOtherZoneRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public MigrateConnectionToOtherZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
