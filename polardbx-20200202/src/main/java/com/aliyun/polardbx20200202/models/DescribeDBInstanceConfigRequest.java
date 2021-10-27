// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDBInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigRequest self = new DescribeDBInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public DescribeDBInstanceConfigRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
