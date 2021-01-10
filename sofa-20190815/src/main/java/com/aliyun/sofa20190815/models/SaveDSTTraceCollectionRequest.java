// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveDSTTraceCollectionRequest extends TeaModel {
    @NameInMap("CollectedDescription")
    public String collectedDescription;

    @NameInMap("CollectedName")
    public String collectedName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static SaveDSTTraceCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDSTTraceCollectionRequest self = new SaveDSTTraceCollectionRequest();
        return TeaModel.build(map, self);
    }

    public SaveDSTTraceCollectionRequest setCollectedDescription(String collectedDescription) {
        this.collectedDescription = collectedDescription;
        return this;
    }
    public String getCollectedDescription() {
        return this.collectedDescription;
    }

    public SaveDSTTraceCollectionRequest setCollectedName(String collectedName) {
        this.collectedName = collectedName;
        return this;
    }
    public String getCollectedName() {
        return this.collectedName;
    }

    public SaveDSTTraceCollectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveDSTTraceCollectionRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
