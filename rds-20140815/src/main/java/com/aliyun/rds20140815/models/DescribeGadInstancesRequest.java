// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the global active database cluster.</p>
     * <br>
     * <p>*   If you leave this parameter empty, this operation returns the details about all global active database clusters that are created within your Alibaba Cloud account.</p>
     * <p>*   If you specify this parameter, this operation returns the details about the global active database cluster that you specify.</p>
     * <br>
     * <p>>  If you do not specify this parameter when you call this operation for the first time, the IDs of all clusters that are created by using the current account are returned. Then, you can specify the cluster ID to view the cluster details.</p>
     */
    @NameInMap("GadInstanceName")
    public String gadInstanceName;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
