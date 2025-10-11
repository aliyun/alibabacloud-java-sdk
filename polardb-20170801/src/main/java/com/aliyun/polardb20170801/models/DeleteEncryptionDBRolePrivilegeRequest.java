// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteEncryptionDBRolePrivilegeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
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
     * <p>test</p>
     */
    @NameInMap("RolePrivilegeNameList")
    public String rolePrivilegeNameList;

    public static DeleteEncryptionDBRolePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEncryptionDBRolePrivilegeRequest self = new DeleteEncryptionDBRolePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEncryptionDBRolePrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteEncryptionDBRolePrivilegeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteEncryptionDBRolePrivilegeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteEncryptionDBRolePrivilegeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteEncryptionDBRolePrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteEncryptionDBRolePrivilegeRequest setRolePrivilegeNameList(String rolePrivilegeNameList) {
        this.rolePrivilegeNameList = rolePrivilegeNameList;
        return this;
    }
    public String getRolePrivilegeNameList() {
        return this.rolePrivilegeNameList;
    }

}
