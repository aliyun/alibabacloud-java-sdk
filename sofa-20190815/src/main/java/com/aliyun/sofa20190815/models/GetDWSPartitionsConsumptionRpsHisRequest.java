// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsConsumptionRpsHisRequest extends TeaModel {
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

    public static GetDWSPartitionsConsumptionRpsHisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsConsumptionRpsHisRequest self = new GetDWSPartitionsConsumptionRpsHisRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsConsumptionRpsHisRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSPartitionsConsumptionRpsHisRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSPartitionsConsumptionRpsHisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSPartitionsConsumptionRpsHisRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public GetDWSPartitionsConsumptionRpsHisRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
