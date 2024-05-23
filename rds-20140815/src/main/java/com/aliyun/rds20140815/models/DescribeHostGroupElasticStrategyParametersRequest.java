// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostGroupElasticStrategyParametersRequest extends TeaModel {
    /**
     * <p>The name of the dedicated cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DedicatedHostGroupName")
    public String dedicatedHostGroupName;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/26243.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeHostGroupElasticStrategyParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostGroupElasticStrategyParametersRequest self = new DescribeHostGroupElasticStrategyParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHostGroupElasticStrategyParametersRequest setDedicatedHostGroupName(String dedicatedHostGroupName) {
        this.dedicatedHostGroupName = dedicatedHostGroupName;
        return this;
    }
    public String getDedicatedHostGroupName() {
        return this.dedicatedHostGroupName;
    }

    public DescribeHostGroupElasticStrategyParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHostGroupElasticStrategyParametersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHostGroupElasticStrategyParametersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
