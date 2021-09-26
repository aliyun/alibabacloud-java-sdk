// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListResponseBody extends TeaModel {
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
    public Integer totalCount;

    @NameInMap("Results")
    public java.util.List<GetLogListResponseBodyResults> results;

    public static GetLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogListResponseBody self = new GetLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogListResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogListResponseBody setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
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

    public GetLogListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetLogListResponseBody setResults(java.util.List<GetLogListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetLogListResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetLogListResponseBodyResults extends TeaModel {
        @NameInMap("ClientPort")
        public Integer clientPort;

        @NameInMap("ExecCostUS")
        public Integer execCostUS;

        @NameInMap("AppClientIp")
        public String appClientIp;

        @NameInMap("SessionLogoutTime")
        public String sessionLogoutTime;

        @NameInMap("ClientOsUser")
        public String clientOsUser;

        @NameInMap("RuleId")
        public Integer ruleId;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("AppUsername")
        public String appUsername;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("RuleKeyId")
        public Integer ruleKeyId;

        @NameInMap("AffectRows")
        public Integer affectRows;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("SessionLoginTime")
        public String sessionLoginTime;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("ServerMac")
        public String serverMac;

        @NameInMap("DbServer")
        public String dbServer;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SqlContent")
        public String sqlContent;

        @NameInMap("ResponseCode")
        public String responseCode;

        @NameInMap("InstName")
        public String instName;

        @NameInMap("ClientProgram")
        public String clientProgram;

        @NameInMap("CaptureTime")
        public String captureTime;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientMac")
        public String clientMac;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("FetchCostUS")
        public Integer fetchCostUS;

        @NameInMap("ResponseText")
        public String responseText;

        public static GetLogListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetLogListResponseBodyResults self = new GetLogListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetLogListResponseBodyResults setClientPort(Integer clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Integer getClientPort() {
            return this.clientPort;
        }

        public GetLogListResponseBodyResults setExecCostUS(Integer execCostUS) {
            this.execCostUS = execCostUS;
            return this;
        }
        public Integer getExecCostUS() {
            return this.execCostUS;
        }

        public GetLogListResponseBodyResults setAppClientIp(String appClientIp) {
            this.appClientIp = appClientIp;
            return this;
        }
        public String getAppClientIp() {
            return this.appClientIp;
        }

        public GetLogListResponseBodyResults setSessionLogoutTime(String sessionLogoutTime) {
            this.sessionLogoutTime = sessionLogoutTime;
            return this;
        }
        public String getSessionLogoutTime() {
            return this.sessionLogoutTime;
        }

        public GetLogListResponseBodyResults setClientOsUser(String clientOsUser) {
            this.clientOsUser = clientOsUser;
            return this;
        }
        public String getClientOsUser() {
            return this.clientOsUser;
        }

        public GetLogListResponseBodyResults setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public GetLogListResponseBodyResults setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetLogListResponseBodyResults setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetLogListResponseBodyResults setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetLogListResponseBodyResults setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetLogListResponseBodyResults setAppUsername(String appUsername) {
            this.appUsername = appUsername;
            return this;
        }
        public String getAppUsername() {
            return this.appUsername;
        }

        public GetLogListResponseBodyResults setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetLogListResponseBodyResults setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetLogListResponseBodyResults setRuleKeyId(Integer ruleKeyId) {
            this.ruleKeyId = ruleKeyId;
            return this;
        }
        public Integer getRuleKeyId() {
            return this.ruleKeyId;
        }

        public GetLogListResponseBodyResults setAffectRows(Integer affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Integer getAffectRows() {
            return this.affectRows;
        }

        public GetLogListResponseBodyResults setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetLogListResponseBodyResults setSessionLoginTime(String sessionLoginTime) {
            this.sessionLoginTime = sessionLoginTime;
            return this;
        }
        public String getSessionLoginTime() {
            return this.sessionLoginTime;
        }

        public GetLogListResponseBodyResults setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetLogListResponseBodyResults setServerMac(String serverMac) {
            this.serverMac = serverMac;
            return this;
        }
        public String getServerMac() {
            return this.serverMac;
        }

        public GetLogListResponseBodyResults setDbServer(String dbServer) {
            this.dbServer = dbServer;
            return this;
        }
        public String getDbServer() {
            return this.dbServer;
        }

        public GetLogListResponseBodyResults setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetLogListResponseBodyResults setSqlContent(String sqlContent) {
            this.sqlContent = sqlContent;
            return this;
        }
        public String getSqlContent() {
            return this.sqlContent;
        }

        public GetLogListResponseBodyResults setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public GetLogListResponseBodyResults setInstName(String instName) {
            this.instName = instName;
            return this;
        }
        public String getInstName() {
            return this.instName;
        }

        public GetLogListResponseBodyResults setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
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

        public GetLogListResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLogListResponseBodyResults setFetchCostUS(Integer fetchCostUS) {
            this.fetchCostUS = fetchCostUS;
            return this;
        }
        public Integer getFetchCostUS() {
            return this.fetchCostUS;
        }

        public GetLogListResponseBodyResults setResponseText(String responseText) {
            this.responseText = responseText;
            return this;
        }
        public String getResponseText() {
            return this.responseText;
        }

    }

}
