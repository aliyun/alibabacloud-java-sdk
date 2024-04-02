// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSSLRequest extends TeaModel {
    /**
     * <p>The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <br>
     * <p>*   **cert**</p>
     * <p>*   **prefer**</p>
     * <p>*   **verify-ca**</p>
     * <p>*   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)</p>
     */
    @NameInMap("ACL")
    public String ACL;

    /**
     * <p>The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. If you set SSLEnabled to **1**, the default value of this parameter is **aliyun**. Valid values:</p>
     * <br>
     * <p>*   **aliyun**: a cloud certificate</p>
     * <p>*   **custom**: a custom certificate</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>User-defined certificate. The custom certificate is in pfx format.</p>
     * <br>
     * <p>- Public address: `oss-<region ID>.aliyuncs.com:<Bucket name >:< certificate file name (with file suffix)>`</p>
     * <p>- Intranet address: `oss-<region ID>-internal.aliyuncs.com:<Bucket name >:< certificate file name (with file suffix)>`</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCAEbabled is set to **1**.</p>
     */
    @NameInMap("ClientCACert")
    public String clientCACert;

    /**
     * <p>Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the public key.</p>
     * <p>*   **0**: disables the public key.</p>
     */
    @NameInMap("ClientCAEnabled")
    public Integer clientCAEnabled;

    /**
     * <p>The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCrlEnabled is set to **1**.</p>
     */
    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    /**
     * <p>Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the CRL.</p>
     * <p>*   **0**: disables the CRL.</p>
     */
    @NameInMap("ClientCrlEnabled")
    public Integer clientCrlEnabled;

    /**
     * <p>The internal or public endpoint for which the server certificate needs to be created or updated.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to enable the forceful SSL encryption feature. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see [Configure the SSL encryption feature](~~95715~~). Valid values:</p>
     * <br>
     * <p>*   **1**: enables the feature.</p>
     * <p>*   **0**: disables the feature.</p>
     */
    @NameInMap("ForceEncryption")
    public String forceEncryption;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the certificate.</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The method that is used to verify the replication permissions. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
     * <br>
     * <p>*   **cert**</p>
     * <p>*   **prefer**</p>
     * <p>*   **verify-ca**</p>
     * <p>*   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)</p>
     */
    @NameInMap("ReplicationACL")
    public String replicationACL;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable or disable the SSL encryption feature. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the feature.</p>
     * <p>*   **0**: disables the feature.</p>
     */
    @NameInMap("SSLEnabled")
    public Integer SSLEnabled;

    /**
     * <p>The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to **custom**.</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to **custom**.</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    /**
     * <p>The minimum Transport Layer Security (TLS) version. Valid values: 1.0, 1.1, and 1.2. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see [Configure the SSL encryption feature](~~95715~~).</p>
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
