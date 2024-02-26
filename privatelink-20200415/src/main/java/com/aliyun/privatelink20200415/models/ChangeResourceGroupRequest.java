// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource IDs. You can specify up to 50 resource IDs.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of resource. Valid values:</p>
     * <br>
     * <p>*   **vpcendpoint**: endpoint</p>
     * <p>*   **vpcendpointservice**: endpoint service</p>
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

    public ChangeResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
