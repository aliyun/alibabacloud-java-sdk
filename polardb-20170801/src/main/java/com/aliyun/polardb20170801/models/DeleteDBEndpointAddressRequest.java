// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBEndpointAddressRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](https://help.aliyun.com/document_detail/98094.html) operation to query the details of all clusters that belong to your account, such as the cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusterEndpoints](https://help.aliyun.com/document_detail/98205.html) operation to query the endpoints of a specified PolarDB cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the endpoint. Set the value to **Public** (public network).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDBEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBEndpointAddressRequest self = new DeleteDBEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBEndpointAddressRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteDBEndpointAddressRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public DeleteDBEndpointAddressRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DeleteDBEndpointAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDBEndpointAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDBEndpointAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDBEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
