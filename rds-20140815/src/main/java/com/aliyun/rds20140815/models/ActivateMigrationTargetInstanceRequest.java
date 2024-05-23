// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ActivateMigrationTargetInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Specifies whether to forcefully perform a switchover. Set the value to 1. The value 1 specifies a forceful switchover.</p>
     */
    @NameInMap("ForceSwitch")
    public String forceSwitch;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A reserved parameter. This parameter does not take effect.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The time when you want to perform the switchover.</p>
     * <br>
     * <p>Set the value to 0. The value 0 specifies an immediate switchover.</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static ActivateMigrationTargetInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateMigrationTargetInstanceRequest self = new ActivateMigrationTargetInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ActivateMigrationTargetInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ActivateMigrationTargetInstanceRequest setForceSwitch(String forceSwitch) {
        this.forceSwitch = forceSwitch;
        return this;
    }
    public String getForceSwitch() {
        return this.forceSwitch;
    }

    public ActivateMigrationTargetInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ActivateMigrationTargetInstanceRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ActivateMigrationTargetInstanceRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
