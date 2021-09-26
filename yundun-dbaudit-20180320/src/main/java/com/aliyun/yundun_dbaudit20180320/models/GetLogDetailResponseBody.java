// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogDetailResponseBody extends TeaModel {
    @NameInMap("ClientPort")
    public Integer clientPort;

    @NameInMap("AppClientIp")
    public String appClientIp;

    @NameInMap("ExecCostUS")
    public Integer execCostUS;

    @NameInMap("SessionLogoutTime")
    public String sessionLogoutTime;

    @NameInMap("ClientOsUser")
    public String clientOsUser;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("AppUsername")
    public String appUsername;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("RuleKeyId")
    public Integer ruleKeyId;

    @NameInMap("SqlResult")
    public String sqlResult;

    @NameInMap("AffectRows")
    public Integer affectRows;

    @NameInMap("SqlTypeName")
    public String sqlTypeName;

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

    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("SqlContent")
    public String sqlContent;

    @NameInMap("InstName")
    public String instName;

    @NameInMap("TemplateContent")
    public String templateContent;

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

    @NameInMap("ResponseText")
    public String responseText;

    @NameInMap("FetchCostUS")
    public Integer fetchCostUS;

    @NameInMap("TemplateRules")
    public java.util.List<String> templateRules;

    public static GetLogDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogDetailResponseBody self = new GetLogDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogDetailResponseBody setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public Integer getClientPort() {
        return this.clientPort;
    }

    public GetLogDetailResponseBody setAppClientIp(String appClientIp) {
        this.appClientIp = appClientIp;
        return this;
    }
    public String getAppClientIp() {
        return this.appClientIp;
    }

    public GetLogDetailResponseBody setExecCostUS(Integer execCostUS) {
        this.execCostUS = execCostUS;
        return this;
    }
    public Integer getExecCostUS() {
        return this.execCostUS;
    }

    public GetLogDetailResponseBody setSessionLogoutTime(String sessionLogoutTime) {
        this.sessionLogoutTime = sessionLogoutTime;
        return this;
    }
    public String getSessionLogoutTime() {
        return this.sessionLogoutTime;
    }

    public GetLogDetailResponseBody setClientOsUser(String clientOsUser) {
        this.clientOsUser = clientOsUser;
        return this;
    }
    public String getClientOsUser() {
        return this.clientOsUser;
    }

    public GetLogDetailResponseBody setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public GetLogDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogDetailResponseBody setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetLogDetailResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLogDetailResponseBody setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public GetLogDetailResponseBody setAppUsername(String appUsername) {
        this.appUsername = appUsername;
        return this;
    }
    public String getAppUsername() {
        return this.appUsername;
    }

    public GetLogDetailResponseBody setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public GetLogDetailResponseBody setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogDetailResponseBody setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public GetLogDetailResponseBody setRuleKeyId(Integer ruleKeyId) {
        this.ruleKeyId = ruleKeyId;
        return this;
    }
    public Integer getRuleKeyId() {
        return this.ruleKeyId;
    }

    public GetLogDetailResponseBody setSqlResult(String sqlResult) {
        this.sqlResult = sqlResult;
        return this;
    }
    public String getSqlResult() {
        return this.sqlResult;
    }

    public GetLogDetailResponseBody setAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
        return this;
    }
    public Integer getAffectRows() {
        return this.affectRows;
    }

    public GetLogDetailResponseBody setSqlTypeName(String sqlTypeName) {
        this.sqlTypeName = sqlTypeName;
        return this;
    }
    public String getSqlTypeName() {
        return this.sqlTypeName;
    }

    public GetLogDetailResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public GetLogDetailResponseBody setSessionLoginTime(String sessionLoginTime) {
        this.sessionLoginTime = sessionLoginTime;
        return this;
    }
    public String getSessionLoginTime() {
        return this.sessionLoginTime;
    }

    public GetLogDetailResponseBody setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }
    public String getDbUser() {
        return this.dbUser;
    }

    public GetLogDetailResponseBody setServerMac(String serverMac) {
        this.serverMac = serverMac;
        return this;
    }
    public String getServerMac() {
        return this.serverMac;
    }

    public GetLogDetailResponseBody setDbServer(String dbServer) {
        this.dbServer = dbServer;
        return this;
    }
    public String getDbServer() {
        return this.dbServer;
    }

    public GetLogDetailResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetLogDetailResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public GetLogDetailResponseBody setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
        return this;
    }
    public String getSqlContent() {
        return this.sqlContent;
    }

    public GetLogDetailResponseBody setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

    public GetLogDetailResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public GetLogDetailResponseBody setClientProgram(String clientProgram) {
        this.clientProgram = clientProgram;
        return this;
    }
    public String getClientProgram() {
        return this.clientProgram;
    }

    public GetLogDetailResponseBody setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }
    public String getCaptureTime() {
        return this.captureTime;
    }

    public GetLogDetailResponseBody setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GetLogDetailResponseBody setClientMac(String clientMac) {
        this.clientMac = clientMac;
        return this;
    }
    public String getClientMac() {
        return this.clientMac;
    }

    public GetLogDetailResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLogDetailResponseBody setResponseText(String responseText) {
        this.responseText = responseText;
        return this;
    }
    public String getResponseText() {
        return this.responseText;
    }

    public GetLogDetailResponseBody setFetchCostUS(Integer fetchCostUS) {
        this.fetchCostUS = fetchCostUS;
        return this;
    }
    public Integer getFetchCostUS() {
        return this.fetchCostUS;
    }

    public GetLogDetailResponseBody setTemplateRules(java.util.List<String> templateRules) {
        this.templateRules = templateRules;
        return this;
    }
    public java.util.List<String> getTemplateRules() {
        return this.templateRules;
    }

}
