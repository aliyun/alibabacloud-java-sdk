// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryStatisticResponseBody extends TeaModel {
    @NameInMap("InstanceCapacityEachType")
    public java.util.Map<String, ?> instanceCapacityEachType;

    @NameInMap("InstanceNumEachType")
    public java.util.Map<String, ?> instanceNumEachType;

    /**
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlotNumEachType")
    public java.util.Map<String, ?> slotNumEachType;

    public static QueryStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticResponseBody self = new QueryStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatisticResponseBody setInstanceCapacityEachType(java.util.Map<String, ?> instanceCapacityEachType) {
        this.instanceCapacityEachType = instanceCapacityEachType;
        return this;
    }
    public java.util.Map<String, ?> getInstanceCapacityEachType() {
        return this.instanceCapacityEachType;
    }

    public QueryStatisticResponseBody setInstanceNumEachType(java.util.Map<String, ?> instanceNumEachType) {
        this.instanceNumEachType = instanceNumEachType;
        return this;
    }
    public java.util.Map<String, ?> getInstanceNumEachType() {
        return this.instanceNumEachType;
    }

    public QueryStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatisticResponseBody setSlotNumEachType(java.util.Map<String, ?> slotNumEachType) {
        this.slotNumEachType = slotNumEachType;
        return this;
    }
    public java.util.Map<String, ?> getSlotNumEachType() {
        return this.slotNumEachType;
    }

}
