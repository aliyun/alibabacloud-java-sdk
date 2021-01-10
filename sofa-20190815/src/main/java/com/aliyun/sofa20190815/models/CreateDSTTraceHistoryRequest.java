// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDSTTraceHistoryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateDSTTraceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDSTTraceHistoryRequest self = new CreateDSTTraceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDSTTraceHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDSTTraceHistoryRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
