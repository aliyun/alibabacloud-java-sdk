// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostWebShellRequest extends TeaModel {
    /**
     * <p>The username of the account that is used to log on to the host of the instance.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The hostname of the instance. You can call the [DescribeDBInstanceIpHostname](~~610525~~) operation to query the hostname.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the most recent region list.</p>
     */
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
