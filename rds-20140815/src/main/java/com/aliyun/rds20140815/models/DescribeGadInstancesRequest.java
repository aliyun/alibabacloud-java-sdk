// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesRequest extends TeaModel {
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeGadInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesRequest self = new DescribeGadInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesRequest setGadInstanceName(String gadInstanceName) {
        this.gadInstanceName = gadInstanceName;
        return this;
    }
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    public DescribeGadInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGadInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
