// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListResponseBody extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("Incomplete")
    public String incomplete;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Results")
    public java.util.List<GetSessionListResponseBodyResults> results;

    public static GetSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListResponseBody self = new GetSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionListResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionListResponseBody setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetSessionListResponseBody setIncomplete(String incomplete) {
        this.incomplete = incomplete;
        return this;
    }
    public String getIncomplete() {
        return this.incomplete;
    }

    public GetSessionListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSessionListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSessionListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetSessionListResponseBody setResults(java.util.List<GetSessionListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetSessionListResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetSessionListResponseBodyResults extends TeaModel {
        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("LoginCode")
        public Integer loginCode;

        @NameInMap("Action")
        public String action;

        @NameInMap("ClientPort")
        public Integer clientPort;

        @NameInMap("LoginMessage")
        public String loginMessage;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("ServerPort")
        public Integer serverPort;

        @NameInMap("ClientOsUser")
        public String clientOsUser;

        @NameInMap("ServerMac")
        public String serverMac;

        @NameInMap("ClientProgram")
        public String clientProgram;

        @NameInMap("CaptureTime")
        public String captureTime;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("ClientMac")
        public String clientMac;

        public static GetSessionListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetSessionListResponseBodyResults self = new GetSessionListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetSessionListResponseBodyResults setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetSessionListResponseBodyResults setLoginCode(Integer loginCode) {
            this.loginCode = loginCode;
            return this;
        }
        public Integer getLoginCode() {
            return this.loginCode;
        }

        public GetSessionListResponseBodyResults setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetSessionListResponseBodyResults setClientPort(Integer clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Integer getClientPort() {
            return this.clientPort;
        }

        public GetSessionListResponseBodyResults setLoginMessage(String loginMessage) {
            this.loginMessage = loginMessage;
            return this;
        }
        public String getLoginMessage() {
            return this.loginMessage;
        }

        public GetSessionListResponseBodyResults setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetSessionListResponseBodyResults setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public GetSessionListResponseBodyResults setClientOsUser(String clientOsUser) {
            this.clientOsUser = clientOsUser;
            return this;
        }
        public String getClientOsUser() {
            return this.clientOsUser;
        }

        public GetSessionListResponseBodyResults setServerMac(String serverMac) {
            this.serverMac = serverMac;
            return this;
        }
        public String getServerMac() {
            return this.serverMac;
        }

        public GetSessionListResponseBodyResults setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
        }

        public GetSessionListResponseBodyResults setCaptureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public String getCaptureTime() {
            return this.captureTime;
        }

        public GetSessionListResponseBodyResults setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetSessionListResponseBodyResults setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetSessionListResponseBodyResults setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetSessionListResponseBodyResults setClientMac(String clientMac) {
            this.clientMac = clientMac;
            return this;
        }
        public String getClientMac() {
            return this.clientMac;
        }

    }

}
