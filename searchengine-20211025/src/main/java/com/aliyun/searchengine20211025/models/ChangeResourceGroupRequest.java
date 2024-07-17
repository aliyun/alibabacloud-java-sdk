// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>new resource group id</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxr3gs*****</p>
     */
    @NameInMap("newResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ChangeResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
