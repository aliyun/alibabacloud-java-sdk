// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceTDERequest extends TeaModel {
    /**
     * <p>The file that contains the certificate.\
     * Format:</p>
     * <ul>
     * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file&gt;</code> (The file name contains the extension.)</li>
     * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file&gt;</code> (The file name contains the extension.)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-ap-southeast-1.aliyuncs.com:****:key.cer</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database for which you want to enable TDE. You can specify up to 50 database names in a single request. If you specify multiple database names, separate the database names with commas (,).</p>
     * <blockquote>
     * <p>This parameter is available and must be specified only when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The ID of the custom key.</p>
     * <blockquote>
     * <p>This parameter is available when the instance runs MySQL or PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>Specifies whether to replace the key. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: replaces the key.</li>
     * <li><strong>false</strong>: does not replace the key.</li>
     * </ul>
     * <p>Default value: <strong>false</strong></p>
     * <blockquote>
     * <p>This parameter is available only when the instance runs PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsRotate")
    public Boolean isRotate;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the certificate.</p>
     * <blockquote>
     * <p>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1qaz@WSX</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The file that contains the private key of the certificate.\
     * Format:</p>
     * <ul>
     * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the file that contains the private key&gt;</code> (The file name contains the extension.)</li>
     * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the file that contains the private key&gt;</code> (The file name contains the extension.)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-ap-southeast-1.aliyuncs.com:****:key.pvk</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93689.html">RAM role overview</a>.</p>
     * <blockquote>
     * <p>This parameter is available when the instance runs MySQL or PostgreSQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The status of TDE. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
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
