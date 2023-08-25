// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SwitchoverInstanceRequest extends TeaModel {
    /**
     * <p>Whether to force the switchover.</p>
     * <p>- true: Force the switchover.</p>
     * <p>- false: Do not force the switchover.</p>
     */
    @NameInMap("Forced")
    public Boolean forced;

    /**
     * <p>The instance ID of the primary/standby instance. You can set the default value to the instance ID of the instance to be switched to the primary instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance ID of the instance to be switched to the primary instance.</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static SwitchoverInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchoverInstanceRequest self = new SwitchoverInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SwitchoverInstanceRequest setForced(Boolean forced) {
        this.forced = forced;
        return this;
    }
    public Boolean getForced() {
        return this.forced;
    }

    public SwitchoverInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchoverInstanceRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
