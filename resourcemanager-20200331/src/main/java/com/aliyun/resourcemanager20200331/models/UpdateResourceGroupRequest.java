// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    /**
     * <p>The display name of the resource group.</p>
     * <p>The name must be 1 to 50 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("NewDisplayName")
    public String newDisplayName;

    /**
     * <p>The ID of the resource group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
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
