// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypesRequest extends TeaModel {
    /**
     * <p>The commodity code of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_customprepaid_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The database engine. Set the value to MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance types.</p>
     */
    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    /**
     * <p>The instance family. You can call the <strong>DescribeRCInstanceTypeFamilies</strong> operation to query the instance families of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>gn8.cm</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypesRequest self = new DescribeRCInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypesRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeRCInstanceTypesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeRCInstanceTypesRequest setInstanceType(java.util.List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public java.util.List<String> getInstanceType() {
        return this.instanceType;
    }

    public DescribeRCInstanceTypesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeRCInstanceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
