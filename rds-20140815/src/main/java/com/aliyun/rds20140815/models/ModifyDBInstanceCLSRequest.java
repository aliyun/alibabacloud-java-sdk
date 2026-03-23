// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceCLSRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n8t18o******6d5</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Encryption algorithm to use. Valid values:</p>
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
     * <p>Encryption key ID. This parameter is required when using a KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>Column encryption key mode. Valid values:</p>
     * <ul>
     * <li>client_key (configure a randomly generated user key on the client side)</li>
     * <li>kms_key (use a custom key configured via Alibaba Cloud KMS)</li>
     * </ul>
     * <p>Note:
     * Once an instance is configured to use a KMS key, it can no longer use the client-side random key configuration method.</p>
     * 
     * <strong>example:</strong>
     * <p>kms_key</p>
     */
    @NameInMap("EncryptionKeyMode")
    public String encryptionKeyMode;

    /**
     * <p>Column encryption status. Valid values:</p>
     * <ul>
     * <li>1 (Enabled)</li>
     * <li>0 (Disabled)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptionStatus")
    public String encryptionStatus;

    /**
     * <p>Whether to rotate the key</p>
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
     * <p>Global Resource Descriptor (GRD) of the role used to specify the exact role. For more information, see RAM Role Overview.</p>
     * <p>Note:
     * This parameter takes effect only when the column encryption key mode is set to kms_key. If not provided, the system uses an internal default value.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>Whether to enable whitelist mode. true indicates that only columns in the whitelist are encrypted; false indicates that all columns are encrypted.</p>
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
