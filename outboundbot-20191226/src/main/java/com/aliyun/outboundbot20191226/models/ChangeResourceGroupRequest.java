// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aeky6wvb7yzabqy</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceId.1=b949ae1f-01dc-4191-ae5a-70fbe6772fd8</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

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

    public ChangeResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
