// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointZonalRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to this endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Enable</strong>: yes</p>
     * </li>
     * <li><p><strong>Disable</strong>: no (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>A client token to ensure the idempotence of the request. The client generates the value, but you must make sure that the value is unique among different requests. The token is case-sensitive and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    /**
     * <p>The ID of the cluster endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pe-****************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The advanced configurations of the cluster endpoint, which are specified in the JSON format. You can set the consistency level, transaction splitting, whether the primary node accepts read requests, the connection pool, and more.</p>
     * <ul>
     * <li><p>To set the load balancing policy, use the format <code>{\\&quot;LoadBalancePolicy\\&quot;:\\&quot;policy\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: connection-based load balancing (default)</p>
     * </li>
     * <li><p><strong>1</strong>: active request-based load balancing</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To specify whether the primary node accepts read requests, use the format <code>{\\&quot;MasterAcceptReads\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The primary node accepts read requests (default).</p>
     * </li>
     * <li><p><strong>off</strong>: The primary node does not accept read requests.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To configure transaction splitting, use the format <code>{\\&quot;DistributedTransaction\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables transaction splitting (default)</p>
     * </li>
     * <li><p><strong>off</strong>: disables transaction splitting</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To set the consistency level, use the format <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;level\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: eventual consistency (weak)</p>
     * </li>
     * <li><p><strong>1</strong>: session consistency (medium) (default)</p>
     * </li>
     * <li><p><strong>2</strong>: global consistency (strong)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To set the timeout period for a global consistency read, use the format <code>{\\&quot;ConsistTimeout\\&quot;:\\&quot;timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 20. Unit: ms.</p>
     * </li>
     * <li><p>To set the timeout period for a session consistency read, use the format <code>{\\&quot;ConsistSessionTimeout\\&quot;:\\&quot;timeout\\&quot;}</code>. Valid values: 0 to 60000. Default value: 0. Unit: ms.</p>
     * </li>
     * <li><p>To set the policy for a global or session consistency read timeout, use the format <code>{\\&quot;ConsistTimeoutAction\\&quot;:\\&quot;policy\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Sends the read request to the primary node (default).</p>
     * </li>
     * <li><p><strong>1</strong>: The proxy returns a \<code>wait replication complete timeout, please retry\\</code> error message to the application.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To configure the connection pool, use the format <code>{\\&quot;ConnectionPersist\\&quot;:\\&quot;pool_type\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>off</strong>: disables the connection pool (default)</p>
     * </li>
     * <li><p><strong>Session</strong>: enables the session-level connection pool</p>
     * </li>
     * <li><p><strong>Transaction</strong>: enables transaction-level connection pooling</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To configure parallel queries, use the format <code>{\\&quot;MaxParallelDegree\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables parallel queries</p>
     * </li>
     * <li><p><strong>off</strong>: disables parallel queries (default)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To configure automatic routing between row store and column store, use the format <code>{\\&quot;EnableHtapImci\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables automatic routing between row store and column store</p>
     * </li>
     * <li><p><strong>off</strong>: disables automatic routing between row store and column store (default)</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>To specify whether to enable overload protection, use the format <code>{\\&quot;EnableOverloadThrottle\\&quot;:\\&quot;value\\&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables overload protection</p>
     * </li>
     * <li><p><strong>off</strong>: disables overload protection (default)</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can configure transaction splitting, specify whether the primary node accepts read requests, configure the connection pool, and enable overload protection only when the read/write mode of the cluster endpoint for PolarDB for MySQL is set to <strong>ReadWrite</strong> (automatic read/write splitting).</p>
     * </li>
     * <li><p>If the read/write mode of a cluster endpoint for PolarDB for MySQL is <strong>ReadOnly</strong>, both connection-based and active request-based load balancing policies are supported. If the read/write mode is <strong>ReadWrite</strong> (automatic read/write splitting), only the active request-based load balancing policy is supported.</p>
     * </li>
     * <li><p>You can configure automatic routing between row store and column store when the read/write mode of the cluster endpoint for PolarDB for MySQL is <strong>ReadWrite</strong> (automatic read/write splitting), or when the read/write mode is <strong>ReadOnly</strong> and the load balancing policy is active request-based.</p>
     * </li>
     * <li><p>Only PolarDB for MySQL supports the global consistency level.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, you can set the consistency level only to <strong>0</strong>.</p>
     * </li>
     * <li><p>You can set the consistency level, transaction splitting, whether the primary node accepts read requests, and the connection pool at the same time. For example: <code>{\\&quot;ConsistLevel\\&quot;:\\&quot;1\\&quot;,\\&quot;DistributedTransaction\\&quot;:\\&quot;on\\&quot;,\\&quot;ConnectionPersist\\&quot;:\\&quot;Session\\&quot;,\\&quot;MasterAcceptReads\\&quot;:\\&quot;on\\&quot;}</code>.</p>
     * </li>
     * <li><p>The transaction splitting setting is constrained by the consistency level. For example, if the consistency level is <strong>0</strong>, you cannot enable transaction splitting. If the consistency level is <strong>1</strong> or <strong>2</strong>, you can enable transaction splitting.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;DistributedTransaction\&quot;:\&quot;off\&quot;,\&quot;ConsistLevel\&quot;:\&quot;0\&quot;,\&quot;LoadBalanceStrategy\&quot;:\&quot;load\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The read-only nodes to add to the endpoint. Separate multiple node IDs with commas (,). If you do not specify this parameter, the original nodes are retained.</p>
     * <blockquote>
     * <ul>
     * <li><p>For PolarDB for MySQL, specify the node IDs.</p>
     * </li>
     * <li><p>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (compatible with Oracle), specify the node role names, such as <code>Writer,Reader1,Reader2</code>.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, you can attach only one node. However, if this node fails, the endpoint might be unavailable for up to one hour. Do not use this configuration in a production environment. Select at least two nodes to improve availability.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadWrite</strong>, you must select at least two nodes.
     * \* For PolarDB for MySQL, you can select any two nodes. If both nodes are read-only nodes, write requests are sent to the primary node.
     * \* For PolarDB for PostgreSQL and PolarDB for PostgreSQL (compatible with Oracle), you must include the primary node.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-**************,pi-*************</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy for a global consistency timeout. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Sends the request to the primary node.</p>
     * </li>
     * <li><p><strong>2</strong>: Timeout degradation. If a global consistency read times out, the query is automatically downgraded to a regular request, and the client does not receive an error message.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PolarSccTimeoutAction")
    public String polarSccTimeoutAction;

    /**
     * <p>The timeout period for global consistency.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PolarSccWaitTimeout")
    public String polarSccWaitTimeout;

    /**
     * <p>The read/write mode. Valid values:</p>
     * <ul>
     * <li><p><strong>ReadWrite</strong>: read-write (automatic read/write splitting)</p>
     * </li>
     * <li><p><strong>ReadOnly</strong>: read-only</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: enables the feature</p>
     * </li>
     * <li><p><strong>OFF</strong>: disables the feature</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("SccMode")
    public String sccMode;

    public static ModifyDBClusterEndpointZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointZonalRequest self = new ModifyDBClusterEndpointZonalRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointZonalRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public ModifyDBClusterEndpointZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBClusterEndpointZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterEndpointZonalRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    public ModifyDBClusterEndpointZonalRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public ModifyDBClusterEndpointZonalRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public ModifyDBClusterEndpointZonalRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public ModifyDBClusterEndpointZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterEndpointZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterEndpointZonalRequest setPolarSccTimeoutAction(String polarSccTimeoutAction) {
        this.polarSccTimeoutAction = polarSccTimeoutAction;
        return this;
    }
    public String getPolarSccTimeoutAction() {
        return this.polarSccTimeoutAction;
    }

    public ModifyDBClusterEndpointZonalRequest setPolarSccWaitTimeout(String polarSccWaitTimeout) {
        this.polarSccWaitTimeout = polarSccWaitTimeout;
        return this;
    }
    public String getPolarSccWaitTimeout() {
        return this.polarSccWaitTimeout;
    }

    public ModifyDBClusterEndpointZonalRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public ModifyDBClusterEndpointZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterEndpointZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterEndpointZonalRequest setSccMode(String sccMode) {
        this.sccMode = sccMode;
        return this;
    }
    public String getSccMode() {
        return this.sccMode;
    }

}
