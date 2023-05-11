// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SwitchMode")
    public String switchMode;

    public static UpgradeDBInstanceKernelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionRequest self = new UpgradeDBInstanceKernelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceKernelVersionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBInstanceKernelVersionRequest setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public UpgradeDBInstanceKernelVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeDBInstanceKernelVersionRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
