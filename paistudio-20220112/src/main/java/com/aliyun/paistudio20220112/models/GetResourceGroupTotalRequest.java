// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupTotalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    public static GetResourceGroupTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupTotalRequest self = new GetResourceGroupTotalRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupTotalRequest setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

}
