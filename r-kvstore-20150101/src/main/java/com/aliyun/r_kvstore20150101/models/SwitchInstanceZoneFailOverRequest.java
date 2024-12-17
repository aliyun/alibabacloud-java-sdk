// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceZoneFailOverRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The duration for which the fault lasts. Unit: minutes.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>5</li>
     * <li>10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SiteFaultTime")
    public String siteFaultTime;

    /**
     * <p>The ID of the destination zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static SwitchInstanceZoneFailOverRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceZoneFailOverRequest self = new SwitchInstanceZoneFailOverRequest();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceZoneFailOverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchInstanceZoneFailOverRequest setSiteFaultTime(String siteFaultTime) {
        this.siteFaultTime = siteFaultTime;
        return this;
    }
    public String getSiteFaultTime() {
        return this.siteFaultTime;
    }

    public SwitchInstanceZoneFailOverRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

}
