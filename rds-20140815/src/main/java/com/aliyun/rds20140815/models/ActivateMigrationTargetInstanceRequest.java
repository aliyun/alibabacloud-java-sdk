// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ActivateMigrationTargetInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the target instance. You can invoke the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp102g323jd4****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Set this parameter to 1, which specifies a forced switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceSwitch")
    public String forceSwitch;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A reserved parameter. This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-25T06:57:41Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The switchover time mode for cloud migration.</p>
     * <p>Set this parameter to 0, which specifies an immediate switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
