// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypesShrinkRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceType")
    public String instanceTypeShrink;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCInstanceTypesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypesShrinkRequest self = new DescribeRCInstanceTypesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypesShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeRCInstanceTypesShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeRCInstanceTypesShrinkRequest setInstanceTypeShrink(String instanceTypeShrink) {
        this.instanceTypeShrink = instanceTypeShrink;
        return this;
    }
    public String getInstanceTypeShrink() {
        return this.instanceTypeShrink;
    }

    public DescribeRCInstanceTypesShrinkRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeRCInstanceTypesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
