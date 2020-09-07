// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostZonesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeAvailableDedicatedHostZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostZonesRequest self = new DescribeAvailableDedicatedHostZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
