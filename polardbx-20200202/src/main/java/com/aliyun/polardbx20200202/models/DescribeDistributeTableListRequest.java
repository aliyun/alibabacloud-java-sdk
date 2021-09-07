// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDistributeTableListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DbName")
    public String dbName;

    public static DescribeDistributeTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributeTableListRequest self = new DescribeDistributeTableListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDistributeTableListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDistributeTableListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDistributeTableListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
