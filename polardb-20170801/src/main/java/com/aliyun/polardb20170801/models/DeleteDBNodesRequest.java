// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBNodesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a42***********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The IDs of the nodes.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/185342.html">DescribeDBClusters</a> operation to query the details of all clusters that belong to your Alibaba Cloud account, such as the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-************</p>
     */
    @NameInMap("DBNodeId")
    public java.util.List<String> DBNodeId;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li>RO</li>
     * <li>STANDBY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RO</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBNodesRequest self = new DeleteDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteDBNodesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteDBNodesRequest setDBNodeId(java.util.List<String> DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public java.util.List<String> getDBNodeId() {
        return this.DBNodeId;
    }

    public DeleteDBNodesRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public DeleteDBNodesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDBNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDBNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDBNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
