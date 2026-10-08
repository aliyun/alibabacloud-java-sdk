// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceCLSRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o******6d5</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The encryption algorithm. Valid values:</p>
     * <ul>
     * <li>AES_128_CBC</li>
     * <li>AES_128_GCM</li>
     * <li>AES_128_CTR</li>
     * <li>AES_128_ECB</li>
     * <li>AES_256_CBC</li>
     * <li>AES_256_GCM</li>
     * <li>AES_256_CTR</li>
     * <li>AES_256_ECB</li>
     * <li>SM4_128_CBC</li>
     * <li>SM4_128_GCM</li>
     * <li>SM4_128_CTR</li>
     * <li>SM4_128_ECB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AES_256_GCM</p>
     */
    @NameInMap("EncryptionAlgorithm")
    public String encryptionAlgorithm;

    /**
     * <p>The encryption key ID. This parameter is required when you use a KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The column encryption key mode. Valid values:</p>
     * <ul>
     * <li>client_key: configures a user-generated random key on the client side.</li>
     * <li>kms_key: configures a custom key by using Alibaba Cloud Key Management Service (KMS).</li>
     * </ul>
     * <blockquote>
     * <p> After an instance is configured to use KMS for key management, you can no longer switch to the client-side random key mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kms_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <p>The column encryption status. Valid values:</p>
     * <ul>
     * <li>1: Encryption is enabled.</li>
     * <li>0: Encryption is disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptionStatus")
    public String encryptionStatus;

    /**
     * <p>Specifies whether to rotate the key.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsRotate")
    public Boolean isRotate;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The global resource descriptor of the RAM role, used to specify the role to assume. For details, see RAM role overview.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the column encryption key pattern is set to kms_key. If you do not specify this parameter, the internal default value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Specifies whether to enable the whitelist mode. A value of true indicates that only columns in the whitelist are encrypted. A value of false indicates that all columns are encrypted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WhiteListMode")
    public Boolean whiteListMode;

    public static ModifyDBInstanceCLSRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceCLSRequest self = new ModifyDBInstanceCLSRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceCLSRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceCLSRequest setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    public ModifyDBInstanceCLSRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyDBInstanceCLSRequest setEncryptionKeyMode(String encryptionKeyMode) {
        this.encryptionKeyMode = encryptionKeyMode;
        return this;
    }
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    public ModifyDBInstanceCLSRequest setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    public ModifyDBInstanceCLSRequest setIsRotate(Boolean isRotate) {
        this.isRotate = isRotate;
        return this;
    }
    public Boolean getIsRotate() {
        return this.isRotate;
    }

    public ModifyDBInstanceCLSRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceCLSRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceCLSRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceCLSRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceCLSRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ModifyDBInstanceCLSRequest setWhiteListMode(Boolean whiteListMode) {
        this.whiteListMode = whiteListMode;
        return this;
    }
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

}
