// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The value must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
     * <blockquote>
     * <p>: The name cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test Account A</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account.</p>
     * <ul>
     * <li><p>The name must be unique.</p>
     * </li>
     * <li><p>The name can contain lowercase letters, digits, and underscores (_). For MySQL databases, the name can contain uppercase letters.</p>
     * </li>
     * <li><p>The name must start with a letter and end with a letter or digit.</p>
     * </li>
     * <li><p>For MySQL databases, the name of the privileged account cannot be the same as that of the standard account. For example, if the name of the privileged account is <code>Test1</code>, the name of the standard account cannot be <code>test1</code>.</p>
     * </li>
     * <li><p>The length of the value must meet the following requirements:</p>
     * <ul>
     * <li>If the instance runs MySQL 5.7 or MySQL 8.0, the value must be 2 to 32 characters in length.</li>
     * <li>If the instance runs MySQL 5.6, the value must be 2 to 16 characters in length.</li>
     * <li>If the instance runs SQL Server, the value must be 2 to 64 characters in length.</li>
     * <li>If the instance runs PostgreSQL with cloud disks, the value must be 2 to 63 characters in length.</li>
     * <li>If the instance runs PostgreSQL with local disks, the value must be 2 to 16 characters in length.</li>
     * <li>If the instance runs MariaDB, the value must be 2 to 16 characters in length.</li>
     * </ul>
     * </li>
     * <li><p>For more information about invalid characters, see <a href="https://help.aliyun.com/document_detail/26317.html">Forbidden keywords</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account.</p>
     * <ul>
     * <li><p>The value must be 8 to 32 characters in length.</p>
     * </li>
     * <li><p>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The account type. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard account (default).</li>
     * <li><strong>Super</strong>: privileged account.</li>
     * <li><strong>Sysadmin</strong>: system admin account. The account type is available only for ApsaraDB RDS for SQL Server instances.</li>
     * </ul>
     * <p>Before you create a system admin account, check whether the RDS instance meets all prerequisites. For more information, see <a href="https://help.aliyun.com/document_detail/170736.html">Create a system admin account</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateAccountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
