// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLinksRequest extends TeaModel {
    /**
     * <p>The ID of the cluster for which you want to query DBLink information.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query the list of PolarDB clusters.</p>
     * </blockquote>
     * <blockquote>
     * <p>Use only the ID of a supported PolarDB for PostgreSQL (Compatible with Oracle) cluster. Unsupported engines or versions return InvalidEngine.Unsupported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-a*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the DBLink. If you do not specify this parameter, all DBLinks are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>dblink_test</p>
     */
    @NameInMap("DBLinkName")
    public String DBLinkName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLinksRequest self = new DescribeDBLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBLinksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBLinksRequest setDBLinkName(String DBLinkName) {
        this.DBLinkName = DBLinkName;
        return this;
    }
    public String getDBLinkName() {
        return this.DBLinkName;
    }

    public DescribeDBLinksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBLinksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBLinksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBLinksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
