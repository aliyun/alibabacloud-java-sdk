// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DstDBName")
    public String dstDBName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReserveAccount")
    public Integer reserveAccount;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SrcDBName")
    public String srcDBName;

    public static CopyDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseRequest self = new CopyDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CopyDatabaseRequest setDstDBName(String dstDBName) {
        this.dstDBName = dstDBName;
        return this;
    }
    public String getDstDBName() {
        return this.dstDBName;
    }

    public CopyDatabaseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyDatabaseRequest setReserveAccount(Integer reserveAccount) {
        this.reserveAccount = reserveAccount;
        return this;
    }
    public Integer getReserveAccount() {
        return this.reserveAccount;
    }

    public CopyDatabaseRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopyDatabaseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyDatabaseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopyDatabaseRequest setSrcDBName(String srcDBName) {
        this.srcDBName = srcDBName;
        return this;
    }
    public String getSrcDBName() {
        return this.srcDBName;
    }

}
