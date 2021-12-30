// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListResponseBody extends TeaModel {
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
    public java.util.List<GetLogListResponseBodyResults> results;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogListResponseBody self = new GetLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogListResponseBody setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetLogListResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogListResponseBody setIncomplete(String incomplete) {
        this.incomplete = incomplete;
        return this;
    }
    public String getIncomplete() {
        return this.incomplete;
    }

    public GetLogListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogListResponseBody setResults(java.util.List<GetLogListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetLogListResponseBodyResults> getResults() {
        return this.results;
    }

    public GetLogListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetLogListResponseBodyResults extends TeaModel {
        @NameInMap("AffectRows")
        public Integer affectRows;

        @NameInMap("AppClientIp")
        public String appClientIp;

        @NameInMap("AppUsername")
        public String appUsername;

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

        @NameInMap("DbServer")
        public String dbServer;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("ExecCostUS")
        public Integer execCostUS;

        @NameInMap("FetchCostUS")
        public Integer fetchCostUS;

        @NameInMap("InstName")
        public String instName;

        @NameInMap("ResponseCode")
        public String responseCode;

        @NameInMap("ResponseText")
        public String responseText;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("RuleId")
        public Integer ruleId;

        @NameInMap("RuleKeyId")
        public Integer ruleKeyId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("ServerMac")
        public String serverMac;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("SessionLoginTime")
        public String sessionLoginTime;

        @NameInMap("SessionLogoutTime")
        public String sessionLogoutTime;

        @NameInMap("SqlContent")
        public String sqlContent;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("TemplateId")
        public String templateId;

        public static GetLogListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetLogListResponseBodyResults self = new GetLogListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetLogListResponseBodyResults setAffectRows(Integer affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Integer getAffectRows() {
            return this.affectRows;
        }

        public GetLogListResponseBodyResults setAppClientIp(String appClientIp) {
            this.appClientIp = appClientIp;
            return this;
        }
        public String getAppClientIp() {
            return this.appClientIp;
        }

        public GetLogListResponseBodyResults setAppUsername(String appUsername) {
            this.appUsername = appUsername;
            return this;
        }
        public String getAppUsername() {
            return this.appUsername;
        }

        public GetLogListResponseBodyResults setCaptureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }
        public String getCaptureTime() {
            return this.captureTime;
        }

        public GetLogListResponseBodyResults setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetLogListResponseBodyResults setClientMac(String clientMac) {
            this.clientMac = clientMac;
            return this;
        }
        public String getClientMac() {
            return this.clientMac;
        }

        public GetLogListResponseBodyResults setClientOsUser(String clientOsUser) {
            this.clientOsUser = clientOsUser;
            return this;
        }
        public String getClientOsUser() {
            return this.clientOsUser;
        }

        public GetLogListResponseBodyResults setClientPort(Integer clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Integer getClientPort() {
            return this.clientPort;
        }

        public GetLogListResponseBodyResults setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
        }

        public GetLogListResponseBodyResults setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetLogListResponseBodyResults setDbServer(String dbServer) {
            this.dbServer = dbServer;
            return this;
        }
        public String getDbServer() {
            return this.dbServer;
        }

        public GetLogListResponseBodyResults setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetLogListResponseBodyResults setExecCostUS(Integer execCostUS) {
            this.execCostUS = execCostUS;
            return this;
        }
        public Integer getExecCostUS() {
            return this.execCostUS;
        }

        public GetLogListResponseBodyResults setFetchCostUS(Integer fetchCostUS) {
            this.fetchCostUS = fetchCostUS;
            return this;
        }
        public Integer getFetchCostUS() {
            return this.fetchCostUS;
        }

        public GetLogListResponseBodyResults setInstName(String instName) {
            this.instName = instName;
            return this;
        }
        public String getInstName() {
            return this.instName;
        }

        public GetLogListResponseBodyResults setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public GetLogListResponseBodyResults setResponseText(String responseText) {
            this.responseText = responseText;
            return this;
        }
        public String getResponseText() {
            return this.responseText;
        }

        public GetLogListResponseBodyResults setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetLogListResponseBodyResults setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public GetLogListResponseBodyResults setRuleKeyId(Integer ruleKeyId) {
            this.ruleKeyId = ruleKeyId;
            return this;
        }
        public Integer getRuleKeyId() {
            return this.ruleKeyId;
        }

        public GetLogListResponseBodyResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetLogListResponseBodyResults setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetLogListResponseBodyResults setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetLogListResponseBodyResults setServerMac(String serverMac) {
            this.serverMac = serverMac;
            return this;
        }
        public String getServerMac() {
            return this.serverMac;
        }

        public GetLogListResponseBodyResults setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetLogListResponseBodyResults setSessionLoginTime(String sessionLoginTime) {
            this.sessionLoginTime = sessionLoginTime;
            return this;
        }
        public String getSessionLoginTime() {
            return this.sessionLoginTime;
        }

        public GetLogListResponseBodyResults setSessionLogoutTime(String sessionLogoutTime) {
            this.sessionLogoutTime = sessionLogoutTime;
            return this;
        }
        public String getSessionLogoutTime() {
            return this.sessionLogoutTime;
        }

        public GetLogListResponseBodyResults setSqlContent(String sqlContent) {
            this.sqlContent = sqlContent;
            return this;
        }
        public String getSqlContent() {
            return this.sqlContent;
        }

        public GetLogListResponseBodyResults setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetLogListResponseBodyResults setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetLogListResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
