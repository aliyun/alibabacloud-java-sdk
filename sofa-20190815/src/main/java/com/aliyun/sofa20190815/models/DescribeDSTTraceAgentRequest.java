// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceAgentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDSTTraceAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceAgentRequest self = new DescribeDSTTraceAgentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
