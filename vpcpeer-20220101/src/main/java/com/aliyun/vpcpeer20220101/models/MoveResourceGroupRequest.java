// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class MoveResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the new resource group.</p>
     * <br>
     * <p>>  You can use resource groups to manage resources owned by your Alibaba Cloud account. Resource groups simplify the resource and permission management of your Alibaba Cloud account. For more information, see [What is resource management?](~~94475~~).</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The ID of the region to which the resource belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPC peering connection.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Set the value to **PeerConnection**, which specifies a VPC peering connection.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static MoveResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupRequest self = new MoveResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MoveResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public MoveResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
