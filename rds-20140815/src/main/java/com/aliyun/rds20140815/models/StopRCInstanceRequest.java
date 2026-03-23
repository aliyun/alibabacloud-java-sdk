// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully stop the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-m5sc1271fv344a1r****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stop mode to use when stopping the instance. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: economical mode. When economical mode is enabled:</p>
     * <ul>
     * <li>Computing resources are no longer billed.</li>
     * <li>System disk and data disk continue to be billed.</li>
     * <li>Because computing resources are revoked, the instance might fail to start due to insufficient inventory. In this case, try again later or change the instance type.</li>
     * </ul>
     * </li>
     * <li><p>KeepCharging: normal stop mode. The instance continues to incur charges after it is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepCharging</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRCInstanceRequest self = new StopRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopRCInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopRCInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopRCInstanceRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}
