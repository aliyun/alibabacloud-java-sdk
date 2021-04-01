// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AuditLogs")
    public java.util.List<DescribeAuditLogsResponseBodyAuditLogs> auditLogs;

    public static DescribeAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsResponseBody self = new DescribeAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogsResponseBody setAuditLogs(java.util.List<DescribeAuditLogsResponseBodyAuditLogs> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }
    public java.util.List<DescribeAuditLogsResponseBodyAuditLogs> getAuditLogs() {
        return this.auditLogs;
    }

    public static class DescribeAuditLogsResponseBodyAuditLogs extends TeaModel {
        @NameInMap("OperatorUid")
        public String operatorUid;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("AssetThirdId")
        public String assetThirdId;

        @NameInMap("SessionRegionId")
        public String sessionRegionId;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ClientSourceIp")
        public String clientSourceIp;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AssetRegionId")
        public String assetRegionId;

        @NameInMap("AssetPort")
        public String assetPort;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Content")
        public String content;

        @NameInMap("AssetIp")
        public String assetIp;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeAuditLogsResponseBodyAuditLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditLogsResponseBodyAuditLogs self = new DescribeAuditLogsResponseBodyAuditLogs();
            return TeaModel.build(map, self);
        }

        public DescribeAuditLogsResponseBodyAuditLogs setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetThirdId(String assetThirdId) {
            this.assetThirdId = assetThirdId;
            return this;
        }
        public String getAssetThirdId() {
            return this.assetThirdId;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSessionRegionId(String sessionRegionId) {
            this.sessionRegionId = sessionRegionId;
            return this;
        }
        public String getSessionRegionId() {
            return this.sessionRegionId;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setClientSourceIp(String clientSourceIp) {
            this.clientSourceIp = clientSourceIp;
            return this;
        }
        public String getClientSourceIp() {
            return this.clientSourceIp;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetPort(String assetPort) {
            this.assetPort = assetPort;
            return this;
        }
        public String getAssetPort() {
            return this.assetPort;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAssetIp(String assetIp) {
            this.assetIp = assetIp;
            return this;
        }
        public String getAssetIp() {
            return this.assetIp;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
