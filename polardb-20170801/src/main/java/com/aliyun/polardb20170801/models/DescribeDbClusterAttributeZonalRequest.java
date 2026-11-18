// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDbClusterAttributeZonalRequest extends TeaModel {
    /**
     * <p>The ID of the edge cluster. You can first call the DescribeDBClustersZonal operation to list available edge clusters, and then use the returned DBClusterId to query the properties. The IDs of common clusters are not applicable. If you do not have an edge cluster, you can call the CreateDBCluster operation and specify CloudProvider=ENS and EnsRegionId to create one. If you do not have an edge cluster, you can call the CreateDBCluster operation and specify the CloudProvider=ENS and EnsRegionId parameters to create one.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to retrieve AI-related node information.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
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

    public static DescribeDbClusterAttributeZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterAttributeZonalRequest self = new DescribeDbClusterAttributeZonalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterAttributeZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDbClusterAttributeZonalRequest setDescribeType(String describeType) {
        this.describeType = describeType;
        return this;
    }
    public String getDescribeType() {
        return this.describeType;
    }

    public DescribeDbClusterAttributeZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDbClusterAttributeZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDbClusterAttributeZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDbClusterAttributeZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
