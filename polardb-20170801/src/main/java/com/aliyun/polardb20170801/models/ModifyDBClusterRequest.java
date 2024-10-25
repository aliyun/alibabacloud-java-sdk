// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable storage compression. Set the value to <strong>ON</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorage")
    public String compressStorage;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the DescribeDBClusters operation to query information about all PolarDB clusters that are deployed in a specified region, such as cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The list of nodes for the drill.</p>
     * <blockquote>
     * <p> You can specify only one node for a node-level disaster recovery drill. For a primary zone-level disaster recovery drill, you can either choose not to specify this parameter or specify all nodes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-rwxxx</p>
     */
    @NameInMap("DBNodeCrashList")
    public String DBNodeCrashList;

    /**
     * <p>The method used to replicate data across zones. Valid values:</p>
     * <ul>
     * <li><strong>AsyncSync</strong>: the asynchronous mode.</li>
     * <li><strong>SemiSync</strong>: the semi-synchronous mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AsynSync</p>
     */
    @NameInMap("DataSyncMode")
    public String dataSyncMode;

    /**
     * <p>The fault injection method. Valid values:</p>
     * <ul>
     * <li>CrashSQLInjection: <code>Crash SQL</code>-based fault injection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultInjectionType")
    public String faultInjectionType;

    /**
     * <p>The level of the disaster recovery drill. Valid values:</p>
     * <ul>
     * <li><code>0</code> or <code>FaultInjection</code>: The primary zone level.</li>
     * <li><code>1</code>: The node level.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>In <strong>primary zone-level disaster recovery drill</strong> scenarios, all compute nodes in the primary zone are unavailable. Data loss occurs during failovers in the scenarios.</p>
     * </li>
     * <li><p>In <strong>node-level disaster recovery drill</strong> scenarios, you can specify only one compute node for the disaster recovery drill. You can use the <code>DBNodeCrashList</code> parameter to specify the name of the compute node that you want to use for the drill.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultSimulateMode")
    public String faultSimulateMode;

    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable cross-zone automatic switchover. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: enables cross-zone automatic switchover.</li>
     * <li><strong>OFF</strong>: disables cross-zone automatic switchover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>Specifies whether to enable automatic storage scaling. This parameter is available only for Standard Edition clusters. Valid values:</p>
     * <ul>
     * <li>Enable</li>
     * <li>Disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The maximum storage capacity of the cluster of Standard Edition in automatic scaling. Unit: GB.</p>
     * <blockquote>
     * <p> The maximum value of this parameter is 32000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    public static ModifyDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterRequest self = new ModifyDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterRequest setCompressStorage(String compressStorage) {
        this.compressStorage = compressStorage;
        return this;
    }
    public String getCompressStorage() {
        return this.compressStorage;
    }

    public ModifyDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterRequest setDBNodeCrashList(String DBNodeCrashList) {
        this.DBNodeCrashList = DBNodeCrashList;
        return this;
    }
    public String getDBNodeCrashList() {
        return this.DBNodeCrashList;
    }

    public ModifyDBClusterRequest setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    public ModifyDBClusterRequest setFaultInjectionType(String faultInjectionType) {
        this.faultInjectionType = faultInjectionType;
        return this;
    }
    public String getFaultInjectionType() {
        return this.faultInjectionType;
    }

    public ModifyDBClusterRequest setFaultSimulateMode(String faultSimulateMode) {
        this.faultSimulateMode = faultSimulateMode;
        return this;
    }
    public String getFaultSimulateMode() {
        return this.faultSimulateMode;
    }

    public ModifyDBClusterRequest setImciAutoIndex(String imciAutoIndex) {
        this.imciAutoIndex = imciAutoIndex;
        return this;
    }
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    public ModifyDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterRequest setStandbyHAMode(String standbyHAMode) {
        this.standbyHAMode = standbyHAMode;
        return this;
    }
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    public ModifyDBClusterRequest setStorageAutoScale(String storageAutoScale) {
        this.storageAutoScale = storageAutoScale;
        return this;
    }
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    public ModifyDBClusterRequest setStorageUpperBound(Long storageUpperBound) {
        this.storageUpperBound = storageUpperBound;
        return this;
    }
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

}
