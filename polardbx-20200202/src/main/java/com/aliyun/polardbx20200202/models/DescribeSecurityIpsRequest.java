// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpsRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpsRequest self = new DescribeSecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSecurityIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
