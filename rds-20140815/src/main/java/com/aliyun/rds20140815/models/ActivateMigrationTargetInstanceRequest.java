// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ActivateMigrationTargetInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("ForceSwitch")
    public String forceSwitch;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SwitchTime")
    public String switchTime;

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
