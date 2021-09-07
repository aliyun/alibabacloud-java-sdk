// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseInstancePublicConnectionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancePublicConnectionRequest self = new ReleaseInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancePublicConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReleaseInstancePublicConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReleaseInstancePublicConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReleaseInstancePublicConnectionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ReleaseInstancePublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseInstancePublicConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReleaseInstancePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
