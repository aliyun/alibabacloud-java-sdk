// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeActiveOperationMaintainConfRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintainConfRequest self = new DescribeActiveOperationMaintainConfRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintainConfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
