// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestoreDBInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("BackupSetRegion")
    public String backupSetRegion;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-***</p>
     */
    @NameInMap("CloneInstanceName")
    public String cloneInstanceName;

    /**
     * <strong>example:</strong>
     * <p>polarx.x4.medium.2e</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <strong>example:</strong>
     * <p>polarx.x4.2xlarge.2d</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeCount")
    public Integer DBNodeCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>mysql.n4.medium.25</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <strong>example:</strong>
     * <p>standby</p>
     */
    @NameInMap("GdnRole")
    public String gdnRole;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Clone</p>
     */
    @NameInMap("RecoveryTypeCode")
    public String recoveryTypeCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>2024-10-14T00:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-a</p>
     */
    @NameInMap("SecondaryZone")
    public String secondaryZone;

    /**
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("SourceInstanceRegion")
    public String sourceInstanceRegion;

    /**
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>VPC ID。</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static RestoreDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreDBInstanceRequest self = new RestoreDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestoreDBInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RestoreDBInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public RestoreDBInstanceRequest setBackupSetRegion(String backupSetRegion) {
        this.backupSetRegion = backupSetRegion;
        return this;
    }
    public String getBackupSetRegion() {
        return this.backupSetRegion;
    }

    public RestoreDBInstanceRequest setCNNodeCount(String CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    public RestoreDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestoreDBInstanceRequest setCloneInstanceName(String cloneInstanceName) {
        this.cloneInstanceName = cloneInstanceName;
        return this;
    }
    public String getCloneInstanceName() {
        return this.cloneInstanceName;
    }

    public RestoreDBInstanceRequest setCnClass(String cnClass) {
        this.cnClass = cnClass;
        return this;
    }
    public String getCnClass() {
        return this.cnClass;
    }

    public RestoreDBInstanceRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public RestoreDBInstanceRequest setDBNodeCount(Integer DBNodeCount) {
        this.DBNodeCount = DBNodeCount;
        return this;
    }
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    public RestoreDBInstanceRequest setDNNodeCount(String DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    public RestoreDBInstanceRequest setDnClass(String dnClass) {
        this.dnClass = dnClass;
        return this;
    }
    public String getDnClass() {
        return this.dnClass;
    }

    public RestoreDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public RestoreDBInstanceRequest setGdnRole(String gdnRole) {
        this.gdnRole = gdnRole;
        return this;
    }
    public String getGdnRole() {
        return this.gdnRole;
    }

    public RestoreDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RestoreDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public RestoreDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RestoreDBInstanceRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public RestoreDBInstanceRequest setRecoveryTypeCode(String recoveryTypeCode) {
        this.recoveryTypeCode = recoveryTypeCode;
        return this;
    }
    public String getRecoveryTypeCode() {
        return this.recoveryTypeCode;
    }

    public RestoreDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RestoreDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public RestoreDBInstanceRequest setSecondaryZone(String secondaryZone) {
        this.secondaryZone = secondaryZone;
        return this;
    }
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    public RestoreDBInstanceRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public RestoreDBInstanceRequest setSourceInstanceRegion(String sourceInstanceRegion) {
        this.sourceInstanceRegion = sourceInstanceRegion;
        return this;
    }
    public String getSourceInstanceRegion() {
        return this.sourceInstanceRegion;
    }

    public RestoreDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public RestoreDBInstanceRequest setTertiaryZone(String tertiaryZone) {
        this.tertiaryZone = tertiaryZone;
        return this;
    }
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    public RestoreDBInstanceRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public RestoreDBInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public RestoreDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public RestoreDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RestoreDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
