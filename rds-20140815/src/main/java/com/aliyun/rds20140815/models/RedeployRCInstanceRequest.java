// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RedeployRCInstanceRequest extends TeaModel {
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RedeployRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployRCInstanceRequest self = new RedeployRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RedeployRCInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public RedeployRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
