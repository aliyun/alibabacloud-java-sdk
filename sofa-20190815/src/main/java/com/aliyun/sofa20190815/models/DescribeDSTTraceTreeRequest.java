// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceTreeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeDSTTraceTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceTreeRequest self = new DescribeDSTTraceTreeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceTreeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDSTTraceTreeRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
