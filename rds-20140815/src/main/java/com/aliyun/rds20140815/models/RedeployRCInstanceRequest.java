// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RedeployRCInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully stop the instance that is in the Running state. Default value: false.</p>
     * <blockquote>
     * <p> A forced stop is equivalent to the shutdown operation for a physical database server and can result in loss of data that is not written to storage devices. We recommend that you redeploy instances when they are in the Stopped state.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-s8t4zcwr5fnmfycn****</p>
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
