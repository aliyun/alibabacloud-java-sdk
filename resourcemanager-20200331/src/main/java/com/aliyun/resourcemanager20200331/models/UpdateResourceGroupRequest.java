// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    @NameInMap("NewDisplayName")
    public String newDisplayName;

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
