// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDERequest extends TeaModel {
    /**
     * <p>The ID of the custom key. You can call the <a href="https://help.aliyun.com/document_detail/302339.html">DescribeEncryptionKeyList</a> operation to query the key ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you do not specify this parameter, <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a> automatically generates a key.</p>
     * </li>
     * <li><p>To create a custom key, you can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation of the KMS API.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ad463061-992d-4195-8a94-ed63********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption algorithm. Default value: AES-CTR-256.</p>
     * <blockquote>
     * <p>This parameter is available only if the <strong>TDEStatus</strong> parameter is set to <strong>Enabled</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AES-CTR-256</p>
     */
    @NameInMap("EncryptionName")
    public String encryptionName;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the ID of the instance.</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that you want to attach to your ApsaraDB for Redis instance. The ARN must be in the format of <code>acs:ram::$accountID:role/$roleName</code>. After the role is attached, your ApsaraDB for Redis instance can use KMS.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><code>$accountID</code>: the ID of the Alibaba Cloud account. To view the account ID, log on to the Alibaba Cloud console, move the pointer over your profile picture in the upper-right corner of the page, and then click <strong>Security Settings</strong>.</p>
     * </li>
     * <li><p><code>$roleName</code>: the name of the RAM role. Replace $roleName with <strong>AliyunRdsInstanceEncryptionDefaultRole</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to enable TDE. Set the value to <strong>Enabled</strong>.</p>
     * <blockquote>
     * <p>TDE cannot be disabled after it is enabled. Before you enable it, evaluate whether this feature affects your business. For more information, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
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
