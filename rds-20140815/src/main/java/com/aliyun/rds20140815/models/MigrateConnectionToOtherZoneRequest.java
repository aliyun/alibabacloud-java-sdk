// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateConnectionToOtherZoneRequest extends TeaModel {
    /**
     * <p>The endpoint of the instance. The endpoint is specified when you create the instance.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static MigrateConnectionToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateConnectionToOtherZoneRequest self = new MigrateConnectionToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateConnectionToOtherZoneRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public MigrateConnectionToOtherZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateConnectionToOtherZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
