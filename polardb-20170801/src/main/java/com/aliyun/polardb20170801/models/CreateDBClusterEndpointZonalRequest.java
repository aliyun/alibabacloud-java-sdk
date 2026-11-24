// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
     * <ul>
     * <li>Enable: New nodes are automatically added to the endpoint.</li>
     * <li>Disable (default): New nodes are not automatically added to the endpoint.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. It can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the ENS edge cloud cluster. You can call DescribeDBClustersZonal to obtain the ID. Standard PolarDB cluster IDs are not applicable. Operation description: Prerequisites for edge cloud clusters: This API applies only to ENS edge cloud clusters and is not applicable to standard PolarDB clusters. It provides an overview of edge clouds, activation methods, and instructions on how to obtain the edge cluster ID, noting that the CreateDBClusterZonal API is currently unavailable and clusters must be created through alternative methods.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-***************</p>
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
     * <p>The advanced configurations of the cluster endpoint. The value is a JSON string. Supported settings include the consistency level, transaction splitting, offload reads from primary node, and connection pool.</p>
     * <ul>
     * <li>Set the load balancing policy. Format: <code>{&quot;LoadBalancePolicy&quot;:&quot;Load balancing policy&quot;}</code>. Valid values:<ul>
     * <li><strong>0</strong>: Load balancing based on the number of connections (default).</li>
     * <li><strong>1</strong>: Load balancing based on the number of active requests.</li>
     * </ul>
     * </li>
     * <li>Set the consistency level. Format: <code>{&quot;ConsistLevel&quot;:&quot;Consistency level&quot;}</code>. Valid values:<ul>
     * <li><strong>0</strong>: Eventual consistency.</li>
     * <li><strong>1</strong>: Session consistency (default).</li>
     * <li><strong>2</strong>: Global consistency.</li>
     * </ul>
     * </li>
     * <li>Set transaction splitting. Format: <code>{&quot;DistributedTransaction&quot;:&quot;Transaction splitting&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: Enable transaction splitting (default).</li>
     * <li><strong>off</strong>: Disable transaction splitting.</li>
     * </ul>
     * </li>
     * <li>Set whether the primary node accepts read requests. Format: <code>{&quot;MasterAcceptReads&quot;:&quot;offload reads from primary node&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: The primary node accepts read requests.</li>
     * <li><strong>off</strong>: The primary node does not accept read requests (default).</li>
     * </ul>
     * </li>
     * <li>Set the connection pool. Format: <code>{&quot;ConnectionPersist&quot;:&quot;Connection pool&quot;}</code>. Valid values:<ul>
     * <li><strong>off</strong>: Disable the connection pool (default).</li>
     * <li><strong>Session</strong>: Enable the session-level connection pool.</li>
     * <li><strong>Transaction</strong>: Enable the transaction-level connection pool.</li>
     * </ul>
     * </li>
     * <li>Set parallel query. Format: <code>{&quot;MaxParallelDegree&quot;:&quot;Parallel query&quot;}</code>. Valid values:<ul>
     * <li>A specific degree of parallelism. Example: <code>&quot;MaxParallelDegree&quot;:&quot;2&quot;</code>.</li>
     * <li><strong>off</strong>: Disable parallel query (default).</li>
     * </ul>
     * </li>
     * <li>Set automatic request distribution among row store and column store nodes. Format: <code>{&quot;EnableHtapImci&quot;:&quot;Automatic request distribution among row store and column store nodes&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: Enable automatic request distribution among row store and column store nodes.</li>
     * <li><strong>off</strong>: Disable automatic request distribution among row store and column store nodes (default).</li>
     * </ul>
     * </li>
     * <li>Set whether to enable overload protection. Format: <code>{&quot;EnableOverloadThrottle&quot;:&quot;Whether to enable overload protection&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: Enable overload protection.</li>
     * <li><strong>off</strong>: Disable overload protection (default).</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Transaction splitting, offloading reads from the primary node, the connection pool, and overload protection can be configured only when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>Read and write (automatic read/write splitting)</strong>.</li>
     * <li>When the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>Read-only</strong>, both <strong>load balancing based on the number of connections</strong> and <strong>load balancing based on the number of active requests</strong> are supported. Cluster endpoints in the <strong>read and write (automatic read/write splitting) pattern</strong> support only <strong>load balancing based on the number of active requests</strong>.</li>
     * <li>Automatic request distribution among row store and column store nodes can be configured when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>Read and write (automatic read/write splitting)</strong>, or when the read/write pattern is set to <strong>Read-only</strong> and the load balancing policy is set to <strong>load balancing based on the number of active requests</strong>.</li>
     * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
     * <li>If the <strong>ReadWriteMode</strong> parameter is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
     * <li>You can apply settings for the consistency level, transaction splitting, offloading reads from the primary node, and the connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
     * <li>The configuration of transaction splitting is restricted by the consistency level. For example, if the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
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
     * <p>The nodes that handle read requests to be added to the target endpoint. Separate multiple nodes with commas (,). By default, all nodes are added.</p>
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
     * <p>The timeout policy for global consistency. Valid values:</p>
     * <ul>
     * <li><p>0: Send the request to the primary node.</p>
     * </li>
     * <li><p>2: Timeout degradation. If a global consistency read times out, the query is automatically downgraded to regular requests, and the client does not receive an error message.</p>
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
     * <li>ReadWrite: Read and write (automatic read/write splitting).</li>
     * <li>ReadOnly (default): Read-only.</li>
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
     * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values:</p>
     * <ul>
     * <li><p>ON: Enabled.</p>
     * </li>
     * <li><p>OFF: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SccMode")
    public String sccMode;

    public static CreateDBClusterEndpointZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointZonalRequest self = new CreateDBClusterEndpointZonalRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointZonalRequest setAutoAddNewNodes(String autoAddNewNodes) {
        this.autoAddNewNodes = autoAddNewNodes;
        return this;
    }
    public String getAutoAddNewNodes() {
        return this.autoAddNewNodes;
    }

    public CreateDBClusterEndpointZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBClusterEndpointZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBClusterEndpointZonalRequest setDBEndpointDescription(String DBEndpointDescription) {
        this.DBEndpointDescription = DBEndpointDescription;
        return this;
    }
    public String getDBEndpointDescription() {
        return this.DBEndpointDescription;
    }

    public CreateDBClusterEndpointZonalRequest setEndpointConfig(String endpointConfig) {
        this.endpointConfig = endpointConfig;
        return this;
    }
    public String getEndpointConfig() {
        return this.endpointConfig;
    }

    public CreateDBClusterEndpointZonalRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateDBClusterEndpointZonalRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public CreateDBClusterEndpointZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBClusterEndpointZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBClusterEndpointZonalRequest setPolarSccTimeoutAction(String polarSccTimeoutAction) {
        this.polarSccTimeoutAction = polarSccTimeoutAction;
        return this;
    }
    public String getPolarSccTimeoutAction() {
        return this.polarSccTimeoutAction;
    }

    public CreateDBClusterEndpointZonalRequest setPolarSccWaitTimeout(String polarSccWaitTimeout) {
        this.polarSccWaitTimeout = polarSccWaitTimeout;
        return this;
    }
    public String getPolarSccWaitTimeout() {
        return this.polarSccWaitTimeout;
    }

    public CreateDBClusterEndpointZonalRequest setReadWriteMode(String readWriteMode) {
        this.readWriteMode = readWriteMode;
        return this;
    }
    public String getReadWriteMode() {
        return this.readWriteMode;
    }

    public CreateDBClusterEndpointZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBClusterEndpointZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBClusterEndpointZonalRequest setSccMode(String sccMode) {
        this.sccMode = sccMode;
        return this;
    }
    public String getSccMode() {
        return this.sccMode;
    }

}
