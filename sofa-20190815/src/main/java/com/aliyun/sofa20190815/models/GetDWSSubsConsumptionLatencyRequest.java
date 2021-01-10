// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConsumptionLatencyRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Start")
    public Long start;

    public static GetDWSSubsConsumptionLatencyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConsumptionLatencyRequest self = new GetDWSSubsConsumptionLatencyRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConsumptionLatencyRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSSubsConsumptionLatencyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSSubsConsumptionLatencyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSSubsConsumptionLatencyRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
