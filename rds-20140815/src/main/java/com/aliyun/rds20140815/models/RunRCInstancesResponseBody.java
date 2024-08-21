// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIdSets")
    public RunRCInstancesResponseBodyInstanceIdSets instanceIdSets;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static RunRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunRCInstancesResponseBody self = new RunRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunRCInstancesResponseBody setInstanceIdSets(RunRCInstancesResponseBodyInstanceIdSets instanceIdSets) {
        this.instanceIdSets = instanceIdSets;
        return this;
    }
    public RunRCInstancesResponseBodyInstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
    }

    public RunRCInstancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RunRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunRCInstancesResponseBodyInstanceIdSets extends TeaModel {
        @NameInMap("InstanceIdSet")
        public java.util.List<String> instanceIdSet;

        public static RunRCInstancesResponseBodyInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            RunRCInstancesResponseBodyInstanceIdSets self = new RunRCInstancesResponseBodyInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public RunRCInstancesResponseBodyInstanceIdSets setInstanceIdSet(java.util.List<String> instanceIdSet) {
            this.instanceIdSet = instanceIdSet;
            return this;
        }
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

    }

}
