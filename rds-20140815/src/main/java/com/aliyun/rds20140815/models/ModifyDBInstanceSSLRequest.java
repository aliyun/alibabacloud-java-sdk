// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    /**
     * <p>The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported only when the instance runs PostgreSQL 12 or later)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cert</p>
     */
    @NameInMap("ACL")
    public String ACL;

    /**
     * <p>The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. If you set SSLEnabled to <strong>1</strong>, the default value of this parameter is <strong>aliyun</strong>. Valid values:</p>
     * <ul>
     * <li><strong>aliyun</strong>: a cloud certificate</li>
     * <li><strong>custom</strong>: a custom certificate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The custom certificate. The custom certificate is in the <code>PFX</code> format.</p>
     * <ul>
     * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file (The file name contains the extension.)&gt;</code></li>
     * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file (The file name contains the extension.)&gt;</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-beijing-internal.aliyuncs.com:zhttest:test.pfx</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCAEbabled is set to <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
     */
    @NameInMap("ClientCACert")
    public String clientCACert;

    /**
     * <p>Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the public key.</li>
     * <li><strong>0</strong>: disables the public key.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientCAEnabled")
    public Integer clientCAEnabled;

    /**
     * <p>The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCrlEnabled is set to <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
     */
    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    /**
     * <p>Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the CRL.</li>
     * <li><strong>0</strong>: disables the CRL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientCrlEnabled")
    public Integer clientCrlEnabled;

    /**
     * <p>The internal or public endpoint for which the server certificate needs to be created or updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxx.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable the forceful SSL encryption feature. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceEncryption")
    public String forceEncryption;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>zht123456</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported only when the instance runs PostgreSQL 12 or later)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cert</p>
     */
    @NameInMap("ReplicationACL")
    public String replicationACL;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable or disable the SSL encryption feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    /**
     * <p>The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to <strong>custom</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to <strong>custom</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    /**
     * <p>The minimum Transport Layer Security (TLS) version. Valid values: 1.0, 1.1, and 1.2. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("TlsVersion")
    public String tlsVersion;

    public static ModifyDBInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSSLRequest self = new ModifyDBInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSSLRequest setACL(String ACL) {
        this.ACL = ACL;
        return this;
    }
    public String getACL() {
        return this.ACL;
    }

    public ModifyDBInstanceSSLRequest setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public ModifyDBInstanceSSLRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public ModifyDBInstanceSSLRequest setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public ModifyDBInstanceSSLRequest setClientCAEnabled(Integer clientCAEnabled) {
        this.clientCAEnabled = clientCAEnabled;
        return this;
    }
    public Integer getClientCAEnabled() {
        return this.clientCAEnabled;
    }

    public ModifyDBInstanceSSLRequest setClientCertRevocationList(String clientCertRevocationList) {
        this.clientCertRevocationList = clientCertRevocationList;
        return this;
    }
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    public ModifyDBInstanceSSLRequest setClientCrlEnabled(Integer clientCrlEnabled) {
        this.clientCrlEnabled = clientCrlEnabled;
        return this;
    }
    public Integer getClientCrlEnabled() {
        return this.clientCrlEnabled;
    }

    public ModifyDBInstanceSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceSSLRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSSLRequest setForceEncryption(String forceEncryption) {
        this.forceEncryption = forceEncryption;
        return this;
    }
    public String getForceEncryption() {
        return this.forceEncryption;
    }

    public ModifyDBInstanceSSLRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSSLRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSSLRequest setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public ModifyDBInstanceSSLRequest setReplicationACL(String replicationACL) {
        this.replicationACL = replicationACL;
        return this;
    }
    public String getReplicationACL() {
        return this.replicationACL;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSSLRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSSLRequest setSSLEnabled(Integer SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    public ModifyDBInstanceSSLRequest setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public ModifyDBInstanceSSLRequest setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

    public ModifyDBInstanceSSLRequest setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
        return this;
    }
    public String getTlsVersion() {
        return this.tlsVersion;
    }

}
