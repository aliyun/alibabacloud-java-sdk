// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupRequest extends TeaModel {
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("NewDisplayName")
    @Validation(required = true)
    public String newDisplayName;

    public static UpdateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupRequest self = new UpdateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateResourceGroupRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

}
