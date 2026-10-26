// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListRequest extends TeaModel {
    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The network type of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong>: the classic network in enhanced whitelist mode</li>
     * <li><strong>VPC</strong>: the VPC in enhanced whitelist mode</li>
     * <li><strong>MIX</strong>: the standard whitelist mode</li>
     * </ul>
     * <p>By default, the IP addresses in the whitelists of all network types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("WhitelistNetworkType")
    public String whitelistNetworkType;

    public static DescribeDBInstanceIPArrayListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListRequest self = new DescribeDBInstanceIPArrayListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIPArrayListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstanceIPArrayListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstanceIPArrayListRequest setWhitelistNetworkType(String whitelistNetworkType) {
        this.whitelistNetworkType = whitelistNetworkType;
        return this;
    }
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

}
