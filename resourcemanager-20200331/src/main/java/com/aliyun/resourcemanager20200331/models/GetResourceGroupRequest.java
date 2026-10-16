// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to return tag information. Valid values:</p>
     * <ul>
     * <li>false (default): does not return tag information.</li>
     * <li>true: returns tag information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>The resource group ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> to query resource group IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static GetResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequest self = new GetResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public GetResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
