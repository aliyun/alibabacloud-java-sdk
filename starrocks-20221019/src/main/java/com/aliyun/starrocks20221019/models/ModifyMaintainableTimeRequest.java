// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyMaintainableTimeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00-09:00</p>
     */
    @NameInMap("MaintainableTimePeriod")
    public String maintainableTimePeriod;

    public static ModifyMaintainableTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintainableTimeRequest self = new ModifyMaintainableTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaintainableTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyMaintainableTimeRequest setMaintainableTimePeriod(String maintainableTimePeriod) {
        this.maintainableTimePeriod = maintainableTimePeriod;
        return this;
    }
    public String getMaintainableTimePeriod() {
        return this.maintainableTimePeriod;
    }

}
