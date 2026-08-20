// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account.</p>
     * <ul>
     * <li>Must start with a Chinese character or an English letter. Cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>Can contain Chinese characters, English letters, digits, underscores (_), and hyphens (-). </li>
     * <li>Must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testaccount</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The account name. The name must meet the following requirements:</p>
     * <ul>
     * <li>Starts with a lowercase letter and contains only lowercase letters, digits, or underscores (_).</li>
     * <li>Contains up to 100 characters.</li>
     * <li>Cannot be a &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/redis/user-guide/create-and-manage-database-accounts#section-u3q-817-om3">Redis reserved account name</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/redis/user-guide/create-and-manage-database-accounts#section-u3q-817-om3">Redis reserved account name</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoaccount</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, special characters, and digits. The following special characters are supported: <code>!@#$%^&amp;*()_+-=</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uWonno21****</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The permissions of the account. Valid values:</p>
     * <ul>
     * <li><strong>RoleReadOnly</strong>: read-only permissions.</li>
     * <li><strong>RoleReadWrite</strong>: read and write permissions. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RoleReadOnly</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The account type. Set the value to <strong>Normal</strong> (standard account).</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The account parameters to modify in JSON format. The new values overwrite the original values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;access-db-id&quot;:&quot;1&quot;,&quot;cu-limit&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

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

    public CreateAccountRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public CreateAccountRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
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

    public CreateAccountRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateAccountRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

}
