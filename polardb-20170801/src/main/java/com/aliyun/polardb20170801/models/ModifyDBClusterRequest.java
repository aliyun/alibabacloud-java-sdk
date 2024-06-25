// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>Enable storage compression function. The value of this parameter is ON.</p>
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

    @NameInMap("FaultInjectionType")
    public String faultInjectionType;

    /**
     * <p>The fault scenario that you want to simulate for the cluster.</p>
     * <ul>
     * <li>Set the value to <strong>0</strong>. The value 0 indicates the scenario in which the primary zone of the cluster fails.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when you set the <code>StandbyHAMode</code> parameter to 0.</p>
     * </li>
     * <li><p>If you set this parameter to 0, all compute nodes deployed in the primary zone are unavailable. In this case, the switchover degrades the cluster performance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultSimulateMode")
    public String faultSimulateMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable the cross-zone automatic switchover mode. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: Enable the cross-zone automatic switchover mode.</li>
     * <li><strong>OFF</strong>: Disable the cross-zone automatic switchover mode.</li>
     * <li><strong>0</strong>: Enable the customer drill mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>Specifies whether to enable automatic storage scaling for the cluster of Standard Edition. Valid values:</p>
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
