// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionConsumptionLatencyHisRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Partition")
    public String partition;

    @NameInMap("Start")
    public Long start;

    public static GetDWSPartitionConsumptionLatencyHisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionConsumptionLatencyHisRequest self = new GetDWSPartitionConsumptionLatencyHisRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionConsumptionLatencyHisRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSPartitionConsumptionLatencyHisRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSPartitionConsumptionLatencyHisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSPartitionConsumptionLatencyHisRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public GetDWSPartitionConsumptionLatencyHisRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
