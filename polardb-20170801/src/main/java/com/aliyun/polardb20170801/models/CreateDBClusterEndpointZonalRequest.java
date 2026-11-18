// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
     * <ul>
     * <li>Enable: New nodes are automatically added to the endpoint.</li>
     * <li>Disable: New nodes are not automatically added to the endpoint. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. The value can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the PolarDB on ENS cluster. You can call the DescribeDBClustersZonal operation to obtain the ID. Standard PolarDB cluster IDs are not supported. Usage notes: This operation applies only to PolarDB on ENS clusters. It outlines the concepts of edge clouds, activation methods, and how to obtain the edge cluster ID, noting that the CreateDBClusterZonal operation is unavailable and clusters must be created through alternative methods.</p>
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
     * <p>The advanced configurations of the cluster endpoint. The value is a JSON string. Currently, settings for the consistency level, transaction splitting, offload reads from primary node, and connection pool are supported.</p>
     * <ul>
     * <li>Configure the load balancing policy. Format: {&quot;LoadBalancePolicy&quot;:&quot;load balancing policy&quot;}. Valid values:<ul>
     * <li><strong>0</strong>: load balancing based on the number of connections. This is the default value.</li>
     * <li><strong>1</strong>: load balancing based on the number of active requests.</li>
     * </ul>
     * </li>
     * <li>Configure the consistency level. Format: <code>{&quot;ConsistLevel&quot;:&quot;consistency level&quot;}</code>. Valid values:<ul>
     * <li><strong>0</strong>: eventual consistency.</li>
     * <li><strong>1</strong>: session consistency. This is the default value.</li>
     * <li><strong>2</strong>: global consistency.</li>
     * </ul>
     * </li>
     * <li>Configure transaction splitting. Format: <code>{&quot;DistributedTransaction&quot;:&quot;transaction splitting&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: enables transaction splitting. This is the default value.</li>
     * <li><strong>off</strong>: disables transaction splitting.</li>
     * </ul>
     * </li>
     * <li>Configure whether the primary node accepts read requests. Format: <code>{&quot;MasterAcceptReads&quot;:&quot;offload reads from primary node&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: The primary node accepts read requests.</li>
     * <li><strong>off</strong>: The primary node does not accept read requests. This is the default value.</li>
     * </ul>
     * </li>
     * <li>Configure the connection pool. Format: <code>{&quot;ConnectionPersist&quot;:&quot;connection pool&quot;}</code>. Valid values:<ul>
     * <li><strong>off</strong>: disables the connection pool. This is the default value.</li>
     * <li><strong>Session</strong>: enables the session-level connection pool.</li>
     * <li><strong>Transaction</strong>: enables the transaction-level connection pool.</li>
     * </ul>
     * </li>
     * <li>Configure parallel query. Format: {&quot;MaxParallelDegree&quot;:&quot;parallel query&quot;}. Valid values:<ul>
     * <li>A specific number of concurrent queries. Example: &quot;MaxParallelDegree&quot;:&quot;2&quot;.</li>
     * <li><strong>off</strong>: disables parallel query. This is the default value.</li>
     * </ul>
     * </li>
     * <li>Configure automatic request distribution among row store and column store nodes. Format: {&quot;EnableHtapImci&quot;:&quot;automatic request distribution among row store and column store nodes&quot;}. Valid values:<ul>
     * <li><strong>on</strong>: enables automatic request distribution among row store and column store nodes.</li>
     * <li><strong>off</strong>: disables automatic request distribution among row store and column store nodes. This is the default value.</li>
     * </ul>
     * </li>
     * <li>Configure whether to enable overload protection. Format: {&quot;EnableOverloadThrottle&quot;:&quot;overload protection&quot;}. Valid values:<ul>
     * <li><strong>on</strong>: enables overload protection.</li>
     * <li><strong>off</strong>: disables overload protection. This is the default value.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Transaction splitting, whether the primary node accepts read requests, the connection pool, and overload protection can be configured only when the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>.</li>
     * <li>When the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>read-only</strong>, both <strong>load balancing based on the number of connections</strong> and <strong>load balancing based on the number of active requests</strong> are supported. Cluster endpoints in the <strong>read and write (automatic read/write splitting) mode</strong> only support the <strong>load balancing based on the number of active requests</strong> policy.</li>
     * <li>Automatic request distribution among row store and column store nodes can be configured when the read/write mode of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>, or when the read/write mode is set to <strong>read-only</strong> and the load balancing policy is set to <strong>load balancing based on the number of active requests</strong>.</li>
     * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
     * <li>If the ReadWriteMode parameter is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
     * <li>You can configure the consistency level, transaction splitting, whether the primary node accepts read requests, and the connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
     * <li>The configuration of transaction splitting is constrained by the consistency level. For example, if the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
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
     * <p>The read-only nodes to add to the endpoint. Separate multiple node IDs with commas (,). By default, all nodes are added.</p>
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
     * <li><p>0: sends the request to the primary node.</p>
     * </li>
     * <li><p>2: degrades the request upon timeout. If a global consistency read times out, the query is automatically downgraded to regular requests, and the client does not receive an error message.</p>
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
     * <li>ReadWrite: read and write (automatic read/write splitting).</li>
     * <li>ReadOnly: read-only. This is the default value.</li>
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
     * <li><p>ON: enables the feature.</p>
     * </li>
     * <li><p>OFF: disables the feature.</p>
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
