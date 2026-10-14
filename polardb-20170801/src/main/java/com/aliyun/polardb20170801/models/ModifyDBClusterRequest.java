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
     * <p>The connection resource quota of the AgenticDB cluster.</p>
     */
    @NameInMap("ConnectionResourceQuota")
    public Long connectionResourceQuota;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the DescribeDBClusters operation to query all clusters in the specified region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The list of drill node instance names.</p>
     * <blockquote>
     * <p>Node dimension drills support only a single node. For zone dimension drills, you can omit this parameter or pass all nodes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-rwxxx</p>
     */
    @NameInMap("DBNodeCrashList")
    public String DBNodeCrashList;

    /**
     * <p>The cross-zone data replication mode of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>AsyncSync</strong>: Asynchronous.</li>
     * <li><strong>SemiSync</strong>: Semi-synchronous.</li>
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
     * <li>0: Instance fault injection based on <code>Crash SQL</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultInjectionType")
    public String faultInjectionType;

    /**
     * <p>The fault drill dimension for the cluster. Valid values:</p>
     * <ul>
     * <li><code>0</code> or <code>FaultInjection</code>: Primary zone dimension fault drill.</li>
     * <li><code>1</code>: Node dimension fault drill.<blockquote>
     * <ul>
     * <li>In the <strong>primary zone dimension fault drill</strong> scenario, all compute nodes in the primary zone become unavailable, and the disaster recovery switchover in this scenario is lossy.</li>
     * <li>In the <strong>node dimension fault drill</strong> scenario, only a single compute node can be drilled. Pass the desired compute node name through <code>DBNodeCrashList</code>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaultSimulateMode")
    public String faultSimulateMode;

    /**
     * <p>The automatic IMCI-based query acceleration feature. Valid values:</p>
     * <ul>
     * <li><code>ON</code>: Enabled.</li>
     * <li><code>OFF</code>: Disabled.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only PolarDB for MySQL clusters are supported.</li>
     * <li>For cluster version limits, refer to <a href="https://help.aliyun.com/document_detail/2854119.html">Automatic IMCI-based query acceleration (AutoIndex)</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("ImciAutoIndex")
    public String imciAutoIndex;

    /**
     * <p>Modifies the row compression settings.</p>
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
     * <p>The cross-zone automatic switchover mode of the cluster. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: Enables cross-zone automatic switchover.</li>
     * <li><strong>OFF</strong>: Disables cross-zone automatic switchover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("StandbyHAMode")
    public String standbyHAMode;

    /**
     * <p>Specifies whether to enable automatic storage scaling for a Standard Edition cluster. Valid values:</p>
     * <ul>
     * <li>Enable: Enables automatic storage scaling.</li>
     * <li>Disable: Disables automatic storage scaling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("StorageAutoScale")
    public String storageAutoScale;

    /**
     * <p>The upper limit for automatic storage scaling of a Standard Edition cluster. Unit: GB.</p>
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
     * <p>The JSON string of the target database and table information to be restored. The values of the database and table information are all of the string type.
     * Example: <code>[    {        &quot;tables&quot;:[            {                &quot;name&quot;:&quot;testtb&quot;,                &quot;type&quot;:&quot;table&quot;,                &quot;newname&quot;:&quot;testtb_restore&quot;            }        ],        &quot;name&quot;:&quot;testdb&quot;,        &quot;type&quot;:&quot;db&quot;,        &quot;newname&quot;:&quot;testdb_restore&quot;    } ]</code>.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/194770.html">DescribeMetaList</a> operation to view the details of the database and table names that support restoration, and fill the supported database and table information into the corresponding positions in the preceding example.</p>
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

    public ModifyDBClusterRequest setConnectionResourceQuota(Long connectionResourceQuota) {
        this.connectionResourceQuota = connectionResourceQuota;
        return this;
    }
    public Long getConnectionResourceQuota() {
        return this.connectionResourceQuota;
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
