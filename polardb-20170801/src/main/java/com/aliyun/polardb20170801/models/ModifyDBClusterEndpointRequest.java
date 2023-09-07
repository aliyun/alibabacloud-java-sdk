// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically associate newly added nodes with the cluster endpoint. Default value: Disable. Valid values:</p>
     * <br>
     * <p>*   **Enable**</p>
     * <p>*   **Disable**</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the custom cluster endpoint.</p>
     */
    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The advanced configurations of the cluster endpoint, which are in the JSON format. You can specify the configurations of the following attributes: consistency level, transaction splitting, connection pool, and primary node accepts read requests.</p>
     * <br>
     * <p>*   Specifies the load balancing policy in the format of `{\"LoadBalancePolicy\":\"Selected value\"}`. Default value: 0. Valid values:</p>
     * <br>
     * <p>    *   **0**: connections-based load balancing</p>
     * <p>    *   **1**: active requests-based load balancing</p>
     * <br>
     * <p>*   Specifies whether to enable the primary node accepts read requests feature in the format of `{\"MasterAcceptReads\":\"Selected value\"}`. Default value: on. Valid values:</p>
     * <br>
     * <p>    *   **on**</p>
     * <p>    *   **off**</p>
     * <br>
     * <p>*   Specifies whether to enable the transaction splitting feature in the format of `{\"DistributedTransaction\":\"Selected value\"}`. Default value: on. Valid values:</p>
     * <br>
     * <p>    *   **on**</p>
     * <p>    *   **off**</p>
     * <br>
     * <p>*   Specifies the consistency level in the format of `{\"ConsistLevel\":\"Selected value\"}`. Default value: 1. Valid values:</p>
     * <br>
     * <p>    *   **0**: eventual consistency (weak)</p>
     * <p>    *   **1**: session consistency (medium)</p>
     * <p>    *   **2**: global consistency (strong)</p>
     * <br>
     * <p>*   Specifies the connection pool in the format of `{\"ConnectionPersist\":\"Selected value\"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **off**: disables the connection pool.</p>
     * <p>    *   **Session**: enables the session-level connection pool.</p>
     * <p>    *   **Transaction**: enables the transaction-level connection pool.</p>
     * <br>
     * <p>*   Specifies whether to enable the parallel query feature in the format of `{\"MaxParallelDegree\":\"Selected value\"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **on**</p>
     * <p>    *   **off**</p>
     * <br>
     * <p>*   Specifies whether to enable the automatic request distribution between row store and column store nodes feature in the format of `{\"EnableHtapImci\":\"Selected value\"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **on**</p>
     * <p>    *   **off**</p>
     * <br>
     * <p>*   Specifies whether to enable the overload protection feature in the format of `{\"EnableOverloadThrottle\":\"Selected value\"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **on**</p>
     * <p>    *   **off**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can specify the transaction splitting, primary node accepts read requests, connection pool, and overload protection features for a PolarDB for MySQL cluster only if ReadWriteMode is set to ReadWrite for the cluster endpoint.</p>
     * <br>
     * <p>*   If the read /write mode of a PolarDB for MySQL cluster is set to **Read-only**, the **Connection-based SLB** and **Active Request-based SLB** SLB policies are supported. The **Read-write (Automatic read /write splitting) **mode of the cluster supports** Active Request-based SLB** policy.</p>
     * <p>*   If ReadWriteMode is set to **ReadWrite** for the cluster endpoint of a PolarDB for MySQL cluster or if ReadWriteMode is set to **ReadOnly** and the load balancing policy is set to **active requests-based load balancing**, the automatic request distribution between row store and column store nodes feature is supported.</p>
     * <p>*   Only PolarDB for MySQL supports global consistency.</p>
     * <p>*   If the **ReadWriteMode** parameter is set to **ReadOnly**, the consistency level must be **0**.</p>
     * <p>*   You can specify the consistency level, transaction splitting, connection pool, and primary node accepts read requests features at a time, such as `{\"ConsistLevel\":\"1\",\"DistributedTransaction\":\"on\",\"ConnectionPersist\":\"Session\",\"MasterAcceptReads\":\"on\"}`.</p>
     * <p>*   The transaction splitting settings are restricted by the consistency level settings. For example, if you set the consistency level to **0**, transaction splitting cannot be enabled. If you set the consistency level to **1** or **2**, transaction splitting can be enabled.</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The reader nodes to be associated with the endpoint. If you need to specify multiple reader nodes, separate the reader nodes with commas (,). If you do not specify this parameter, the predefined nodes are used by default.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify the node ID for each PolarDB for MySQL cluster.</p>
     * <br>
     * <p>*   You must specify the role name of each node for each PolarDB for PostgreSQL or PolarDB for Oracle cluster. Example: `Writer,Reader1,Reader2`.</p>
     * <br>
     * <p>*   If you set **ReadWriteMode** to **ReadOnly**, only one node can be associated with the cluster endpoint. If the only node becomes faulty, the cluster endpoint may be unavailable for up to an hour. We recommend that you do not associate only one node with the cluster endpoint in production environments. We recommend that you associate at least two nodes with the cluster endpoint to improve service availability.</p>
     * <br>
     * <p>*   If you set **ReadWriteMode** to **ReadWrite**, you must associate at least two nodes with the cluster endpoint.</p>
     * <br>
     * <p>    *   No limits are imposed on the two nodes that you select for each PolarDB for MySQL cluster. If the two nodes are read-only nodes, write requests are forwarded to the primary node.</p>
     * <p>    *   The following limit applies to PolarDB for PostgreSQL and PolarDB for Oracle clusters: One of the selected nodes must be the primary node.</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The read/write mode. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: The cluster endpoint handles read and write requests. Automatic read/write splitting is enabled.</p>
     * <p>*   **ReadOnly**: The cluster endpoint handles read-only requests.</p>
     */
    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointRequest self = new ModifyDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public ModifyDBClusterEndpointRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterEndpointRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    public ModifyDBClusterEndpointRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public ModifyDBClusterEndpointRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public ModifyDBClusterEndpointRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public ModifyDBClusterEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterEndpointRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public ModifyDBClusterEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
