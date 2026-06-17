// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Enable</strong>: Automatically adds new nodes to the endpoint.</p>
     * </li>
     * <li><p><strong>Disable</strong> (default): Does not automatically add new nodes to the endpoint.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>A client-generated token to ensure the idempotence of the request. The token must be unique, case-sensitive, and a maximum of 64 ASCII characters.</p>
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
     * <p>The name of the custom cluster endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    /**
     * <p>The advanced configurations for the custom cluster endpoint, specified as a JSON string. You can configure features such as consistency level, transaction splitting, whether the primary node accepts read requests, connection pool, and load balancing policy.</p>
     * <ul>
     * <li><p>Specifies the load balancing policy. The format is {&quot;LoadBalancePolicy&quot;:&quot;policy&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: connections-based load balancing (default).</p>
     * </li>
     * <li><p><strong>1</strong>: active requests-based load balancing.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies the consistency level. The format is <code>{&quot;ConsistLevel&quot;:&quot;level&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: eventual consistency.</p>
     * </li>
     * <li><p><strong>1</strong>: session consistency (default).</p>
     * </li>
     * <li><p><strong>2</strong>: global consistency.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether to enable transaction splitting. The format is <code>{&quot;DistributedTransaction&quot;:&quot;status&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables transaction splitting (default).</p>
     * </li>
     * <li><p><strong>off</strong>: disables transaction splitting.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether the primary node accepts read requests. The format is <code>{&quot;MasterAcceptReads&quot;:&quot;status&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The primary node accepts read requests.</p>
     * </li>
     * <li><p><strong>off</strong>: The primary node does not accept read requests (default).</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether to enable the connection pool. The format is <code>{&quot;ConnectionPersist&quot;:&quot;status&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>off</strong>: disables the connection pool (default).</p>
     * </li>
     * <li><p><strong>Session</strong>: enables the session-level connection pool.</p>
     * </li>
     * <li><p><strong>Transaction</strong>: enables the transaction-level connection pool.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies the degree of parallelism for a parallel query. The format is {&quot;MaxParallelDegree&quot;:&quot;degree&quot;}. Valid values:</p>
     * <ul>
     * <li><p>A specific integer that specifies the degree of parallelism. For example: &quot;MaxParallelDegree&quot;:&quot;2&quot;.</p>
     * </li>
     * <li><p><strong>off</strong>: disables parallel query (default).</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether to enable automatic routing between row store and column store. The format is {&quot;EnableHtapImci&quot;:&quot;status&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables automatic routing.</p>
     * </li>
     * <li><p><strong>off</strong>: disables automatic routing (default).</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether to enable overload protection. The format is {&quot;EnableOverloadThrottle&quot;:&quot;status&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: enables overload protection.</p>
     * </li>
     * <li><p><strong>off</strong>: disables overload protection (default).</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can configure transaction splitting, whether the primary node accepts read requests, the connection pool, and overload protection only for a PolarDB for MySQL endpoint in <strong>ReadWrite</strong> (automatic read/write splitting) mode.</p>
     * </li>
     * <li><p>A PolarDB for MySQL cluster endpoint in <strong>ReadOnly</strong> mode supports both <strong>connections-based load balancing</strong> and <strong>active requests-based load balancing</strong>. An endpoint in <strong>ReadWrite</strong> (automatic read/write splitting) mode supports only <strong>active requests-based load balancing</strong>.</p>
     * </li>
     * <li><p>You can enable automatic routing between row store and column store if the read/write mode of the cluster endpoint for PolarDB for MySQL is <strong>ReadWrite</strong> (automatic read/write splitting), or if the read/write mode is <strong>ReadOnly</strong> and the load balancing policy is <strong>active requests-based load balancing</strong>.</p>
     * </li>
     * <li><p>Only PolarDB for MySQL clusters support global consistency.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, the consistency level must be <strong>0</strong> (eventual consistency).</p>
     * </li>
     * <li><p>You can configure the consistency level, transaction splitting, whether the primary node accepts read requests, and the connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</p>
     * </li>
     * <li><p>The setting for transaction splitting depends on the consistency level. For example, if you set the consistency level to <strong>0</strong> (eventual consistency), you cannot enable transaction splitting. If you set the consistency level to <strong>1</strong> (session consistency) or <strong>2</strong> (global consistency), you can enable transaction splitting.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ConsistLevel&quot;: &quot;1&quot;,&quot;DistributedTransaction&quot;: &quot;on&quot;}</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The type of the custom cluster endpoint. Set the value to <strong>Custom</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The nodes to associate with the endpoint. Separate multiple node IDs with a comma (,). If you omit this parameter, all nodes in the cluster are added by default.</p>
     * <blockquote>
     * <ul>
     * <li><p>For a PolarDB for MySQL cluster, specify the node IDs.</p>
     * </li>
     * <li><p>For a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (compatible with Oracle) cluster, specify the roles of the nodes, such as <code>Writer,Reader1,Reader2</code>.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, you can associate only one node with the endpoint. If this node fails, the endpoint may be unavailable for up to 1 hour. This configuration is not recommended for a production environment. To improve availability, associate at least two nodes with the endpoint.</p>
     * </li>
     * <li><p>If you set <strong>ReadWriteMode</strong> to <strong>ReadWrite</strong>, you must associate at least two nodes with the endpoint.
     * \* For a PolarDB for MySQL cluster, you can select any two nodes. If both nodes are read-only nodes, write requests are routed to the primary node.
     * \* For a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (compatible with Oracle) cluster, the primary node must be included.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-**********,pi-*********</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>pfs-test****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The policy for handling global consistency read timeouts. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Send the request to the primary node.</p>
     * </li>
     * <li><p><strong>2</strong>: Downgrade to a regular request. If a global consistency read times out, the query is automatically downgraded, and the client does not receive an error.</p>
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
     * <li><p><strong>ReadWrite</strong>: read/write (automatic read/write splitting).</p>
     * </li>
     * <li><p><strong>ReadOnly</strong> (default): read-only.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadOnly</p>
     */
    @NameInMap("ReadWriteMode")
    public String readWriteMode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable global consistency (high-performance mode). Valid values:</p>
     * <ul>
     * <li><p><strong>ON</strong>: Enables the feature.</p>
     * </li>
     * <li><p><strong>OFF</strong>: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SccMode")
    public String sccMode;

    /**
     * <strong>example:</strong>
     * <p>vpc-2zehr7ghqovftils0****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <strong>example:</strong>
     * <p>vsw-2ze775gnf7jn33ua****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateDBClusterEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointRequest self = new CreateDBClusterEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public CreateDBClusterEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterEndpointRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBClusterEndpointRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    public CreateDBClusterEndpointRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public CreateDBClusterEndpointRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateDBClusterEndpointRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public CreateDBClusterEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterEndpointRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CreateDBClusterEndpointRequest setPolarSccTimeoutAction(String polarSccTimeoutAction) {
        this.polarSccTimeoutAction = polarSccTimeoutAction;
        return this;
    }
    public String getPolarSccTimeoutAction() {
        return this.polarSccTimeoutAction;
    }

    public CreateDBClusterEndpointRequest setPolarSccWaitTimeout(String polarSccWaitTimeout) {
        this.polarSccWaitTimeout = polarSccWaitTimeout;
        return this;
    }
    public String getPolarSccWaitTimeout() {
        return this.polarSccWaitTimeout;
    }

    public CreateDBClusterEndpointRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public CreateDBClusterEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterEndpointRequest setSccMode(String sccMode) {
        this.sccMode = sccMode;
        return this;
    }
    public String getSccMode() {
        return this.sccMode;
    }

    public CreateDBClusterEndpointRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBClusterEndpointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
