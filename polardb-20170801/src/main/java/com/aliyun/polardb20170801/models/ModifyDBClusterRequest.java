// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>Enables storage compression. Set the value to <strong>ON</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("CompressStorage")
    public String compressStorage;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the DescribeDBClusters operation to query the details of all clusters in a specific region, including their cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The names of the nodes to target in the fault simulation.</p>
     * <blockquote>
     * <p>For a node-level simulation, you can specify only a single node. For a zone-level simulation, you can leave this parameter empty or specify all nodes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-rwxxx</p>
     */
    @NameInMap("DBNodeCrashList")
    public String DBNodeCrashList;

    /**
     * <p>The cross-zone data replication method for the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>AsyncSync</strong>: asynchronous.</p>
     * </li>
     * <li><p><strong>SemiSync</strong>: semi-synchronous.</p>
     * </li>
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
     * <li><code>0</code>: instance-level fault injection based on Crash SQL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultInjectionType")
    public String faultInjectionType;

    /**
     * <p>The fault simulation scope for the cluster. Valid values:</p>
     * <ul>
     * <li><p><code>0</code> or <code>FaultInjection</code>: primary zone-level fault simulation.</p>
     * </li>
     * <li><p><code>1</code>: node-level fault simulation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>In a <strong>primary zone-level fault simulation</strong>, all compute nodes in the primary zone become unavailable. The disaster recovery failover in this scenario is lossy.</p>
     * </li>
     * <li><p>In a <strong>node-level fault simulation</strong>, you can simulate a fault on only a single compute node. You must specify the target compute node by using the <code>DBNodeCrashList</code> parameter.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultSimulateMode")
    public String faultSimulateMode;

    /**
     * <p>Controls the automatic columnar index feature. Valid values:</p>
     * <ul>
     * <li><p><code>ON</code>: enables the feature.</p>
     * </li>
     * <li><p><code>OFF</code>: disables the feature.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This feature is available only for PolarDB for MySQL clusters.</p>
     * </li>
     * <li><p>For cluster version limits, see <a href="https://help.aliyun.com/document_detail/2854119.html">Automatic indexing (AutoIndex)</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <p>Enables or disables row-level compression.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ModifyRowCompression")
    public String modifyRowCompression;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The automatic cross-zone failover mode for the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: enables automatic cross-zone failover.</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables automatic cross-zone failover.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>Enables or disables automatic storage scaling for a standard cluster. Valid values:</p>
     * <ul>
     * <li><p>Enable: enables automatic storage scaling.</p>
     * </li>
     * <li><p>Disable: disables automatic storage scaling.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The upper limit for automatic storage scaling on a standard cluster. Unit: GB.</p>
     * <blockquote>
     * <p>The maximum value is 32000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("StorageUpperBound")
    public Long storageUpperBound;

    /**
     * <p>A JSON string that specifies information about the destination databases and tables to be restored. All values in the database and table information must be strings.
     * Example: <code>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</code>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/194770.html">DescribeMetaList</a> operation to query for restorable databases and tables. Use the returned information to populate the fields in the example JSON.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;tables&quot;:[ { &quot;name&quot;:&quot;testtb&quot;, &quot;type&quot;:&quot;table&quot;, &quot;newname&quot;:&quot;testtb_restore&quot; } ], &quot;name&quot;:&quot;testdb&quot;, &quot;type&quot;:&quot;db&quot;, &quot;newname&quot;:&quot;testdb_restore&quot; } ]</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

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

    public ModifyDBClusterRequest setModifyRowCompression(String modifyRowCompression) {
        this.modifyRowCompression = modifyRowCompression;
        return this;
    }
    public String getModifyRowCompression() {
        return this.modifyRowCompression;
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

    public ModifyDBClusterRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

}
