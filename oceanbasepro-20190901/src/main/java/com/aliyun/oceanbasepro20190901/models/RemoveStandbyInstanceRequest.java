// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class RemoveStandbyInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Forced")
    public Boolean forced;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob608fgj1q****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob4bv8o7sp****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static RemoveStandbyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveStandbyInstanceRequest self = new RemoveStandbyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveStandbyInstanceRequest setForced(Boolean forced) {
        this.forced = forced;
        return this;
    }
    public Boolean getForced() {
        return this.forced;
    }

    public RemoveStandbyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveStandbyInstanceRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
