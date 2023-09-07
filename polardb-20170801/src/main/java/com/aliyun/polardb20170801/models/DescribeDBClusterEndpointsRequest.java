// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    @NameInMap("DescribeType")
    public String describeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBClusterEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsRequest self = new DescribeDBClusterEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterEndpointsRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public DescribeDBClusterEndpointsRequest setDescribeType(String describeType) {
        this.describeType = describeType;
        return this;
    }
    public String getDescribeType() {
        return this.describeType;
    }

    public DescribeDBClusterEndpointsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClusterEndpointsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClusterEndpointsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClusterEndpointsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
