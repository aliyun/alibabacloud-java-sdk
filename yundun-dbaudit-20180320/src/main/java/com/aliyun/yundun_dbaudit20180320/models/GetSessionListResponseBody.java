// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionListResponseBody extends TeaModel {
    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Incomplete")
    public String incomplete;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<GetSessionListResponseBodyResults> results;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionListResponseBody self = new GetSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionListResponseBody setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetSessionListResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
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

    public GetSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionListResponseBody setResults(java.util.List<GetSessionListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetSessionListResponseBodyResults> getResults() {
        return this.results;
    }

    public GetSessionListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetSessionListResponseBodyResults extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("CaptureTime")
        public String captureTime;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientMac")
        public String clientMac;

        @NameInMap("ClientOsUser")
        public String clientOsUser;

        @NameInMap("ClientPort")
        public Integer clientPort;

        @NameInMap("ClientProgram")
        public String clientProgram;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("LoginCode")
        public Integer loginCode;

        @NameInMap("LoginMessage")
        public String loginMessage;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerMac")
        public String serverMac;

        @NameInMap("ServerPort")
        public Integer serverPort;

        @NameInMap("SessionId")
        public String sessionId;

        public static GetSessionListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetSessionListResponseBodyResults self = new GetSessionListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetSessionListResponseBodyResults setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
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

        public GetSessionListResponseBodyResults setClientMac(String clientMac) {
            this.clientMac = clientMac;
            return this;
        }
        public String getClientMac() {
            return this.clientMac;
        }

        public GetSessionListResponseBodyResults setClientOsUser(String clientOsUser) {
            this.clientOsUser = clientOsUser;
            return this;
        }
        public String getClientOsUser() {
            return this.clientOsUser;
        }

        public GetSessionListResponseBodyResults setClientPort(Integer clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Integer getClientPort() {
            return this.clientPort;
        }

        public GetSessionListResponseBodyResults setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
        }

        public GetSessionListResponseBodyResults setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetSessionListResponseBodyResults setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetSessionListResponseBodyResults setLoginCode(Integer loginCode) {
            this.loginCode = loginCode;
            return this;
        }
        public Integer getLoginCode() {
            return this.loginCode;
        }

        public GetSessionListResponseBodyResults setLoginMessage(String loginMessage) {
            this.loginMessage = loginMessage;
            return this;
        }
        public String getLoginMessage() {
            return this.loginMessage;
        }

        public GetSessionListResponseBodyResults setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetSessionListResponseBodyResults setServerMac(String serverMac) {
            this.serverMac = serverMac;
            return this;
        }
        public String getServerMac() {
            return this.serverMac;
        }

        public GetSessionListResponseBodyResults setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public GetSessionListResponseBodyResults setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
