// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableDSTTraceAgentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableDSTTraceAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDSTTraceAgentRequest self = new EnableDSTTraceAgentRequest();
        return TeaModel.build(map, self);
    }

    public EnableDSTTraceAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
