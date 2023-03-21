// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartPreCheckDatabaseRequest extends TeaModel {
    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("InstanceUuid")
    public String instanceUuid;

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
