// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupRequest extends TeaModel {
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
