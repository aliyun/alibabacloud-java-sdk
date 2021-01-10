// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsStoreLatencyHisRequest extends TeaModel {
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

    public static GetDWSPartitionsStoreLatencyHisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsStoreLatencyHisRequest self = new GetDWSPartitionsStoreLatencyHisRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsStoreLatencyHisRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSPartitionsStoreLatencyHisRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSPartitionsStoreLatencyHisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSPartitionsStoreLatencyHisRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public GetDWSPartitionsStoreLatencyHisRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
