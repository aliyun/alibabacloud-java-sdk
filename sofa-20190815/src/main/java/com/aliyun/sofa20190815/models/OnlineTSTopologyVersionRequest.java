// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineTSTopologyVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessId")
    public String processId;

    public static OnlineTSTopologyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineTSTopologyVersionRequest self = new OnlineTSTopologyVersionRequest();
        return TeaModel.build(map, self);
    }

    public OnlineTSTopologyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnlineTSTopologyVersionRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
