// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ScaleQuotaRequest extends TeaModel {
    @NameInMap("Min")
    public ResourceSpec min;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    public static ScaleQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleQuotaRequest self = new ScaleQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ScaleQuotaRequest setMin(ResourceSpec min) {
        this.min = min;
        return this;
    }
    public ResourceSpec getMin() {
        return this.min;
    }

    public ScaleQuotaRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
