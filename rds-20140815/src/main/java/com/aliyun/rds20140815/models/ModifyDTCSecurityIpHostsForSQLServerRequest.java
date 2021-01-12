// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("SecurityIpHosts")
    public String securityIpHosts;

    @NameInMap("WhiteListGroupName")
    public String whiteListGroupName;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDTCSecurityIpHostsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerRequest self = new ModifyDTCSecurityIpHostsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyDTCSecurityIpHostsForSQLServerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityIpHosts(String securityIpHosts) {
        this.securityIpHosts = securityIpHosts;
        return this;
    }
    public String getSecurityIpHosts() {
        return this.securityIpHosts;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setWhiteListGroupName(String whiteListGroupName) {
        this.whiteListGroupName = whiteListGroupName;
        return this;
    }
    public String getWhiteListGroupName() {
        return this.whiteListGroupName;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
