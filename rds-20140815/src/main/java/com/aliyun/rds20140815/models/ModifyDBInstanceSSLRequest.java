// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    /**
     * <p>The authentication method for an ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported for ApsaraDB RDS for PostgreSQL 12 and later)</li>
     * </ul>
     * <blockquote>
     * <p>This parameter can be configured only when ClientCAEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cert</p>
     */
    @NameInMap("ACL")
    public String ACL;

    /**
     * <p>The type of certificate for ApsaraDB RDS for MySQL and ApsaraDB RDS for PostgreSQL instances with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>aliyun</strong> (default): Alibaba Cloud certificate.</li>
     * <li><strong>custom</strong>: Custom certificate.<blockquote>
     * <p>This parameter is required when SSLEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The custom certificate content for an ApsaraDB RDS for SQL Server instance. Only the <code>pfx</code> certificate format is supported.</p>
     * <ul>
     * <li>Public endpoint: <code>oss-&lt;RegionId&gt;.aliyuncs.com:&lt;BucketName&gt;:&lt;CertificateFileName (certificate file extension)&gt;</code></li>
     * <li>Internal endpoint: <code>oss-&lt;RegionId&gt;-internal.aliyuncs.com:&lt;BucketName&gt;:&lt;CertificateFileName (certificate file extension)&gt;</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-beijing-internal.aliyuncs.com:zhttest:test.pfx</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The client certificate authorization authority public key for an ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * <blockquote>
     * <p>This parameter is required when ClientCAEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
     */
    @NameInMap("ClientCACert")
    public String clientCACert;

    /**
     * <p>Specifies whether to enable the client certification authority (CA) public key for an ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientCAEnabled")
    public Integer clientCAEnabled;

    /**
     * <p>The client certificate revocation certificate file for an ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * <blockquote>
     * <p>This parameter is required when ClientCrlEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
     */
    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    /**
     * <p>Specifies whether to enable the client certificate revocation list (CRL) for an ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter can be configured only when ClientCAEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientCrlEnabled")
    public Integer clientCrlEnabled;

    /**
     * <p>The internal or public endpoint for which you want to create or update the server certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/95715.html">SSL forced encryption switch</a> for ApsaraDB RDS for MySQL and ApsaraDB RDS for SQL Server instances. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
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
     * <p>The password of the custom certificate for an ApsaraDB RDS for SQL Server instance.</p>
     * 
     * <strong>example:</strong>
     * <p>zht123456</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The authentication method for replication permissions on an ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported for ApsaraDB RDS for PostgreSQL 12 and later)<blockquote>
     * <p>This parameter can be configured only when ClientCAEnabled is set to <strong>1</strong>.</p>
     * </blockquote>
     * </li>
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
     * <p>Specifies whether to enable or disable SSL. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    /**
     * <p>The custom certificate content of the server for ApsaraDB RDS for MySQL and ApsaraDB RDS for PostgreSQL instances with cloud disks.</p>
     * <blockquote>
     * <p>This parameter is required when CAType is set to <strong>custom</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the server certificate for ApsaraDB RDS for MySQL and ApsaraDB RDS for PostgreSQL instances with cloud disks.</p>
     * <blockquote>
     * <p>This parameter is required when CAType is set to <strong>custom</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/95715.html">minimum TLS version</a> for an ApsaraDB RDS for SQL Server instance. Connection requests from clients with a TLS version lower than the specified version are rejected. Valid values: 1.0, 1.1, and 1.2.</p>
     * <p>For example, if you set this parameter to 1.1, the server accepts only connection requests from clients that use TLS 1.1 or TLS 1.2. Connection requests from clients that use TLS 1.0 are rejected.</p>
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
