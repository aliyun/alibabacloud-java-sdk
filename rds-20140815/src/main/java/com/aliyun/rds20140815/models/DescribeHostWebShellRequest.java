// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostWebShellRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPassword")
    public String accountPassword;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionID")
    public String regionID;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeHostWebShellRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostWebShellRequest self = new DescribeHostWebShellRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHostWebShellRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeHostWebShellRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public DescribeHostWebShellRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeHostWebShellRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeHostWebShellRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHostWebShellRequest setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

    public DescribeHostWebShellRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHostWebShellRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
