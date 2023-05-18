// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DeleteResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupRequest self = new DeleteResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
