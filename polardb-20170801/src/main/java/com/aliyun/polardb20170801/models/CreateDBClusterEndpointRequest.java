// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add new nodes to the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: New nodes are automatically added to the endpoint.</li>
     * <li><strong>Disable</strong> (default): New nodes are not automatically added to the endpoint.</li>
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
     * <p>The advanced settings of the cluster endpoint. The value must be in JSON format. You can set the consistency level, transaction splitting, offload reads from primary node, and connection pool.</p>
     * <ul>
     * <li>Set the load balancing policy. Format: <code>{&quot;LoadBalancePolicy&quot;:&quot;load balancing policy&quot;}</code>. Valid values:<ul>
     * <li><strong>0</strong>: load balancing based on the number of connections (default).</li>
     * <li><strong>1</strong>: load balancing based on the number of active requests.</li>
     * </ul>
     * </li>
     * <li>Set the consistency level. Format: <code>{&quot;ConsistLevel&quot;:&quot;consistency level&quot;}</code>. Valid values:<ul>
     * <li><strong>0</strong>: eventual consistency.</li>
     * <li><strong>1</strong>: session consistency (default).</li>
     * <li><strong>2</strong>: global consistency.</li>
     * </ul>
     * </li>
     * <li>Set transaction splitting. Format: <code>{&quot;DistributedTransaction&quot;:&quot;transaction splitting&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: enables transaction splitting (default).</li>
     * <li><strong>off</strong>: shutdown transaction splitting.</li>
     * </ul>
     * </li>
     * <li>Set whether the primary node accepts read requests. Format: <code>{&quot;MasterAcceptReads&quot;:&quot;offload reads from primary node&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: The primary node accepts read requests.</li>
     * <li><strong>off</strong>: The primary node does not accept read requests (default).</li>
     * </ul>
     * </li>
     * <li>Set the connection pool. Format: <code>{&quot;ConnectionPersist&quot;:&quot;connection pool&quot;}</code>. Valid values:<ul>
     * <li><strong>off</strong>: shutdown the connection pool (default).</li>
     * <li><strong>Session</strong>: enables the session-level connection pool.</li>
     * <li><strong>Transaction</strong>: enables transaction-level connection pooling.</li>
     * </ul>
     * </li>
     * <li>Set parallel query. Format: <code>{&quot;MaxParallelDegree&quot;:&quot;parallel query&quot;}</code>. Valid values:<ul>
     * <li>A specific concurrent count. Example: <code>&quot;MaxParallelDegree&quot;:&quot;2&quot;</code>.</li>
     * <li><strong>off</strong>: shutdown parallel query (default).</li>
     * </ul>
     * </li>
     * <li>Set automatic request distribution among row store and column store nodes. Format: <code>{&quot;EnableHtapImci&quot;:&quot;automatic request distribution&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: enables the automatic request distribution feature among row store and column store nodes.</li>
     * <li><strong>off</strong>: shutdown the automatic request distribution feature among row store and column store nodes (default).</li>
     * </ul>
     * </li>
     * <li>Set whether to enable overload protection. Format: <code>{&quot;EnableOverloadThrottle&quot;:&quot;whether to enable overload protection&quot;}</code>. Valid values:<ul>
     * <li><strong>on</strong>: enables overload protection.</li>
     * <li><strong>off</strong>: shutdown overload protection (default).</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Transaction splitting, offloading reads from the primary node, connection pool, and overload protection can be set only when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>.</li>
     * <li>When the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read-only</strong>, both <strong>load balancing based on the number of connections</strong> and <strong>load balancing based on the number of active requests</strong> are supported. For cluster endpoints in the <strong>read and write (automatic read/write splitting) pattern</strong>, only <strong>load balancing based on the number of active requests</strong> is supported.</li>
     * <li>Automatic request distribution among row store and column store nodes can be set when the read/write pattern of the PolarDB for MySQL cluster endpoint is set to <strong>read and write (automatic read/write splitting)</strong>, or when the read/write pattern is set to <strong>read-only</strong> and the load balancing policy is set to <strong>load balancing based on the number of active requests</strong>.</li>
     * <li>Only PolarDB for MySQL supports setting the consistency level to global consistency.</li>
     * <li>If the parameter <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, the consistency level can only be set to <strong>0</strong>.</li>
     * <li>You can set the consistency level, transaction splitting, offloading reads from the primary node, and connection pool at the same time. Example: <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
     * <li>The transaction splitting settings are constrained by the consistency level settings. For example, if the consistency level is set to <strong>0</strong>, transaction splitting cannot be enabled. If the consistency level is set to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Note: Clusters with DeployUnit=Advanced (hot standby/multi-master) may not support some advanced endpoint settings. If the OperationDenied.InstanceType error occurs, remove EndpointConfig and retry, or confirm the compatibility of the target cluster deployment type with the selected settings.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ConsistLevel&quot;: &quot;1&quot;,&quot;DistributedTransaction&quot;: &quot;on&quot;}</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The type of the custom cluster endpoint. Valid values:</p>
     * <ul>
     * <li><p><strong>Custom</strong>: custom cluster endpoint.</p>
     * </li>
     * <li><p><strong>DynamoDB</strong>: DynamoDB endpoint.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The read-only nodes to be added to the endpoint. Separate multiple nodes with commas (,). Default value: all nodes. </p>
     * <blockquote>
     * <ul>
     * <li>For PolarDB for MySQL, specify node IDs.</li>
     * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), specify node role names, such as <code>Writer,Reader1,Reader2</code>.</li>
     * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadOnly</strong>, you can add only one node. However, if this node fails, the endpoint may be unavailable for up to 1 hour. Do not use this configuration in production environments. Select at least two nodes to improve availability.</li>
     * <li>If <strong>ReadWriteMode</strong> is set to <strong>ReadWrite</strong>, select at least two nodes.<ul>
     * <li>For PolarDB for MySQL, you can select any two nodes. If both nodes are read-only nodes, write requests are forwarded to the primary node.</li>
     * <li>For PolarDB for PostgreSQL and PolarDB for PostgreSQL (Compatible with Oracle), the primary node must be included.</li>
     * </ul>
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
     * <p>The PolarFS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-test****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The timeout policy for global consistency. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: sends the request to the primary node.</p>
     * </li>
     * <li><p><strong>2</strong>: degrades the request upon timeout. If a global consistency read times out, the query is automatically downgraded to regular requests, and the client does not receive an error message.</p>
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
     * <p>The read/write mode. Valid values: </p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write (automatic read/write splitting). </li>
     * <li><strong>ReadOnly</strong> (default): read-only.</li>
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
     * <li><p><strong>ON</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>OFF</strong>: shutdown</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SccMode")
    public String sccMode;

    /**
     * <p>vpc-2zehr7ghqovft******
     * Virtual private cloud identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zehr7ghqovftils0****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
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
