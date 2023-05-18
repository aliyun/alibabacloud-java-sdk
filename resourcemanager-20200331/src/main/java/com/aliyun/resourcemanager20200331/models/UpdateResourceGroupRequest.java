// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    /**
     * <p>The display name of the resource group.</p>
     * <br>
     * <p>The name must be 1 to 50 characters in length.</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UpdateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupRequest self = new UpdateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
