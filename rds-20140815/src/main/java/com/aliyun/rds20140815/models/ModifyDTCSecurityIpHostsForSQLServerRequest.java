// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the ECS instance and the hostname of the Windows computer. Format: IP address,Hostname. Multiple values are separated with semicolons (;).</p>
     * <br>
     * <p>>  For more information about how to query the computer hostname, see [Configure a distributed transaction whitelist](~~124321~~).</p>
     */
    @NameInMap("SecurityIpHosts")
    public String securityIpHosts;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the whitelist.</p>
     */
    @NameInMap("WhiteListGroupName")
    public String whiteListGroupName;

    public static ModifyDTCSecurityIpHostsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerRequest self = new ModifyDTCSecurityIpHostsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityIpHosts(String securityIpHosts) {
        this.securityIpHosts = securityIpHosts;
        return this;
    }
    public String getSecurityIpHosts() {
        return this.securityIpHosts;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setWhiteListGroupName(String whiteListGroupName) {
        this.whiteListGroupName = whiteListGroupName;
        return this;
    }
    public String getWhiteListGroupName() {
        return this.whiteListGroupName;
    }

}
