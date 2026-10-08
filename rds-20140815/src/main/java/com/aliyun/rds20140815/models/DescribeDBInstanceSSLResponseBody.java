// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The authentication method of the ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported by ApsaraDB RDS for PostgreSQL 12 and later)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cert</p>
     */
    @NameInMap("ACL")
    public String ACL;

    /**
     * <p>The server certificate type of the ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>aliyun</strong>: The cloud certificate is used.</li>
     * <li><strong>custom</strong>: A custom certificate is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The public key of the client certificate authority (CA) for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
     */
    @NameInMap("ClientCACert")
    public String clientCACert;

    /**
     * <p>The expiration time of the public key of the client certificate authorization authority (CA) for the ApsaraDB RDS for PostgreSQL instance with cloud disks. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <p>This parameter is not supported. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClientCACertExpireTime")
    public String clientCACertExpireTime;

    /**
     * <p>The client certificate revocation certificate file of the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
     */
    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    /**
     * <p>The endpoint that is protected by SSL.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp162dfr55g47****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>Indicates whether the <a href="https://help.aliyun.com/document_detail/95715.html">forced Secure Sockets Layer (SSL) encryption feature</a> is enabled for the ApsaraDB RDS for SQL Server instance. Valid values:</p>
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

    /**
     * <p>The current SSL link configuration status of the ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: Successful.</li>
     * <li><strong>setting</strong>: Being configured.</li>
     * <li><strong>failed</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>setting</p>
     */
    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    /**
     * <p>The reason for the current SSL link configuration status of the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>Modify DB Instance SSL Config.</p>
     */
    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    /**
     * <p>The authentication method for replication permissions of the ApsaraDB RDS for PostgreSQL instance with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>cert</strong></li>
     * <li><strong>prefer</strong></li>
     * <li><strong>verify-ca</strong></li>
     * <li><strong>verify-full</strong> (supported by ApsaraDB RDS for PostgreSQL 12 and later)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cert</p>
     */
    @NameInMap("ReplicationACL")
    public String replicationACL;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7705151C-E242-55AF-9929-2A3C39D979D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the SSL certificate needs to be updated. Valid values:</p>
     * <blockquote>
     * <p>The SSL certificate is valid for one year. If the certificate is not renewed after it expires, client programs that use encrypted connections cannot connect to the instance.</p>
     * </blockquote>
     * <details>
     * <summary>MySQL and SQL Server</summary>
     * 
     * <ul>
     * <li><strong>No</strong>: No update is required.</li>
     * <li><strong>Yes</strong>: An update is required.</details></li>
     * </ul>
     * <details>
     * <summary>PostgreSQL</summary>
     * 
     * <ul>
     * <li><strong>0</strong>: No update is required.</li>
     * <li><strong>1</strong>: An update is required.</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("RequireUpdate")
    public String requireUpdate;

    /**
     * <p>The list of server certificates that need to be updated for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RequireUpdateItem")
    public String requireUpdateItem;

    /**
     * <p>The reason why the certificates need to be updated for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RequireUpdateReason")
    public String requireUpdateReason;

    /**
     * <p>The creation time of the server certificate for the ApsaraDB RDS for PostgreSQL instance with cloud disks. This parameter is valid only when CAType is set to aliyun.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SSLCreateTime")
    public String SSLCreateTime;

    /**
     * <p>The SSL encryption status. Valid values:</p>
     * <details>
     * <summary>MySQL and SQL Server</summary>
     * 
     * <ul>
     * <li><strong>Yes</strong>: Enabled.</li>
     * <li><strong>No</strong>: Disabled.</details></li>
     * </ul>
     * <details>
     * <summary>PostgreSQL</summary>
     * 
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    /**
     * <p>The expiration time of the SSL certificate. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-16T08:16:43Z</p>
     */
    @NameInMap("SSLExpireTime")
    public String SSLExpireTime;

    /**
     * <p>The URL of the CA certificate that is used to issue the server certificate for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ServerCAUrl")
    public String serverCAUrl;

    /**
     * <p>The content of the server certificate for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the server certificate for the ApsaraDB RDS for PostgreSQL instance with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    /**
     * <p>The specified <a href="https://help.aliyun.com/document_detail/95715.html">minimum TLS version</a> for the ApsaraDB RDS for SQL Server instance. Valid values: 1.0, 1.1, and 1.2.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("TlsVersion")
    public String tlsVersion;

    public static DescribeDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponseBody self = new DescribeDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLResponseBody setACL(String ACL) {
        this.ACL = ACL;
        return this;
    }
    public String getACL() {
        return this.ACL;
    }

    public DescribeDBInstanceSSLResponseBody setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public DescribeDBInstanceSSLResponseBody setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public DescribeDBInstanceSSLResponseBody setClientCACertExpireTime(String clientCACertExpireTime) {
        this.clientCACertExpireTime = clientCACertExpireTime;
        return this;
    }
    public String getClientCACertExpireTime() {
        return this.clientCACertExpireTime;
    }

    public DescribeDBInstanceSSLResponseBody setClientCertRevocationList(String clientCertRevocationList) {
        this.clientCertRevocationList = clientCertRevocationList;
        return this;
    }
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    public DescribeDBInstanceSSLResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBInstanceSSLResponseBody setForceEncryption(String forceEncryption) {
        this.forceEncryption = forceEncryption;
        return this;
    }
    public String getForceEncryption() {
        return this.forceEncryption;
    }

    public DescribeDBInstanceSSLResponseBody setLastModifyStatus(String lastModifyStatus) {
        this.lastModifyStatus = lastModifyStatus;
        return this;
    }
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    public DescribeDBInstanceSSLResponseBody setModifyStatusReason(String modifyStatusReason) {
        this.modifyStatusReason = modifyStatusReason;
        return this;
    }
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    public DescribeDBInstanceSSLResponseBody setReplicationACL(String replicationACL) {
        this.replicationACL = replicationACL;
        return this;
    }
    public String getReplicationACL() {
        return this.replicationACL;
    }

    public DescribeDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdate(String requireUpdate) {
        this.requireUpdate = requireUpdate;
        return this;
    }
    public String getRequireUpdate() {
        return this.requireUpdate;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdateItem(String requireUpdateItem) {
        this.requireUpdateItem = requireUpdateItem;
        return this;
    }
    public String getRequireUpdateItem() {
        return this.requireUpdateItem;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdateReason(String requireUpdateReason) {
        this.requireUpdateReason = requireUpdateReason;
        return this;
    }
    public String getRequireUpdateReason() {
        return this.requireUpdateReason;
    }

    public DescribeDBInstanceSSLResponseBody setSSLCreateTime(String SSLCreateTime) {
        this.SSLCreateTime = SSLCreateTime;
        return this;
    }
    public String getSSLCreateTime() {
        return this.SSLCreateTime;
    }

    public DescribeDBInstanceSSLResponseBody setSSLEnabled(String SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    public DescribeDBInstanceSSLResponseBody setSSLExpireTime(String SSLExpireTime) {
        this.SSLExpireTime = SSLExpireTime;
        return this;
    }
    public String getSSLExpireTime() {
        return this.SSLExpireTime;
    }

    public DescribeDBInstanceSSLResponseBody setServerCAUrl(String serverCAUrl) {
        this.serverCAUrl = serverCAUrl;
        return this;
    }
    public String getServerCAUrl() {
        return this.serverCAUrl;
    }

    public DescribeDBInstanceSSLResponseBody setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public DescribeDBInstanceSSLResponseBody setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

    public DescribeDBInstanceSSLResponseBody setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
        return this;
    }
    public String getTlsVersion() {
        return this.tlsVersion;
    }

}
