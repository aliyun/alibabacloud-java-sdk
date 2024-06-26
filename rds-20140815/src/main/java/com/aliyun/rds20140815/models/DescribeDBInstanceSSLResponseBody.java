// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
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
     * <p>The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
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
     * <p>The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
     */
    @NameInMap("ClientCACert")
    public String clientCACert;

    /**
     * <p>The time when the public key of the CA that issues client certificates expires. This parameter is supported only when the instance runs PostgreSQL with cloud disks. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. This parameter is not supported now.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClientCACertExpireTime")
    public String clientCACertExpireTime;

    /**
     * <p>The certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
     */
    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    /**
     * <p>The endpoint that is protected by SSL encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp162dfr55g47****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>Indicates whether the forceful SSL encryption feature is enabled. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>.</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: The feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ForceEncryption")
    public String forceEncryption;

    /**
     * <p>The status of the SSL link. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>setting</strong></li>
     * <li><strong>failed</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>setting</p>
     */
    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    /**
     * <p>The reason why the SSL link stays in the current state. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>Modify DB Instance SSL Config.</p>
     */
    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    /**
     * <p>The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
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

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7705151C-E242-55AF-9929-2A3C39D979D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the server certificate needs to be updated.</p>
     * <ul>
     * <li><p>Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:</p>
     * <ul>
     * <li><strong>No</strong></li>
     * <li><strong>Yes</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid values for ApsaraDB RDS for PostgreSQL instances:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("RequireUpdate")
    public String requireUpdate;

    /**
     * <p>The server certificate that needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RequireUpdateItem")
    public String requireUpdateItem;

    /**
     * <p>The reason why the server certificate needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RequireUpdateReason")
    public String requireUpdateReason;

    /**
     * <p>The time when the server certificate was created. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is valid only when the CAType parameter value is aliyun.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SSLCreateTime")
    public String SSLCreateTime;

    /**
     * <p>Indicates whether SSL encryption is enabled.</p>
     * <ul>
     * <li><p>Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:</p>
     * <ul>
     * <li><strong>Yes</strong></li>
     * <li><strong>No</strong></li>
     * </ul>
     * </li>
     * <li><p>Valid values for ApsaraDB RDS for PostgreSQL instances:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Yes</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    /**
     * <p>The time when the server certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-11T08:16:43Z</p>
     */
    @NameInMap("SSLExpireTime")
    public String SSLExpireTime;

    /**
     * <p>The URL of the certificate that is used to issue the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ServerCAUrl")
    public String serverCAUrl;

    /**
     * <p>The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
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
