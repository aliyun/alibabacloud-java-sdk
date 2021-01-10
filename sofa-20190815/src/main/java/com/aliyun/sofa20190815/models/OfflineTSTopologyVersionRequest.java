// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineTSTopologyVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessId")
    public String processId;

    public static OfflineTSTopologyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineTSTopologyVersionRequest self = new OfflineTSTopologyVersionRequest();
        return TeaModel.build(map, self);
    }

    public OfflineTSTopologyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OfflineTSTopologyVersionRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
