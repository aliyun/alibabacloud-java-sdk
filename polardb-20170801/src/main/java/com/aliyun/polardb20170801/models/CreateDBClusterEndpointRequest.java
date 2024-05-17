// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically associate newly added nodes with the cluster endpoint. Valid values:</p>
     * <br>
     * <p>*   **Enable**: Newly added nodes are automatically associated with the cluster endpoint.</p>
     * <p>*   **Disable**: Newly added nodes are not automatically associated with the cluster endpoint.</p>
     * <br>
     * <p>Default value: **Disable**.</p>
     */
    @NameInMap("AutoAddNewNodes")
    public String autoAddNewNodes;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the custom cluster endpoint.</p>
     */
    @NameInMap("DBEndpointDescription")
    public String DBEndpointDescription;

    /**
     * <p>The advanced configurations of the cluster endpoint. You must specify the configurations in the JSON format. You can specify the configurations of the following attributes: consistency level, transaction splitting, connection pool, and offload reads from the primary node.</p>
     * <br>
     * <p>*   Specify the consistency level in the format of `{"ConsistLevel":"Consistency level"}`. Default value: 1. Valid values:</p>
     * <br>
     * <p>    *   **0**: eventual consistency.</p>
     * <p>    *   **1**: session consistency.</p>
     * <p>    *   **2**: global consistency.</p>
     * <br>
     * <p>*   Specify the transaction splitting feature in the format of `{"DistributedTransaction":"Transaction splitting"}`. Valid values:</p>
     * <br>
     * <p>    *   **on**: enables the transaction splitting feature. By default, the feature is enabled.</p>
     * <p>    *   **off**: disables the transaction splitting feature.</p>
     * <br>
     * <p>*   Specify the offload reads from the primary node feature in the format of `{"MasterAcceptReads":"Offload reads from the primary node"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **on**: The primary node accepts read requests.</p>
     * <p>    *   **off**: The primary node does not accept read requests.</p>
     * <br>
     * <p>*   Specify the connection pool in the format of `{"ConnectionPersist":"Connection pool"}`. Default value: off. Valid values:</p>
     * <br>
     * <p>    *   **off**: disables the connection pool.</p>
     * <p>    *   **Session**: enables the session-level connection pool.</p>
     * <p>    *   **Transaction**: enables the transaction-level connection pool.</p>
     * <br>
     * <p>>- You can specify the transaction splitting, connection pool, and offload reads from the primary node features for a PolarDB for MySQL cluster only if ReadWriteMode is set to ReadWrite for the cluster endpoint.</p>
     * <p>>- Only PolarDB for MySQL supports global consistency.</p>
     * <p>>- If the **ReadWriteMode** parameter is set to **ReadOnly**, the consistency level must be **0**.</p>
     * <p>>- You can use one record to specify the consistency level, transaction splitting, connection pool, and offload reads from the primary node features, such as `{"ConsistLevel":"1","DistributedTransaction":"on","ConnectionPersist":"Session","MasterAcceptReads":"on"}`.</p>
     * <p>>- The transaction splitting settings are restricted by the consistency level settings. For example, if you set the consistency level to **0**, transaction splitting cannot be enabled. If you set the consistency level to **1** or **2**, transaction splitting can be enabled.</p>
     */
    @NameInMap("EndpointConfig")
    public String endpointConfig;

    /**
     * <p>The type of the cluster endpoint. Set the value to **Custom**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The reader nodes that you want to associate with the endpoint. If you want to specify multiple reader nodes, separate the reader nodes with commas (,). If you do not specify this parameter, all nodes are used.</p>
     * <br>
     * <p>>- You need to specify the node IDs for a PolarDB for MySQL cluster.</p>
     * <p>>- You need to specify the role name of each node for a PolarDB for PostgreSQL cluster or a PolarDB for PostgreSQL (Compatible with Oracle) cluster. Example: `Writer, Reader1, Reader2`.</p>
     * <p>>- If you set **ReadWriteMode** to **ReadOnly**, you can associate only one node with the endpoint. If the only node becomes faulty, the cluster endpoint may be unavailable for up to 1 hour. We recommend that you associate more than one node with the cluster endpoint in production environments. We recommend that you associate at least two nodes with the cluster endpoint to improve service availability.</p>
     * <p>>- If you set **ReadWriteMode** to **ReadWrite**, you need to associate at least two nodes with the cluster endpoint.</p>
     * <p>>- PolarDB for MySQL does not impose a limit on the types of the two nodes. If the nodes are read-only nodes, write requests are forwarded to the primary node. </p>
     * <p>>- PolarDB for PostgreSQL and PolarDB for PostgreSQL (compatible with Oracle) require a primary node.</p>
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
     * <p>*   **ReadWrite**: receives and forwards read and write requests. Automatic read/write splitting is enabled.</p>
     * <p>*   **ReadOnly**: The account has the read-only permissions on the database.</p>
     * <br>
     * <p>Default value: **ReadOnly**.</p>
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
