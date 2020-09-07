// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesAsCsvRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDBInstancesAsCsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesAsCsvRequest self = new DescribeDBInstancesAsCsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesAsCsvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesAsCsvRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
