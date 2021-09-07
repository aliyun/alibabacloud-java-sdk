// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartDBInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static RestartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceRequest self = new RestartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartDBInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

}
