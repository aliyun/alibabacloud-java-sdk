// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the single global active database cluster that you want to query.</p>
     * <br>
     * <p>*   If you leave this parameter empty, this operation returns the details about all global active database clusters that are created within your Alibaba Cloud account.</p>
     * <p>*   If you specify this parameter, this operation returns the details about the single global active database cluster that you specify.</p>
     * <br>
     * <p>>  You can call this operation with this parameter left empty to query the details about all global active database clusters that are created within your Alibaba Cloud account. Then, you can call this operation again with this parameter specified to query the details about the single global active database cluster that you specify.</p>
     */
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    /**
     * <p>The ID of the region where the global active database clusters that you want to query reside. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
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
