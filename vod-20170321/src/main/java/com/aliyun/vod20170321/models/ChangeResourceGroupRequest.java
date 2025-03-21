// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzko7fsuj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of resource</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-xxxxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>The type of resource</p>
     * 
     * <strong>example:</strong>
     * <p>AppInfo</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ChangeResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceGroupRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public ChangeResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
