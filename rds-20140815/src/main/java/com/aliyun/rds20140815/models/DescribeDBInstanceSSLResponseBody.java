// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("ACL")
    public String ACL;

    @NameInMap("CAType")
    public String CAType;

    @NameInMap("ClientCACert")
    public String clientCACert;

    @NameInMap("ClientCACertExpireTime")
    public String clientCACertExpireTime;

    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    @NameInMap("ReplicationACL")
    public String replicationACL;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequireUpdate")
    public String requireUpdate;

    @NameInMap("RequireUpdateItem")
    public String requireUpdateItem;

    @NameInMap("RequireUpdateReason")
    public String requireUpdateReason;

    @NameInMap("SSLCreateTime")
    public String SSLCreateTime;

    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    @NameInMap("SSLExpireTime")
    public String SSLExpireTime;

    @NameInMap("ServerCAUrl")
    public String serverCAUrl;

    @NameInMap("ServerCert")
    public String serverCert;

    @NameInMap("ServerKey")
    public String serverKey;

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

}
