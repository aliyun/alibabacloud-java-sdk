// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDbClusterAttributeZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-13T01:20:28Z</p>
     */
    @NameInMap("AiCreatingTime")
    public String aiCreatingTime;

    /**
     * <strong>example:</strong>
     * <p>DLNode</p>
     */
    @NameInMap("AiType")
    public String aiType;

    /**
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("AutoUpgradeMinorVersion")
    public String autoUpgradeMinorVersion;

    /**
     * <strong>example:</strong>
     * <p>7,864,320</p>
     */
    @NameInMap("BlktagTotal")
    public Long blktagTotal;

    /**
     * <strong>example:</strong>
     * <p>5,242,880</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public String burstingEnabled;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorageMode")
    public String compressStorageMode;

    /**
     * <strong>example:</strong>
     * <p>15529410560</p>
     */
    @NameInMap("CompressStorageUsed")
    public Long compressStorageUsed;

    /**
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>polar.mysql.x8.medium.c</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("DBNodes")
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> DBNodes;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <strong>example:</strong>
     * <p>Stable</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <strong>example:</strong>
     * <p>74448896</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <strong>example:</strong>
     * <p>AsyncSync</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    /**
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasCompleteStandbyRes")
    public Boolean hasCompleteStandbyRes;

    /**
     * <strong>example:</strong>
     * <p>StandbyClusterON</p>
     */
    @NameInMap("HotStandbyCluster")
    public String hotStandbyCluster;

    /**
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ImperceptibleSwitch")
    public String imperceptibleSwitch;

    /**
     * <strong>example:</strong>
     * <p>6,291,456</p>
     */
    @NameInMap("InodeTotal")
    public Long inodeTotal;

    /**
     * <strong>example:</strong>
     * <p>4,194,304</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public Boolean isProxyLatestVersion;

    /**
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <strong>example:</strong>
     * <p>18:00Z-19:00Z</p>
     */
    @NameInMap("MaintainTime")
    public String maintainTime;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("Orca")
    public String orca;

    /**
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProvisionedIops")
    public String provisionedIops;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProxyCpuCores")
    public String proxyCpuCores;

    /**
     * <strong>example:</strong>
     * <p>SteadyServerless</p>
     */
    @NameInMap("ProxyServerlessType")
    public String proxyServerlessType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProxyStandardCpuCores")
    public String proxyStandardCpuCores;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>074467EF-86B9-4C23-ACBF-E9B81A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>2179639137</p>
     */
    @NameInMap("RestoreDataPoint")
    public String restoreDataPoint;

    /**
     * <strong>example:</strong>
     * <p>RestoreByTime</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>RowCompression</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("RowCompression")
    public String rowCompression;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <strong>example:</strong>
     * <p>AgileServerless</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <strong>example:</strong>
     * <p>pc-pz51ziv48317b2880</p>
     */
    @NameInMap("SourceDBCluster")
    public String sourceDBCluster;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    /**
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <strong>example:</strong>
     * <p>10995116277760</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <strong>example:</strong>
     * <p>ESSDPL0</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <strong>example:</strong>
     * <p>Exclusive</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    /**
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("SupportInstantSwitchWithImci")
    public String supportInstantSwitchWithImci;

    @NameInMap("Tags")
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <strong>example:</strong>
     * <p>vsw-**********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i,cn-hangzhou-g</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static DescribeDbClusterAttributeZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterAttributeZonalResponseBody self = new DescribeDbClusterAttributeZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterAttributeZonalResponseBody setAiCreatingTime(String aiCreatingTime) {
        this.aiCreatingTime = aiCreatingTime;
        return this;
    }
    public String getAiCreatingTime() {
        return this.aiCreatingTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setAiType(String aiType) {
        this.aiType = aiType;
        return this;
    }
    public String getAiType() {
        return this.aiType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeDbClusterAttributeZonalResponseBody setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBlktagTotal(Long blktagTotal) {
        this.blktagTotal = blktagTotal;
        return this;
    }
    public Long getBlktagTotal() {
        return this.blktagTotal;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBlktagUsed(Long blktagUsed) {
        this.blktagUsed = blktagUsed;
        return this;
    }
    public Long getBlktagUsed() {
        return this.blktagUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setBurstingEnabled(String burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCompressStorageMode(String compressStorageMode) {
        this.compressStorageMode = compressStorageMode;
        return this;
    }
    public String getCompressStorageMode() {
        return this.compressStorageMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCompressStorageUsed(Long compressStorageUsed) {
        this.compressStorageUsed = compressStorageUsed;
        return this;
    }
    public Long getCompressStorageUsed() {
        return this.compressStorageUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBNodes(java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
        this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
        return this;
    }
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setDeletionLock(Integer deletionLock) {
        this.deletionLock = deletionLock;
        return this;
    }
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    public DescribeDbClusterAttributeZonalResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDbClusterAttributeZonalResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDbClusterAttributeZonalResponseBody setHasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
        this.hasCompleteStandbyRes = hasCompleteStandbyRes;
        return this;
    }
    public Boolean getHasCompleteStandbyRes() {
        return this.hasCompleteStandbyRes;
    }

    public DescribeDbClusterAttributeZonalResponseBody setHotStandbyCluster(String hotStandbyCluster) {
        this.hotStandbyCluster = hotStandbyCluster;
        return this;
    }
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    public DescribeDbClusterAttributeZonalResponseBody setImciAutoIndex(String imciAutoIndex) {
        this.imciAutoIndex = imciAutoIndex;
        return this;
    }
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    public DescribeDbClusterAttributeZonalResponseBody setImperceptibleSwitch(String imperceptibleSwitch) {
        this.imperceptibleSwitch = imperceptibleSwitch;
        return this;
    }
    public String getImperceptibleSwitch() {
        return this.imperceptibleSwitch;
    }

    public DescribeDbClusterAttributeZonalResponseBody setInodeTotal(Long inodeTotal) {
        this.inodeTotal = inodeTotal;
        return this;
    }
    public Long getInodeTotal() {
        return this.inodeTotal;
    }

    public DescribeDbClusterAttributeZonalResponseBody setInodeUsed(Long inodeUsed) {
        this.inodeUsed = inodeUsed;
        return this;
    }
    public Long getInodeUsed() {
        return this.inodeUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setIsProxyLatestVersion(Boolean isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public Boolean getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDbClusterAttributeZonalResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeDbClusterAttributeZonalResponseBody setOrca(String orca) {
        this.orca = orca;
        return this;
    }
    public String getOrca() {
        return this.orca;
    }

    public DescribeDbClusterAttributeZonalResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProvisionedIops(String provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyCpuCores(String proxyCpuCores) {
        this.proxyCpuCores = proxyCpuCores;
        return this;
    }
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyServerlessType(String proxyServerlessType) {
        this.proxyServerlessType = proxyServerlessType;
        return this;
    }
    public String getProxyServerlessType() {
        return this.proxyServerlessType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyStandardCpuCores(String proxyStandardCpuCores) {
        this.proxyStandardCpuCores = proxyStandardCpuCores;
        return this;
    }
    public String getProxyStandardCpuCores() {
        return this.proxyStandardCpuCores;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public DescribeDbClusterAttributeZonalResponseBody setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRestoreDataPoint(String restoreDataPoint) {
        this.restoreDataPoint = restoreDataPoint;
        return this;
    }
    public String getRestoreDataPoint() {
        return this.restoreDataPoint;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setRowCompression(String rowCompression) {
        this.rowCompression = rowCompression;
        return this;
    }
    public String getRowCompression() {
        return this.rowCompression;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeDbClusterAttributeZonalResponseBody setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSourceDBCluster(String sourceDBCluster) {
        this.sourceDBCluster = sourceDBCluster;
        return this;
    }
    public String getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStandbyHAMode(String standbyHAMode) {
        this.standbyHAMode = standbyHAMode;
        return this;
    }
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageMax(Long storageMax) {
        this.storageMax = storageMax;
        return this;
    }
    public Long getStorageMax() {
        return this.storageMax;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStoragePayType(String storagePayType) {
        this.storagePayType = storagePayType;
        return this;
    }
    public String getStoragePayType() {
        return this.storagePayType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDbClusterAttributeZonalResponseBody setStrictConsistency(String strictConsistency) {
        this.strictConsistency = strictConsistency;
        return this;
    }
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public DescribeDbClusterAttributeZonalResponseBody setSupportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
        this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
        return this;
    }
    public String getSupportInstantSwitchWithImci() {
        return this.supportInstantSwitchWithImci;
    }

    public DescribeDbClusterAttributeZonalResponseBody setTags(java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDbClusterAttributeZonalResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDbClusterAttributeZonalResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDbClusterAttributeZonalResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class DescribeDbClusterAttributeZonalResponseBodyDBNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AddedCpuCores")
        public String addedCpuCores;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>Reader</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <strong>example:</strong>
         * <p>pi-bp18z52akld3*****</p>
         */
        @NameInMap("MasterId")
        public String masterId;

        /**
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <strong>example:</strong>
         * <p>pi-bp18z52mirror*****</p>
         */
        @NameInMap("MirrorInsName")
        public String mirrorInsName;

        /**
         * <p>MultiMasterLocalStandby</p>
         * 
         * <strong>example:</strong>
         * <p>MultiMasterLocalStandby</p>
         */
        @NameInMap("MultiMasterLocalStandby")
        public String multiMasterLocalStandby;

        /**
         * <p>MultiMasterPrimaryNode</p>
         * 
         * <strong>example:</strong>
         * <p>MultiMasterPrimaryNode</p>
         */
        @NameInMap("MultiMasterPrimaryNode")
        public String multiMasterPrimaryNode;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Orca")
        public String orca;

        /**
         * <strong>example:</strong>
         * <p>3072</p>
         */
        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerWeight")
        public String serverWeight;

        /**
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("SubCluster")
        public String subCluster;

        /**
         * <p>SubGroupDescription</p>
         * 
         * <strong>example:</strong>
         * <p>SubGroupDescription</p>
         */
        @NameInMap("SubGroupDescription")
        public String subGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDbClusterAttributeZonalResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterAttributeZonalResponseBodyDBNodes self = new DescribeDbClusterAttributeZonalResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setAddedCpuCores(String addedCpuCores) {
            this.addedCpuCores = addedCpuCores;
            return this;
        }
        public String getAddedCpuCores() {
            return this.addedCpuCores;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeDescription(String DBNodeDescription) {
            this.DBNodeDescription = DBNodeDescription;
            return this;
        }
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setHotReplicaMode(String hotReplicaMode) {
            this.hotReplicaMode = hotReplicaMode;
            return this;
        }
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setImciSwitch(String imciSwitch) {
            this.imciSwitch = imciSwitch;
            return this;
        }
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMirrorInsName(String mirrorInsName) {
            this.mirrorInsName = mirrorInsName;
            return this;
        }
        public String getMirrorInsName() {
            return this.mirrorInsName;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMultiMasterLocalStandby(String multiMasterLocalStandby) {
            this.multiMasterLocalStandby = multiMasterLocalStandby;
            return this;
        }
        public String getMultiMasterLocalStandby() {
            return this.multiMasterLocalStandby;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setMultiMasterPrimaryNode(String multiMasterPrimaryNode) {
            this.multiMasterPrimaryNode = multiMasterPrimaryNode;
            return this;
        }
        public String getMultiMasterPrimaryNode() {
            return this.multiMasterPrimaryNode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setOrca(String orca) {
            this.orca = orca;
            return this;
        }
        public String getOrca() {
            return this.orca;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setRemoteMemorySize(String remoteMemorySize) {
            this.remoteMemorySize = remoteMemorySize;
            return this;
        }
        public String getRemoteMemorySize() {
            return this.remoteMemorySize;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setServerWeight(String serverWeight) {
            this.serverWeight = serverWeight;
            return this;
        }
        public String getServerWeight() {
            return this.serverWeight;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSubCluster(String subCluster) {
            this.subCluster = subCluster;
            return this;
        }
        public String getSubCluster() {
            return this.subCluster;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setSubGroupDescription(String subGroupDescription) {
            this.subGroupDescription = subGroupDescription;
            return this;
        }
        public String getSubGroupDescription() {
            return this.subGroupDescription;
        }

        public DescribeDbClusterAttributeZonalResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDbClusterAttributeZonalResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDbClusterAttributeZonalResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterAttributeZonalResponseBodyTags self = new DescribeDbClusterAttributeZonalResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterAttributeZonalResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDbClusterAttributeZonalResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
