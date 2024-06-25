// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class DescribeHdMonitorRegionConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeHdMonitorRegionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHdMonitorRegionConfigRequest self = new DescribeHdMonitorRegionConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHdMonitorRegionConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
