// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteTSTopologyVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessId")
    public String processId;

    public static DeleteTSTopologyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTSTopologyVersionRequest self = new DeleteTSTopologyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTSTopologyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTSTopologyVersionRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
