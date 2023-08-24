// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDERequest extends TeaModel {
    /**
     * <p>The ID of the custom key. You can call the [DescribeEncryptionKeyList](~~302339~~) operation to query the key ID.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you do not specify this parameter, [Key Management Service (KMS)](~~28935~~) automatically generates a key.</p>
     * <br>
     * <p>*   To create a custom key, you can call the [CreateKey](~~28947~~) operation of the KMS API.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The encryption algorithm. Default value: AES-CTR-256.</p>
     * <br>
     * <p>> This parameter is available only if the **TDEStatus** parameter is set to **Enabled**.</p>
     */
    @NameInMap("EncryptionName")
    public String encryptionName;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that you want to attach to your ApsaraDB for Redis instance. The ARN must be in the format of `acs:ram::$accountID:role/$roleName`. After the role is attached, your ApsaraDB for Redis instance can use KMS.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   `$accountID`: the ID of the Alibaba Cloud account. To view the account ID, log on to the Alibaba Cloud console, move the pointer over your profile picture in the upper-right corner of the page, and then click **Security Settings**.</p>
     * <br>
     * <p>*   `$roleName`: the name of the RAM role. Replace $roleName with **AliyunRdsInstanceEncryptionDefaultRole**.</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specifies whether to enable TDE. Set the value to **Enabled**.</p>
     * <br>
     * <p>> TDE cannot be disabled after it is enabled. Before you enable it, evaluate whether this feature affects your business. For more information, see [Enable TDE](~~265913~~).</p>
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
