// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDERequest extends TeaModel {
    /**
     * <p>The file that contains the certificate.\</p>
     * <p>Format:</p>
     * <br>
     * <p>*   Public endpoint: `oss-<The ID of the region>.aliyuncs.com:<The name of the bucket>:<The name of the certificate file>` (The file name contains the extension.)</p>
     * <p>*   Internal endpoint: `oss-<The ID of the region>-internal.aliyuncs.com:<The name of the bucket>:<The name of the certificate file>` (The file name contains the extension.)</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     * <br>
     * <p>*   You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database for which you want to enable TDE. You can specify up to 50 database names in a single request. If you specify multiple database names, separate the database names with commas (,).</p>
     * <br>
     * <p>> This parameter is available and must be specified only when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The ID of the custom key.</p>
     * <br>
     * <p>> This parameter is available when the instance runs MySQL or PostgreSQL.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>Specifies whether to replace the key. Valid values:</p>
     * <br>
     * <p>*   **true**: replaces the key.</p>
     * <p>*   **false**: does not replace the key.</p>
     * <br>
     * <p>Default value: **false**</p>
     * <br>
     * <p>> This parameter is available only when the instance runs PostgreSQL.</p>
     */
    @NameInMap("IsRotate")
    public Boolean isRotate;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the certificate.</p>
     * <br>
     * <p>> This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The file that contains the private key of the certificate.\</p>
     * <p>Format:</p>
     * <br>
     * <p>*   Public endpoint: `oss-<The ID of the region>.aliyuncs.com:<The name of the bucket>:<The name of the file that contains the private key>` (The file name contains the extension.)</p>
     * <p>*   Internal endpoint: `oss-<The ID of the region>-internal.aliyuncs.com:<The name of the bucket>:<The name of the file that contains the private key>` (The file name contains the extension.)</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     * <br>
     * <p>*   You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see [RAM role overview](~~93689~~).</p>
     * <br>
     * <p>> This parameter is available when the instance runs MySQL or PostgreSQL.</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The status of TDE. Valid values:</p>
     * <br>
     * <p>*   **Enabled**</p>
     * <p>*   **Disabled**</p>
     */
    @NameInMap("TDEStatus")
    public String TDEStatus;

    public static ModifyDBInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceTDERequest self = new ModifyDBInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceTDERequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public ModifyDBInstanceTDERequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceTDERequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public ModifyDBInstanceTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public ModifyDBInstanceTDERequest setIsRotate(Boolean isRotate) {
        this.isRotate = isRotate;
        return this;
    }
    public Boolean getIsRotate() {
        return this.isRotate;
    }

    public ModifyDBInstanceTDERequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceTDERequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceTDERequest setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public ModifyDBInstanceTDERequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ModifyDBInstanceTDERequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceTDERequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceTDERequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ModifyDBInstanceTDERequest setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

}
