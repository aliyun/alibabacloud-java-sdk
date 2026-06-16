// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeCDCVersionRequest extends TeaModel {
    /**
     * <p>The target database engine version to which you want to upgrade. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBClusterVersion</a> operation to query the upgrade instructions for all database engine versions in a specific region.</p>
     * 
     * <strong>example:</strong>
     * <p>2.343</p>
     */
    @NameInMap("CdcDbVersion")
    public String cdcDbVersion;

    /**
     * <p>The target version number to which you want to upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx-cdc-kernel-5.4.19-20240928_17274884</p>
     */
    @NameInMap("CdcMinorVersion")
    public String cdcMinorVersion;

    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in a specific region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzrp****3p72fi</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-shrvdc****wtf5uk-cdc</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region in which the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The switch mode. Valid values:</p>
     * <ul>
     * <li>0: immediately switches.</li>
     * <li>1: switches within the O&amp;M window.</li>
     * </ul>
     * 
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
