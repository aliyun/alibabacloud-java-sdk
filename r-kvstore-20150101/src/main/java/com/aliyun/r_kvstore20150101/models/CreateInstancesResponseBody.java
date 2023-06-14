// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public CreateInstancesResponseBodyInstanceIds instanceIds;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancesResponseBody self = new CreateInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstancesResponseBody setInstanceIds(CreateInstancesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateInstancesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public CreateInstancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateInstancesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static CreateInstancesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateInstancesResponseBodyInstanceIds self = new CreateInstancesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateInstancesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
