// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class SwitchActiveStandbyZonesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static SwitchActiveStandbyZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchActiveStandbyZonesRequest self = new SwitchActiveStandbyZonesRequest();
        return TeaModel.build(map, self);
    }

    public SwitchActiveStandbyZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchActiveStandbyZonesRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
