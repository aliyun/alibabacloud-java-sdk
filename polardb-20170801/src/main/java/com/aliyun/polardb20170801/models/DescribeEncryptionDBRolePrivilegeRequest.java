// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBRolePrivilegeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-wz9fb5nn44u1d****</p>
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
     * <p>The name of the role permission to query. To query multiple permissions at a time, enter multiple permission names and separate them with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeEncryptionDBRolePrivilege</a> operation to view the details of all role access policy rules for the cluster. The details include the permission names.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RolePrivilegeNameList")
    public String rolePrivilegeNameList;

    public static DescribeEncryptionDBRolePrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBRolePrivilegeRequest self = new DescribeEncryptionDBRolePrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBRolePrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeEncryptionDBRolePrivilegeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEncryptionDBRolePrivilegeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEncryptionDBRolePrivilegeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEncryptionDBRolePrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEncryptionDBRolePrivilegeRequest setRolePrivilegeNameList(String rolePrivilegeNameList) {
        this.rolePrivilegeNameList = rolePrivilegeNameList;
        return this;
    }
    public String getRolePrivilegeNameList() {
        return this.rolePrivilegeNameList;
    }

}
