// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
