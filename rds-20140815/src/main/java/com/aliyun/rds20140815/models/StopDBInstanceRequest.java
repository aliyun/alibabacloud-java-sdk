// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopDBInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static StopDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceRequest self = new StopDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public StopDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
