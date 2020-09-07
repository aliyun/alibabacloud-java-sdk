// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionRequest extends TeaModel {
    // description: 地域ID。可以通过接口[DescribeRegions](~~26243~~)查看地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeAvailableCrossRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionRequest self = new DescribeAvailableCrossRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
