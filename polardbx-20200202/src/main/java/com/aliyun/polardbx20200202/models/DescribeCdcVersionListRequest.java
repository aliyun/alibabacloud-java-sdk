// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcVersionListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-bjrl7****k2vp7</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCdcVersionListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcVersionListRequest self = new DescribeCdcVersionListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdcVersionListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCdcVersionListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeCdcVersionListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
