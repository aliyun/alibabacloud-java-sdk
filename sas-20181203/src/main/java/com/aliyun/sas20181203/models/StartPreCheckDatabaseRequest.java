// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartPreCheckDatabaseRequest extends TeaModel {
    /**
     * <p>The type of the database. Valid values:</p>
     * <br>
     * <p>*   **MYSQL**</p>
     * <p>*   **MSSQL**</p>
     * <p>*   **Oracle**</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The UUID of the agent that is used to back up the data of the database.</p>
     * <br>
     * <p>> You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the UUID.</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <p>The region ID of the server that hosts the database.</p>
     */
    @NameInMap("UniRegionId")
    public String uniRegionId;

    public static StartPreCheckDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPreCheckDatabaseRequest self = new StartPreCheckDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public StartPreCheckDatabaseRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public StartPreCheckDatabaseRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public StartPreCheckDatabaseRequest setUniRegionId(String uniRegionId) {
        this.uniRegionId = uniRegionId;
        return this;
    }
    public String getUniRegionId() {
        return this.uniRegionId;
    }

}
