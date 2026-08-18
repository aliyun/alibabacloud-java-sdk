// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestoreDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true.</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The backup set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The region where the backup set resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("BackupSetRegion")
    public String backupSetRegion;

    /**
     * <p>The number of compute nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    /**
     * <p>The client token used to ensure the idempotence of the request. Use a different value for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the source instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-***</p>
     */
    @NameInMap("CloneInstanceName")
    public String cloneInstanceName;

    /**
     * <p>The compute node specifications. Valid values:</p>
     * <ul>
     * <li>polarx.x4.medium.2e: 2 cores, 8 GB</li>
     * <li>polarx.x4.large.2e: 4 cores, 16 GB</li>
     * <li>polarx.x8.large.2e: 4 cores, 32 GB</li>
     * <li>polarx.x4.xlarge.2e: 8 cores, 32 GB</li>
     * <li>polarx.x8.xlarge.2e: 8 cores, 64 GB</li>
     * <li>polarx.x4.2xlarge.2e: 16 cores, 64 GB</li>
     * <li>polarx.x8.2xlarge.2e: 16 cores, 128 GB</li>
     * <li>polarx.x4.4xlarge.2e: 32 cores, 128 GB</li>
     * <li>polarx.x8.4xlarge.2e: 32 cores, 256 GB</li>
     * <li>polarx.st.8xlarge.2e: 60 cores, 470 GB</li>
     * <li>polarx.st.12xlarge.2e: 90 cores, 720 GB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.medium.2e</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>The node specifications. Valid values:</p>
     * <ul>
     * <li>polarx.x4.medium.2e: 2 cores, 8 GB</li>
     * <li>polarx.x4.large.2e: 4 cores, 16 GB</li>
     * <li>polarx.x8.large.2e: 4 cores, 32 GB</li>
     * <li>polarx.x4.xlarge.2e: 8 cores, 32 GB</li>
     * <li>polarx.x8.xlarge.2e: 8 cores, 64 GB</li>
     * <li>polarx.x4.2xlarge.2e: 16 cores, 64 GB</li>
     * <li>polarx.x8.2xlarge.2e: 16 cores, 128 GB</li>
     * <li>polarx.x4.4xlarge.2e: 32 cores, 128 GB</li>
     * <li>polarx.x8.4xlarge.2e: 32 cores, 256 GB</li>
     * <li>polarx.st.8xlarge.2e: 60 cores, 470 GB</li>
     * <li>polarx.st.12xlarge.2e: 90 cores, 720 GB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.2xlarge.2d</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of instance nodes. The minimum value is 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeCount")
    public Integer DBNodeCount;

    /**
     * <p>The number of storage nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    /**
     * <p>The storage node specifications. Valid values:</p>
     * <ul>
     * <li>mysql.n4.medium.25: 2 cores, 8 GB</li>
     * <li>mysql.n4.large.25: 4 cores, 16 GB</li>
     * <li>mysql.x8.large.25: 4 cores, 32 GB</li>
     * <li>mysql.n4.xlarge.25: 8 cores, 32 GB</li>
     * <li>mysql.x8.xlarge.25: 8 cores, 64 GB</li>
     * <li>mysql.n4.2xlarge.25: 16 cores, 64 GB</li>
     * <li>mysql.x8.2xlarge.25: 16 cores, 128 GB</li>
     * <li>mysql.x4.4xlarge.25: 32 cores, 128 GB</li>
     * <li>mysql.x8.4xlarge.25: 32 cores, 256 GB</li>
     * <li>mysql.st.8xlarge.25: 60 cores, 470 GB</li>
     * <li>mysql.st.12xlarge.25: 90 cores, 720 GB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql.n4.medium.25</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>The MySQL DPI engine version. Valid values: 5.7 and 8.0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The GDN role.</p>
     * 
     * <strong>example:</strong>
     * <p>standby</p>
     */
    @NameInMap("GdnRole")
    public String gdnRole;

    /**
     * <p>The network type. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the instance.</p>
     * <ul>
     * <li>PREPAY: subscription</li>
     * <li>POSTPAY: pay-as-you-go</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle. Valid values for subscription: Year and Month. Default value for pay-as-you-go: Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The recovery type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Clone</p>
     */
    @NameInMap("RecoveryTypeCode")
    public String recoveryTypeCode;

    /**
     * <p>The region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The point in time to which you want to restore the instance. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-14T00:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-a</p>
     */
    @NameInMap("SecondaryZone")
    public String secondaryZone;

    /**
     * <p>The instance series. Valid values:</p>
     * <ul>
     * <li>enterprise: Enterprise Edition.</li>
     * <li>standard: Standard Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The region where the source instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("SourceInstanceRegion")
    public String sourceInstanceRegion;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The zone for Three-zone deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>The topology type. Valid values:</p>
     * <ul>
     * <li>3azones: three-zone deployment.</li>
     * <li>1azone: single-zone deployment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The subscription duration. Specify the number of months or years.</p>
     * <blockquote>
     * <p>If Period is set to Year, valid values of this parameter are 1, 2, and 3.</p>
     * </blockquote>
     * 
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
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone of the instance.</p>
     * 
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
