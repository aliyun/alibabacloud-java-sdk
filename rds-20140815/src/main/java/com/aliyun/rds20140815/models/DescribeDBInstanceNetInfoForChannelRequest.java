// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoForChannelRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceNetRWSplitType")
    public String DBInstanceNetRWSplitType;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeDBInstanceNetInfoForChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoForChannelRequest self = new DescribeDBInstanceNetInfoForChannelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoForChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setDBInstanceNetRWSplitType(String DBInstanceNetRWSplitType) {
        this.DBInstanceNetRWSplitType = DBInstanceNetRWSplitType;
        return this;
    }
    public String getDBInstanceNetRWSplitType() {
        return this.DBInstanceNetRWSplitType;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstanceNetInfoForChannelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
