// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteDBRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DbName")
    public String dbName;

    public static DeleteDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBRequest self = new DeleteDBRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDBRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteDBRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
