// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeRequest extends TeaModel {
    /**
     * <p>The retention days of the classic network endpoint. Valid values: **1 to 120**. Unit: days.</p>
     */
    @NameInMap("ClassicExpiredDays")
    public Integer classicExpiredDays;

    /**
     * <p>The classic network endpoint whose expiration time you want to extend. Two types of classic network endpoints are supported:</p>
     * <br>
     * <p>*   The internal endpoint of the classic network.</p>
     * <p>*   The read/write splitting endpoint of the classic network.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceNetworkExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkExpireTimeRequest self = new ModifyDBInstanceNetworkExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setClassicExpiredDays(Integer classicExpiredDays) {
        this.classicExpiredDays = classicExpiredDays;
        return this;
    }
    public Integer getClassicExpiredDays() {
        return this.classicExpiredDays;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceNetworkExpireTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
