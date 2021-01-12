// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("SecurityIps")
    public String securityIps;

    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    @NameInMap("SecurityIPType")
    public String securityIPType;

    @NameInMap("WhitelistNetworkType")
    public String whitelistNetworkType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("ModifyMode")
    public String modifyMode;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityIpsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityIpsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityIpsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySecurityIpsRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
        this.DBInstanceIPArrayName = DBInstanceIPArrayName;
        return this;
    }
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
        this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
        return this;
    }
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    public ModifySecurityIpsRequest setSecurityIPType(String securityIPType) {
        this.securityIPType = securityIPType;
        return this;
    }
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    public ModifySecurityIpsRequest setWhitelistNetworkType(String whitelistNetworkType) {
        this.whitelistNetworkType = whitelistNetworkType;
        return this;
    }
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

    public ModifySecurityIpsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
