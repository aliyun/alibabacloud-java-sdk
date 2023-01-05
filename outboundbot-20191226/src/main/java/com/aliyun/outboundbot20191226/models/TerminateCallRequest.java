// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class TerminateCallRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static TerminateCallRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateCallRequest self = new TerminateCallRequest();
        return TeaModel.build(map, self);
    }

    public TerminateCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TerminateCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
