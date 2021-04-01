// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class DescribeSessionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sessions")
    public java.util.List<DescribeSessionsResponseBodySessions> sessions;

    public static DescribeSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionsResponseBody self = new DescribeSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSessionsResponseBody setSessions(java.util.List<DescribeSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public static class DescribeSessionsResponseBodySessions extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("OperatorUid")
        public String operatorUid;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("SessionStatus")
        public String sessionStatus;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("AssetThirdId")
        public String assetThirdId;

        @NameInMap("SessionType")
        public String sessionType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AssetRegionId")
        public String assetRegionId;

        public static DescribeSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSessionsResponseBodySessions self = new DescribeSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeSessionsResponseBodySessions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSessionsResponseBodySessions setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public DescribeSessionsResponseBodySessions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSessionsResponseBodySessions setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeSessionsResponseBodySessions setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public DescribeSessionsResponseBodySessions setAssetThirdId(String assetThirdId) {
            this.assetThirdId = assetThirdId;
            return this;
        }
        public String getAssetThirdId() {
            return this.assetThirdId;
        }

        public DescribeSessionsResponseBodySessions setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeSessionsResponseBodySessions setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeSessionsResponseBodySessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeSessionsResponseBodySessions setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSessionsResponseBodySessions setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

    }

}
