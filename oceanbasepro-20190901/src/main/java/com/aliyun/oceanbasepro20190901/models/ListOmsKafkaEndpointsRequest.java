// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsKafkaEndpointsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListOmsKafkaEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsKafkaEndpointsRequest self = new ListOmsKafkaEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsKafkaEndpointsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
