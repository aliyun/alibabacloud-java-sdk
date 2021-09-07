// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    public static DeleteDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceRequest self = new DeleteDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDBInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

}
