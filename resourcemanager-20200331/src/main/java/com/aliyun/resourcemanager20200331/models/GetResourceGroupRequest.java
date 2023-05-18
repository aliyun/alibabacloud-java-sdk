// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>Specifies whether to return the information of tags. Valid values:</p>
     * <br>
     * <p>*   false (default value)</p>
     * <p>*   true</p>
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
