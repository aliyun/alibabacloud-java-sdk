// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeTSTopologyVersionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("Remark")
    public String remark;

    public static DescribeTSTopologyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTSTopologyVersionRequest self = new DescribeTSTopologyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTSTopologyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTSTopologyVersionRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeTSTopologyVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
