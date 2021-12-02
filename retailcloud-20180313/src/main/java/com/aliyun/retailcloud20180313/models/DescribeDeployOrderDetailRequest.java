// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeDeployOrderDetailRequest extends TeaModel {
    @NameInMap("DeployOrderId")
    public Long deployOrderId;

    public static DescribeDeployOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployOrderDetailRequest self = new DescribeDeployOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeployOrderDetailRequest setDeployOrderId(Long deployOrderId) {
        this.deployOrderId = deployOrderId;
        return this;
    }
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

}
