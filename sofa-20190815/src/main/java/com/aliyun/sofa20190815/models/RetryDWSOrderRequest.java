// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryDWSOrderRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public Long orderId;

    public static RetryDWSOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDWSOrderRequest self = new RetryDWSOrderRequest();
        return TeaModel.build(map, self);
    }

    public RetryDWSOrderRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RetryDWSOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryDWSOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
