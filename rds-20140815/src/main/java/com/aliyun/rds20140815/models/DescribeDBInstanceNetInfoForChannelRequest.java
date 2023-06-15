// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoForChannelRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of the endpoint to query. Valid values:</p>
     * <br>
     * <p>*   **0**: a regular endpoint. This is the default value.</p>
     * <p>*   **1**: a read/write splitting endpoint that is assigned after the shared proxy feature is enabled.</p>
     */
    @NameInMap("DBInstanceNetRWSplitType")
    public String DBInstanceNetRWSplitType;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
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
