// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must be 2 to 256 characters in length. It must start with a letter or a Chinese character and can contain digits, Chinese characters, letters, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>The description cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account.</p>
     * <blockquote>
     * <p>The name must be unique and can contain uppercase letters (supported only by MySQL), lowercase letters, digits, or underscores. For specific naming conventions, refer to the tutorials for each engine: <a href="https://help.aliyun.com/document_detail/96089.html">Create a MySQL account</a>, <a href="https://help.aliyun.com/document_detail/96753.html">Create a PostgreSQL account</a>, <a href="https://help.aliyun.com/document_detail/95810.html">Create a SQL Server account</a>, <a href="https://help.aliyun.com/document_detail/97132.html">Create a MariaDB account</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account.</p>
     * <blockquote>
     * <ul>
     * <li>The password must be 8 to 32 characters in length.</li>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (<code>!@#$%^&amp;*()_+-=</code>).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong> (default): standard account.</li>
     * <li><strong>Super</strong>: privileged account. You can create at most one privileged account per instance.</li>
     * <li><strong>Sysadmin</strong> (SQL Server instances only): database account with SA permissions. Before you create this account, check whether the instance meets the <a href="https://help.aliyun.com/document_detail/170736.html">prerequisites</a>.</li>
     * <li><strong>GlobalRO</strong> (SQL Server instances only): global read-only account. You can create at most two global read-only accounts per instance. The database engine version of the instance must be SQL Server 2016 or later, and the instance type must be dedicated or general-purpose.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2845728.html">account password policy</a> for the SQL Server instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The policy is applied.</li>
     * <li><strong>false</strong>: The policy is not applied.<blockquote>
     * <ul>
     * <li>If you set this parameter to true, you must first <a href="https://help.aliyun.com/document_detail/2848317.html">configure the SQL Server account password policy</a>.</li>
     * <li>This parameter does not support SQL Server instances of the <a href="https://help.aliyun.com/document_detail/57184.html">shared instance type</a>, <a href="https://help.aliyun.com/document_detail/145468.html">2008 R2 edition</a>, or <a href="https://help.aliyun.com/document_detail/603466.html">serverless type</a>.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckPolicy")
    public Boolean checkPolicy;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
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

    public CreateAccountRequest setCheckPolicy(Boolean checkPolicy) {
        this.checkPolicy = checkPolicy;
        return this;
    }
    public Boolean getCheckPolicy() {
        return this.checkPolicy;
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
