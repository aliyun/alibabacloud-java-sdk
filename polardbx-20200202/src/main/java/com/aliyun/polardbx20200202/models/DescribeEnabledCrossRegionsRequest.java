// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEnabledCrossRegionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-bjxxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEnabledCrossRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnabledCrossRegionsRequest self = new DescribeEnabledCrossRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnabledCrossRegionsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeEnabledCrossRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
