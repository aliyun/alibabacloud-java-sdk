// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDERequest extends TeaModel {
    /**
     * <p>The ID of the custom key. You can call the <a href="https://help.aliyun.com/document_detail/473860.html">DescribeEncryptionKeyList</a> operation to obtain the key ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a> automatically generates a key.</li>
     * <li>To create a custom key, you can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation of Key Management Service (KMS).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ad463061-992d-4195-8a94-ed63********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption algorithm. Default value: AES-CTR-256.</p>
     * <blockquote>
     * <p>This parameter is available only when the <strong>TDEStatus</strong> parameter is set to <strong>Enabled</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES-CTR-256</p>
     */
    @NameInMap("EncryptionName")
    public String encryptionName;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to obtain the instance ID.</p>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the RAM role to authorize. After authorization, you can use the related Key Management Service (KMS) features. Format: <code>acs:ram::$accountID:role/$roleName</code>.</p>
     * <blockquote>
     * <ul>
     * <li><code>$accountID</code>: the Alibaba Cloud account ID. You can logon to the Alibaba Cloud Management Console, move the mouse over the profile picture in the upper-right corner, and click <strong>Security Settings</strong> to view the account ID.</li>
     * <li><code>$roleName</code>: the name of the RAM role. Set the value to <strong>AliyunRdsInstanceEncryptionDefaultRole</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The TDE status. Valid value: <strong>Enabled</strong>.</p>
     * <blockquote>
     * <p>After TDE is enabled, it cannot be disabled. Evaluate the impact on your business before you enable TDE. For more information, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable Transparent Data Encryption (TDE)</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static ModifyInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTDERequest self = new ModifyInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyInstanceTDERequest setEncryptionName(String encryptionName) {
        this.encryptionName = encryptionName;
        return this;
    }
    public String getEncryptionName() {
        return this.encryptionName;
    }

    public ModifyInstanceTDERequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceTDERequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceTDERequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceTDERequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceTDERequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceTDERequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ModifyInstanceTDERequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyInstanceTDERequest setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
