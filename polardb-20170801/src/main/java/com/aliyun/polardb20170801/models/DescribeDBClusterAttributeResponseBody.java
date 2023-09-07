// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The information status of the AI node. Valid values:</p>
     * <br>
     * <p>*   SearchNode: search node.</p>
     * <p>*   DLNode: AI node</p>
     */
    @NameInMap("AiType")
    public String aiType;

    /**
     * <p>Maximum blktags in file system.</p>
     */
    @NameInMap("BlktagTotal")
    public Long blktagTotal;

    /**
     * <p>The current blktag usage.</p>
     */
    @NameInMap("BlktagUsed")
    public Long blktagUsed;

    /**
     * <p>[The edition of PolarDB](~~183258~~). Valid values:</p>
     * <br>
     * <p>*   **Normal**: Cluster Edition.</p>
     * <p>*   **Basic**: Single Node Edition.</p>
     * <p>*   **Archive**: X-Engine Edition.</p>
     * <p>*   **NormalMultimaster**: Multi-master Cluster Edition.</p>
     * <p>*   **SENormal**: Standard Edition.</p>
     * <br>
     * <p>>-  Only PolarDB for MySQL supports Single Node Edition.</p>
     * <p>>- Only PolarDB for MySQL 8.0.1 supports Standard Edition.</p>
     * <p>>- Only PolarDB for MySQL 8.0 supports X-Engine Edition and Multi-master Cluster Edition.</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("CompressStorageMode")
    public String compressStorageMode;

    /**
     * <p>The time when the cluster was created.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the cluster.</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The ID of cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The network type of the cluster.</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The status of the cluster. For information about the valid values, see [Cluster states](~~99286~~).</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The details of the nodes.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes;

    /**
     * <p>The type of the database engine.</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The status of the minor version. Valid values:</p>
     * <br>
     * <p>*   **Stable**: The minor version is stable.</p>
     * <p>*   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</p>
     * <p>*   **HighRisk**: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.</p>
     * <br>
     * <p>> For more information about how to upgrade the minor version, see [Upgrade versions](~~158572~~).</p>
     */
    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    /**
     * <p>The total physical storage of level-1 backups (snapshots). Unit: bytes.</p>
     */
    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    /**
     * <p>Indicates the rule of data replication. Valid values: AsyncSync: asynchronous. SemiSync: semi-synchronous.</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <p>Indicates whether the cluster is locked and can be deleted. Valid values:</p>
     * <br>
     * <p>*   **0**: The cluster is not locked and can be deleted.</p>
     * <p>*   **1**: The cluster is locked and cannot be deleted.</p>
     */
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    /**
     * <p>The unit to which the cluster belongs.</p>
     */
    @NameInMap("DeployUnit")
    public String deployUnit;

    /**
     * <p>The database type.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The time when the cluster expires.</p>
     * <br>
     * <p>> A specific value will be returned only for subscription (**Prepaid**) clusters. For pay-as-you-go (**Postpaid**) clusters, an empty string will be returned.</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the cluster has expired. Valid values:</p>
     * <br>
     * <p>> This parameter is returned only for subscription (**Prepaid**) clusters.</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Indicates whether to replenish resources for the primary database after a cross-zone switchover. Valid values: true false</p>
     */
    @NameInMap("HasCompleteStandbyRes")
    public Boolean hasCompleteStandbyRes;

    /**
     * <p>Maximum inodes in file system.</p>
     */
    @NameInMap("InodeTotal")
    public Long inodeTotal;

    /**
     * <p>The current inode usage.</p>
     */
    @NameInMap("InodeUsed")
    public Long inodeUsed;

    /**
     * <p>Indicates whether the kernel is of the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>Indicates whether PolarProxy uses the latest version. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsProxyLatestVersion")
    public Boolean isProxyLatestVersion;

    /**
     * <p>The lock mode. Valid values:</p>
     * <br>
     * <p>*   **Unlock**: The cluster is not locked.</p>
     * <p>*   **ManualLock**: The cluster is manually locked.</p>
     * <p>*   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance window of the cluster. The format is `HH:mmZ-HH:mmZ`. The time is displayed in UTC. For example, the value `16:00Z-17:00Z` indicates that the cluster can be maintained from 00:00 to 01:00 (UTC+08:00).</p>
     */
    @NameInMap("MaintainTime")
    public String maintainTime;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The number of CPU cores for PolarProxy.</p>
     */
    @NameInMap("ProxyCpuCores")
    public String proxyCpuCores;

    /**
     * <p>The type of the serverless PolarProxy. Valid value: AgileServerless.</p>
     */
    @NameInMap("ProxyServerlessType")
    public String proxyServerlessType;

    /**
     * <p>The number of CPU cores for PolarProxy Standard Enterprise Edition.</p>
     */
    @NameInMap("ProxyStandardCpuCores")
    public String proxyStandardCpuCores;

    /**
     * <p>The status of PolarProxy. Valid values:</p>
     * <br>
     * <p>*   **Creating**: PolarProxy is being created.</p>
     * <p>*   **Running**: PolarProxy is running.</p>
     * <p>*   **Deleting**: PolarProxy is being released.</p>
     * <p>*   **Rebooting**: PolarProxy is restarting.</p>
     * <p>*   **DBNodeCreating**: PolarProxy is being added.</p>
     * <p>*   **DBNodeDeleting**: PolarProxy is being deleted.</p>
     * <p>*   **ClassChanging**: The specifications of PolarProxy are being changed.</p>
     * <p>*   **NetAddressCreating**: The network connection is being created.</p>
     * <p>*   **NetAddressDeleting**: The network connection is being deleted.</p>
     * <p>*   **NetAddressModifying**: The network connection is being modified.</p>
     * <p>*   **Deleted**: PolarProxy is released.</p>
     */
    @NameInMap("ProxyStatus")
    public String proxyStatus;

    /**
     * <p>The type of PolarProxy. Valid values:</p>
     * <br>
     * <p>*   **Exclusive**: Dedicated Enterprise Edition</p>
     * <p>*   **General**: Standard Enterprise Edition</p>
     */
    @NameInMap("ProxyType")
    public String proxyType;

    /**
     * <p>The region ID of the security group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of your Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The storage of SQL. Unit: bytes. If the value is -1, no data is stored.</p>
     */
    @NameInMap("SQLSize")
    public Long SQLSize;

    /**
     * <p>The type of the serverless cluster. Only **AgileServerless** can be returned.</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>Indicates whether the cross-zone disaster recovery feature is enabled. Valid values: ON OFF 0: Customer Drill Mode</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>The maximum storage capacity of the current cluster specification. Unit: bytes.</p>
     */
    @NameInMap("StorageMax")
    public Long storageMax;

    /**
     * <p>The billing method of the storage. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription.</p>
     */
    @NameInMap("StoragePayType")
    public String storagePayType;

    /**
     * <p>The storage space that uses the subscription billing method. Unit: bytes.</p>
     */
    @NameInMap("StorageSpace")
    public Long storageSpace;

    /**
     * <p>The storage type. Set the value to **HighPerformance**.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The storage space consumed by the cluster. Unit: bytes.</p>
     */
    @NameInMap("StorageUsed")
    public Long storageUsed;

    /**
     * <p>Indicates whether the multi-zone data consistency feature is enabled for the cluster. Valid values:</p>
     * <br>
     * <p>*   **ON**: Multi-zone data consistency is enabled, which is suitable for Standard Edition clusters that run Multi-zone Edition.</p>
     * <p>*   **OFF**</p>
     */
    @NameInMap("StrictConsistency")
    public String strictConsistency;

    /**
     * <p>The specification type of the compute node. Valid values:</p>
     * <br>
     * <p>*   **Exclusive**: dedicated.</p>
     * <p>*   **General**: general-purpose.</p>
     * <br>
     * <p>> This parameter is supported only for PolarDB for MySQL clusters of Cluster Edition.</p>
     */
    @NameInMap("SubCategory")
    public String subCategory;

    /**
     * <p>Details about the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags;

    /**
     * <p>The VPC ID of the cluster.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setAiType(String aiType) {
        this.aiType = aiType;
        return this;
    }
    public String getAiType() {
        return this.aiType;
    }

    public DescribeDBClusterAttributeResponseBody setBlktagTotal(Long blktagTotal) {
        this.blktagTotal = blktagTotal;
        return this;
    }
    public Long getBlktagTotal() {
        return this.blktagTotal;
    }

    public DescribeDBClusterAttributeResponseBody setBlktagUsed(Long blktagUsed) {
        this.blktagUsed = blktagUsed;
        return this;
    }
    public Long getBlktagUsed() {
        return this.blktagUsed;
    }

    public DescribeDBClusterAttributeResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDBClusterAttributeResponseBody setCompressStorageMode(String compressStorageMode) {
        this.compressStorageMode = compressStorageMode;
        return this;
    }
    public String getCompressStorageMode() {
        return this.compressStorageMode;
    }

    public DescribeDBClusterAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClusterAttributeResponseBody setDBNodes(java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDBClusterAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterAttributeResponseBody setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
        this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
        return this;
    }
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    public DescribeDBClusterAttributeResponseBody setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    public DescribeDBClusterAttributeResponseBody setDeletionLock(Integer deletionLock) {
        this.deletionLock = deletionLock;
        return this;
    }
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    public DescribeDBClusterAttributeResponseBody setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public DescribeDBClusterAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBClusterAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBClusterAttributeResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBClusterAttributeResponseBody setHasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
        this.hasCompleteStandbyRes = hasCompleteStandbyRes;
        return this;
    }
    public Boolean getHasCompleteStandbyRes() {
        return this.hasCompleteStandbyRes;
    }

    public DescribeDBClusterAttributeResponseBody setInodeTotal(Long inodeTotal) {
        this.inodeTotal = inodeTotal;
        return this;
    }
    public Long getInodeTotal() {
        return this.inodeTotal;
    }

    public DescribeDBClusterAttributeResponseBody setInodeUsed(Long inodeUsed) {
        this.inodeUsed = inodeUsed;
        return this;
    }
    public Long getInodeUsed() {
        return this.inodeUsed;
    }

    public DescribeDBClusterAttributeResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterAttributeResponseBody setIsProxyLatestVersion(Boolean isProxyLatestVersion) {
        this.isProxyLatestVersion = isProxyLatestVersion;
        return this;
    }
    public Boolean getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    public DescribeDBClusterAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDBClusterAttributeResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeDBClusterAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClusterAttributeResponseBody setProxyCpuCores(String proxyCpuCores) {
        this.proxyCpuCores = proxyCpuCores;
        return this;
    }
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
    }

    public DescribeDBClusterAttributeResponseBody setProxyServerlessType(String proxyServerlessType) {
        this.proxyServerlessType = proxyServerlessType;
        return this;
    }
    public String getProxyServerlessType() {
        return this.proxyServerlessType;
    }

    public DescribeDBClusterAttributeResponseBody setProxyStandardCpuCores(String proxyStandardCpuCores) {
        this.proxyStandardCpuCores = proxyStandardCpuCores;
        return this;
    }
    public String getProxyStandardCpuCores() {
        return this.proxyStandardCpuCores;
    }

    public DescribeDBClusterAttributeResponseBody setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus;
        return this;
    }
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    public DescribeDBClusterAttributeResponseBody setProxyType(String proxyType) {
        this.proxyType = proxyType;
        return this;
    }
    public String getProxyType() {
        return this.proxyType;
    }

    public DescribeDBClusterAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClusterAttributeResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeDBClusterAttributeResponseBody setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeDBClusterAttributeResponseBody setStandbyHAMode(String standbyHAMode) {
        this.standbyHAMode = standbyHAMode;
        return this;
    }
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    public DescribeDBClusterAttributeResponseBody setStorageMax(Long storageMax) {
        this.storageMax = storageMax;
        return this;
    }
    public Long getStorageMax() {
        return this.storageMax;
    }

    public DescribeDBClusterAttributeResponseBody setStoragePayType(String storagePayType) {
        this.storagePayType = storagePayType;
        return this;
    }
    public String getStoragePayType() {
        return this.storagePayType;
    }

    public DescribeDBClusterAttributeResponseBody setStorageSpace(Long storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    public DescribeDBClusterAttributeResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeDBClusterAttributeResponseBody setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDBClusterAttributeResponseBody setStrictConsistency(String strictConsistency) {
        this.strictConsistency = strictConsistency;
        return this;
    }
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    public DescribeDBClusterAttributeResponseBody setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public DescribeDBClusterAttributeResponseBody setTags(java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDBClusterAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDBClusterAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBClusterAttributeResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class DescribeDBClusterAttributeResponseBodyDBNodes extends TeaModel {
        /**
         * <p>The number of CPU cores for compute node scale-out within seconds.</p>
         */
        @NameInMap("AddedCpuCores")
        public String addedCpuCores;

        /**
         * <p>The time when the node was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of the node.</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **Writer**: The node is the primary node.</p>
         * <p>*   **Reader**: The node is a read-only node.</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The cluster is being created.</p>
         * <p>*   **Running**: The cluster is running.</p>
         * <p>*   **Deleting**: The cluster is being deleted.</p>
         * <p>*   **Rebooting**: The cluster is restarting.</p>
         * <p>*   **DBNodeCreating**: PolarProxy is being added.</p>
         * <p>*   **DBNodeDeleting**: PolarProxy is being deleted.</p>
         * <p>*   **ClassChanging**: The specification type of PolarProxy are being modified.</p>
         * <p>*   **NetAddressCreating**: The network connection is being created.</p>
         * <p>*   **NetAddressDeleting**: The network connection is being deleted.</p>
         * <p>*   **NetAddressModifying**: The network connection is being modified.</p>
         * <p>*   **MinorVersionUpgrading**: The minor version is being updated.</p>
         * <p>*   **Maintaining**: The cluster is being maintained.</p>
         * <p>*   **Switching**: A failover is being performed.</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The failover priority. Each node is assigned a failover priority. If a failover occurs, a node can be selected as a primary node. The priority determines the probability at which a node is selected as a primary node. A larger value indicates a higher priority. Valid values: 1 to 15.</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <p>Indicates whether the hot standby feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **ON**</p>
         * <p>*   **OFF**</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **ON**</p>
         * <p>*   **OFF**</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>The ID of the primary node in the cluster that runs Multi-master Cluster Edition.</p>
         */
        @NameInMap("MasterId")
        public String masterId;

        /**
         * <p>The maximum number of concurrent connections in the cluster.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum input/output operations per second (IOPS).</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>Indicates whether the global consistency (high-performance mode) feature is enabled for the node. Valid values:</p>
         * <br>
         * <p>*   **ON**</p>
         * <p>*   **OFF**</p>
         */
        @NameInMap("SccMode")
        public String sccMode;

        /**
         * <p>The routing weight of the node. Valid values: 1 to 100 Default value: 1.</p>
         */
        @NameInMap("ServerWeight")
        public String serverWeight;

        /**
         * <p>The type of the serverless node. Only **AgileServerless** can be returned.</p>
         * <br>
         * <p>> This parameter is supported only for serverless clusters.</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClusterAttributeResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBNodes self = new DescribeDBClusterAttributeResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setAddedCpuCores(String addedCpuCores) {
            this.addedCpuCores = addedCpuCores;
            return this;
        }
        public String getAddedCpuCores() {
            return this.addedCpuCores;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setHotReplicaMode(String hotReplicaMode) {
            this.hotReplicaMode = hotReplicaMode;
            return this;
        }
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setImciSwitch(String imciSwitch) {
            this.imciSwitch = imciSwitch;
            return this;
        }
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMasterId(String masterId) {
            this.masterId = masterId;
            return this;
        }
        public String getMasterId() {
            return this.masterId;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setSccMode(String sccMode) {
            this.sccMode = sccMode;
            return this;
        }
        public String getSccMode() {
            return this.sccMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setServerWeight(String serverWeight) {
            this.serverWeight = serverWeight;
            return this;
        }
        public String getServerWeight() {
            return this.serverWeight;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyTags self = new DescribeDBClusterAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
