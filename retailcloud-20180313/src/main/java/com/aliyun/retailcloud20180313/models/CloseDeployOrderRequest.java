// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CloseDeployOrderRequest extends TeaModel {
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    public static CloseDeployOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDeployOrderRequest self = new CloseDeployOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseDeployOrderRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

}
