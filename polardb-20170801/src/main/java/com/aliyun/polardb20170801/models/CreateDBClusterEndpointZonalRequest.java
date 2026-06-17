// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to this endpoint. Valid values:</p>
     * <ul>
     * <li><p>Enable: New nodes are automatically added to this endpoint.</p>
     * </li>
     * <li><p>Disable: New nodes are not automatically added to this endpoint. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates the value, which must be unique among different requests. The token is case-sensitive and can be up to 64 ASCII characters in length.</p>
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
     * <p>The advanced configurations of the cluster endpoint, specified in the JSON format. This parameter supports settings for consistency level, transaction splitting, offloading reads from the primary node, and the connection pool.</p>
     * <ul>
     * <li><p>Sets the load balancing policy. The format is {&quot;LoadBalancePolicy&quot;:&quot;policy&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Connections-based load balancing. This is the default value.</p>
     * </li>
     * <li><p><strong>1</strong>: Active requests-based load balancing.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Sets the consistency level. The format is <code>{&quot;ConsistLevel&quot;:&quot;level&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Eventual consistency.</p>
     * </li>
     * <li><p><strong>1</strong>: Session consistency. This is the default value.</p>
     * </li>
     * <li><p><strong>2</strong>: Global consistency.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Sets transaction splitting. The format is <code>{&quot;DistributedTransaction&quot;:&quot;on/off&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables transaction splitting. This is the default value.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables transaction splitting.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether the primary node accepts read requests. The format is <code>{&quot;MasterAcceptReads&quot;:&quot;on/off&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: The primary node accepts read requests.</p>
     * </li>
     * <li><p><strong>off</strong>: The primary node does not accept read requests. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Sets the connection pool. The format is <code>{&quot;ConnectionPersist&quot;:&quot;type&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>off</strong>: Disables the connection pool. This is the default value.</p>
     * </li>
     * <li><p><strong>Session</strong>: Enables the session-level connection pool.</p>
     * </li>
     * <li><p><strong>Transaction</strong>: Enables transaction-level connection pooling.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Sets parallel query. The format is {&quot;MaxParallelDegree&quot;:&quot;degree&quot;}. Valid values:</p>
     * <ul>
     * <li><p>A specific number of concurrent queries. Example: &quot;MaxParallelDegree&quot;:&quot;2&quot;.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables parallel query. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Sets automatic routing for row store and column store. The format is {&quot;EnableHtapImci&quot;:&quot;on/off&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables automatic routing for row store and column store.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables automatic routing for row store and column store. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Specifies whether to enable overload protection. The format is {&quot;EnableOverloadThrottle&quot;:&quot;on/off&quot;}. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enables overload protection.</p>
     * </li>
     * <li><p><strong>off</strong>: Disables overload protection. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>You can set transaction splitting, specify whether the primary node accepts read requests, configure the connection pool, and enable overload protection only when the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to \<em>\<em>ReadWrite\</em>\</em> (automatic read/write splitting).</p>
     * </li>
     * <li><p>When the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to <strong>ReadOnly</strong>, both <strong>connections-based load balancing</strong> and <strong>active requests-based load balancing</strong> are supported. When the read/write mode is set to <strong>ReadWrite</strong> (automatic read/write splitting), only <strong>active requests-based load balancing</strong> is supported.</p>
     * </li>
     * <li><p>You can enable automatic routing for row store and column store when the read/write mode of the cluster endpoint for a PolarDB for MySQL cluster is set to <strong>ReadWrite</strong> (automatic read/write splitting), or when the read/write mode is set to <strong>ReadOnly</strong> and the load balancing policy is set to <strong>active requests-based load balancing</strong>.</p>
     * </li>
     * <li><p>Only PolarDB for MySQL supports setting the consistency level to global consistency.</p>
     * </li>
     * <li><p>If you set the <strong>ReadWriteMode</strong> parameter to <strong>ReadOnly</strong>, you can only set the consistency level to <strong>0</strong>.</p>
     * </li>
     * <li><p>You can configure the consistency level, transaction splitting, whether the primary node accepts reads, and the connection pool at the same time. For example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</p>
     * </li>
     * <li><p>The transaction splitting setting is constrained by the consistency level. For example, if the consistency level is set to <strong>0</strong>, you cannot enable transaction splitting. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, you can enable transaction splitting.</p>
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
     * <p>The type of the custom cluster endpoint. The value is fixed to <strong>Custom</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The read-only nodes to be added to the endpoint. Separate multiple node IDs with commas (,). By default, all nodes are added.</p>
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
     * <p>The policy for handling global consistency timeouts. Valid values:</p>
     * <ul>
     * <li><p>0: Sends the request to the primary node.</p>
     * </li>
     * <li><p>2: Degrades to regular requests. If a global consistency read times out, the query is automatically degraded to a regular request, and the client does not receive an error message.</p>
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
     * <li><p>ReadWrite: read and write (automatic read/write splitting).</p>
     * </li>
     * <li><p>ReadOnly: read-only. This is the default value.</p>
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
     * <p>Specifies whether to enable the global consistency (high-performance mode) feature for the node. Valid values:</p>
     * <ul>
     * <li><p>ON: Enables the feature.</p>
     * </li>
     * <li><p>OFF: Disables the feature.</p>
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
