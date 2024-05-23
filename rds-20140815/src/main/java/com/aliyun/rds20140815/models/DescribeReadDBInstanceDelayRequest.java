// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayRequest extends TeaModel {
    /**
     * <p>The primary instance ID. You can call the DescribeDBInstances operation to query the primary instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The read-only instance ID. You can call the DescribeDBInstances operation to query the read-only instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReadInstanceId")
    public String readInstanceId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeReadDBInstanceDelayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayRequest self = new DescribeReadDBInstanceDelayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReadDBInstanceDelayRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReadDBInstanceDelayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeReadDBInstanceDelayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeReadDBInstanceDelayRequest setReadInstanceId(String readInstanceId) {
        this.readInstanceId = readInstanceId;
        return this;
    }
    public String getReadInstanceId() {
        return this.readInstanceId;
    }

    public DescribeReadDBInstanceDelayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeReadDBInstanceDelayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeReadDBInstanceDelayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeReadDBInstanceDelayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
