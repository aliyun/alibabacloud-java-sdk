// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarVersionListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeColumnarVersionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarVersionListRequest self = new DescribeColumnarVersionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarVersionListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeColumnarVersionListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
