// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDSTTraceCollectionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static DeleteDSTTraceCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSTTraceCollectionRequest self = new DeleteDSTTraceCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDSTTraceCollectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDSTTraceCollectionRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
