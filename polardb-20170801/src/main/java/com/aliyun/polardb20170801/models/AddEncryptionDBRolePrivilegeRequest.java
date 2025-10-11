// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddEncryptionDBRolePrivilegeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-******************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;notEncryption&quot;:[&quot;alton&quot;],&quot;encryption&quot;:[&quot;alton01&quot;]}</p>
     */
    @NameInMap("RolePrivilegeConfig")
    public String rolePrivilegeConfig;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RolePrivilegeName")
    public String rolePrivilegeName;

    public static AddEncryptionDBRolePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEncryptionDBRolePrivilegeRequest self = new AddEncryptionDBRolePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public AddEncryptionDBRolePrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddEncryptionDBRolePrivilegeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddEncryptionDBRolePrivilegeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddEncryptionDBRolePrivilegeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddEncryptionDBRolePrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddEncryptionDBRolePrivilegeRequest setRolePrivilegeConfig(String rolePrivilegeConfig) {
        this.rolePrivilegeConfig = rolePrivilegeConfig;
        return this;
    }
    public String getRolePrivilegeConfig() {
        return this.rolePrivilegeConfig;
    }

    public AddEncryptionDBRolePrivilegeRequest setRolePrivilegeName(String rolePrivilegeName) {
        this.rolePrivilegeName = rolePrivilegeName;
        return this;
    }
    public String getRolePrivilegeName() {
        return this.rolePrivilegeName;
    }

}
