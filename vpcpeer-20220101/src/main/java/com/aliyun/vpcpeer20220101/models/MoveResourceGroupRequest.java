// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class MoveResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the new resource group.</p>
     * <blockquote>
     * <p> You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3peow3k****</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The region ID of the resource.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPC peering connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-gu32s92f9ytsk9****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Set the value to <strong>PeerConnection</strong>, which specifies a VPC peering connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PeerConnection</p>
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
