// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeCDCVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2.343</p>
     */
    @NameInMap("CdcDbVersion")
    public String cdcDbVersion;

    /**
     * <strong>example:</strong>
     * <p>polarx-cdc-kernel-5.4.19-20240928_17274884</p>
     */
    @NameInMap("CdcMinorVersion")
    public String cdcMinorVersion;

    /**
     * <strong>example:</strong>
     * <p>pxc-hzrp****3p72fi</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>pxc-shrvdc****wtf5uk-cdc</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static UpgradeCDCVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCDCVersionRequest self = new UpgradeCDCVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeCDCVersionRequest setCdcDbVersion(String cdcDbVersion) {
        this.cdcDbVersion = cdcDbVersion;
        return this;
    }
    public String getCdcDbVersion() {
        return this.cdcDbVersion;
    }

    public UpgradeCDCVersionRequest setCdcMinorVersion(String cdcMinorVersion) {
        this.cdcMinorVersion = cdcMinorVersion;
        return this;
    }
    public String getCdcMinorVersion() {
        return this.cdcMinorVersion;
    }

    public UpgradeCDCVersionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeCDCVersionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpgradeCDCVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeCDCVersionRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
