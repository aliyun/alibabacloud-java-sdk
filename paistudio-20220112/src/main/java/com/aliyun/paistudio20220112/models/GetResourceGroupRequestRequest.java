// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequestRequest extends TeaModel {
    @NameInMap("PodStatus")
    public String podStatus;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    public static GetResourceGroupRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequestRequest self = new GetResourceGroupRequestRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequestRequest setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }
    public String getPodStatus() {
        return this.podStatus;
    }

    public GetResourceGroupRequestRequest setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

}
