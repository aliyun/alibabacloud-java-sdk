// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("RegionId")
    public String regionId;

    public static UpgradeDBInstanceEngineVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionRequest self = new UpgradeDBInstanceEngineVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceEngineVersionRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public UpgradeDBInstanceEngineVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
