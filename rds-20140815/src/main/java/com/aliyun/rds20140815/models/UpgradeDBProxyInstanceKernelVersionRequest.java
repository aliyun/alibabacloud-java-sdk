// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("UpgradeTime")
    public String upgradeTime;

    @NameInMap("SwitchTime")
    public String switchTime;

    public static UpgradeDBProxyInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionRequest self = new UpgradeDBProxyInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public UpgradeDBProxyInstanceKernelVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
