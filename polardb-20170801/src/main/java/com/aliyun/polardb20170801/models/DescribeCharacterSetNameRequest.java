// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can only query character sets that PolarDB for MySQL clusters support. If you enter the ID of a PolarDB for PostgreSQL or PolarDB for Oracle cluster, the returned value of the `CharacterSetNameItems` parameter is an empty string.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~98041~~) operation to query available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeCharacterSetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameRequest self = new DescribeCharacterSetNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeCharacterSetNameRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCharacterSetNameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCharacterSetNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCharacterSetNameRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCharacterSetNameRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
