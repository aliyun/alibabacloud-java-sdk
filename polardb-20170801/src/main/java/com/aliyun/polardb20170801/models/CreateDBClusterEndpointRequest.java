// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically associate newly added nodes with the cluster endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Newly added nodes are automatically associated with the cluster endpoint.</li>
     * <li><strong>Disable</strong>: Newly added nodes are not automatically associated with the cluster endpoint.</li>
     * </ul>
     * <p>Default value: <strong>Disable</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f******************</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of cluster.</p>
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
     * <p>The advanced configurations of the cluster endpoint. You must specify the configurations in the JSON format. You can specify the configurations of the following attributes: consistency level, transaction splitting, connection pool, and offload reads from the primary node.</p>
     * <ul>
     * <li><p>Specify the consistency level in the format of <code>{&quot;ConsistLevel&quot;:&quot;Consistency level&quot;}</code>. Default value: 1. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: eventual consistency.</li>
     * <li><strong>1</strong>: session consistency.</li>
     * <li><strong>2</strong>: global consistency.</li>
     * </ul>
     * </li>
     * <li><p>Specify the transaction splitting feature in the format of <code>{&quot;DistributedTransaction&quot;:&quot;Transaction splitting&quot;}</code>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the transaction splitting feature. By default, the feature is enabled.</li>
     * <li><strong>off</strong>: disables the transaction splitting feature.</li>
     * </ul>
     * </li>
     * <li><p>Specify the offload reads from the primary node feature in the format of <code>{&quot;MasterAcceptReads&quot;:&quot;Offload reads from the primary node&quot;}</code>. Default value: off. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: The primary node accepts read requests.</li>
     * <li><strong>off</strong>: The primary node does not accept read requests.</li>
     * </ul>
     * </li>
     * <li><p>Specify the connection pool in the format of <code>{&quot;ConnectionPersist&quot;:&quot;Connection pool&quot;}</code>. Default value: off. Valid values:</p>
     * <ul>
     * <li><strong>off</strong>: disables the connection pool.</li>
     * <li><strong>Session</strong>: enables the session-level connection pool.</li>
     * <li><strong>Transaction</strong>: enables the transaction-level connection pool.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can specify the transaction splitting, connection pool, and offload reads from the primary node features for a PolarDB for MySQL cluster only if ReadWriteMode is set to ReadWrite for the cluster endpoint.</li>
     * <li>Only PolarDB for MySQL supports global consistency.</li>
     * <li>If the <strong>ReadWriteMode</strong> parameter is set to <strong>ReadOnly</strong>, the consistency level must be <strong>0</strong>.</li>
     * <li>You can use one record to specify the consistency level, transaction splitting, connection pool, and offload reads from the primary node features, such as <code>{&quot;ConsistLevel&quot;:&quot;1&quot;,&quot;DistributedTransaction&quot;:&quot;on&quot;,&quot;ConnectionPersist&quot;:&quot;Session&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</code>.</li>
     * <li>The transaction splitting settings are restricted by the consistency level settings. For example, if you set the consistency level to <strong>0</strong>, transaction splitting cannot be enabled. If you set the consistency level to <strong>1</strong> or <strong>2</strong>, transaction splitting can be enabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ConsistLevel&quot;: &quot;1&quot;,&quot;DistributedTransaction&quot;: &quot;on&quot;}</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The type of the cluster endpoint. Set the value to <strong>Custom</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The reader nodes that you want to associate with the endpoint. If you want to specify multiple reader nodes, separate the reader nodes with commas (,). If you do not specify this parameter, all nodes are used.</p>
     * <blockquote>
     * <ul>
     * <li>You need to specify the node IDs for a PolarDB for MySQL cluster.</li>
     * <li>You need to specify the role name of each node for a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (Compatible with Oracle) cluster. Example: <code>Writer, Reader1, Reader2</code>.</li>
     * <li>If you set <strong>ReadWriteMode</strong> to <strong>ReadOnly</strong>, you can associate only one node with the endpoint. If the only node becomes faulty, the cluster endpoint may be unavailable for up to 1 hour. We recommend that you associate more than one node with the cluster endpoint in production environments. We recommend that you associate at least two nodes with the cluster endpoint to improve service availability.</li>
     * <li>If you set <strong>ReadWriteMode</strong> to <strong>ReadWrite</strong>, you need to associate at least two nodes with the cluster endpoint.</li>
     * <li>PolarDB for MySQL does not impose a limit on the types of the two nodes. If the nodes are read-only nodes, write requests are forwarded to the primary node. </li>
     * <li>PolarDB for PostgreSQL and PolarDB for PostgreSQL (compatible with Oracle) require a primary node.</li>
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
     * <p>The read/write mode. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: receives and forwards read and write requests. Automatic read/write splitting is enabled.</li>
     * <li><strong>ReadOnly</strong>: The account has the read-only permissions on the database.</li>
     * </ul>
     * <p>Default value: <strong>ReadOnly</strong>.</p>
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

}
