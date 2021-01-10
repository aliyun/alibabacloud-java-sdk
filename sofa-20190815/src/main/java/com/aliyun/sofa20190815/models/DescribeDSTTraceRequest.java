// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeDSTTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceRequest self = new DescribeDSTTraceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDSTTraceRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
