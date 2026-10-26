// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopRCInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to force a shutdown. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Forces a shutdown.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Performs a normal shutdown.</p>
     * </li>
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
     * <p>The stop mode configured when the instance is stopped. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: Economical mode. After economical mode is enabled:</p>
     * <ul>
     * <li>Billing for compute resources is suspended.</li>
     * <li>Billing for the system cloud disk and data cloud disks continues.</li>
     * <li>Because compute resources are reclaimed, the instance may fail to start due to insufficient inventory. Try again later or change the instance type.</li>
     * </ul>
     * </li>
     * <li><p>KeepCharging: Standard mode. The instance continues to be billed after it is stopped.</p>
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
