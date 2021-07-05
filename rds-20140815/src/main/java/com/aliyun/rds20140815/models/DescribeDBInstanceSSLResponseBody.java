// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("ServerCert")
    public String serverCert;

    @NameInMap("ClientCACertExpireTime")
    public String clientCACertExpireTime;

    @NameInMap("RequireUpdateItem")
    public String requireUpdateItem;

    @NameInMap("ServerCAUrl")
    public String serverCAUrl;

    @NameInMap("RequireUpdate")
    public String requireUpdate;

    @NameInMap("ClientCertRevocationList")
    public String clientCertRevocationList;

    @NameInMap("SSLExpireTime")
    public String SSLExpireTime;

    @NameInMap("CAType")
    public String CAType;

    @NameInMap("SSLCreateTime")
    public String SSLCreateTime;

    @NameInMap("ReplicationACL")
    public String replicationACL;

    @NameInMap("ACL")
    public String ACL;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LastModifyStatus")
    public String lastModifyStatus;

    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("RequireUpdateReason")
    public String requireUpdateReason;

    @NameInMap("ClientCACert")
    public String clientCACert;

    @NameInMap("ServerKey")
    public String serverKey;

    @NameInMap("ModifyStatusReason")
    public String modifyStatusReason;

    public static DescribeDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponseBody self = new DescribeDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLResponseBody setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public DescribeDBInstanceSSLResponseBody setClientCACertExpireTime(String clientCACertExpireTime) {
        this.clientCACertExpireTime = clientCACertExpireTime;
        return this;
    }
    public String getClientCACertExpireTime() {
        return this.clientCACertExpireTime;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdateItem(String requireUpdateItem) {
        this.requireUpdateItem = requireUpdateItem;
        return this;
    }
    public String getRequireUpdateItem() {
        return this.requireUpdateItem;
    }

    public DescribeDBInstanceSSLResponseBody setServerCAUrl(String serverCAUrl) {
        this.serverCAUrl = serverCAUrl;
        return this;
    }
    public String getServerCAUrl() {
        return this.serverCAUrl;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdate(String requireUpdate) {
        this.requireUpdate = requireUpdate;
        return this;
    }
    public String getRequireUpdate() {
        return this.requireUpdate;
    }

    public DescribeDBInstanceSSLResponseBody setClientCertRevocationList(String clientCertRevocationList) {
        this.clientCertRevocationList = clientCertRevocationList;
        return this;
    }
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    public DescribeDBInstanceSSLResponseBody setSSLExpireTime(String SSLExpireTime) {
        this.SSLExpireTime = SSLExpireTime;
        return this;
    }
    public String getSSLExpireTime() {
        return this.SSLExpireTime;
    }

    public DescribeDBInstanceSSLResponseBody setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public DescribeDBInstanceSSLResponseBody setSSLCreateTime(String SSLCreateTime) {
        this.SSLCreateTime = SSLCreateTime;
        return this;
    }
    public String getSSLCreateTime() {
        return this.SSLCreateTime;
    }

    public DescribeDBInstanceSSLResponseBody setReplicationACL(String replicationACL) {
        this.replicationACL = replicationACL;
        return this;
    }
    public String getReplicationACL() {
        return this.replicationACL;
    }

    public DescribeDBInstanceSSLResponseBody setACL(String ACL) {
        this.ACL = ACL;
        return this;
    }
    public String getACL() {
        return this.ACL;
    }

    public DescribeDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSSLResponseBody setLastModifyStatus(String lastModifyStatus) {
        this.lastModifyStatus = lastModifyStatus;
        return this;
    }
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    public DescribeDBInstanceSSLResponseBody setSSLEnabled(String SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    public DescribeDBInstanceSSLResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBInstanceSSLResponseBody setRequireUpdateReason(String requireUpdateReason) {
        this.requireUpdateReason = requireUpdateReason;
        return this;
    }
    public String getRequireUpdateReason() {
        return this.requireUpdateReason;
    }

    public DescribeDBInstanceSSLResponseBody setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public DescribeDBInstanceSSLResponseBody setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

    public DescribeDBInstanceSSLResponseBody setModifyStatusReason(String modifyStatusReason) {
        this.modifyStatusReason = modifyStatusReason;
        return this;
    }
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

}
