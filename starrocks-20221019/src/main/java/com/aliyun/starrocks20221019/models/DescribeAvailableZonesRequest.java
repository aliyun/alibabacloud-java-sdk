// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesRequest self = new DescribeAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
