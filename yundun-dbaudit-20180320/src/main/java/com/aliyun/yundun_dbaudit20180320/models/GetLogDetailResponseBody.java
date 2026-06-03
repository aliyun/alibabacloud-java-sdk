// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AffectRows")
    public Integer affectRows;

    /**
     * <strong>example:</strong>
     * <p>8.8.XX.XX</p>
     */
    @NameInMap("AppClientIp")
    public String appClientIp;

    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("AppUsername")
    public String appUsername;

    /**
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("CaptureTime")
    public String captureTime;

    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <strong>example:</strong>
     * <p>00163E06****</p>
     */
    @NameInMap("ClientMac")
    public String clientMac;

    /**
     * <strong>example:</strong>
     * <p>administrator</p>
     */
    @NameInMap("ClientOsUser")
    public String clientOsUser;

    /**
     * <strong>example:</strong>
     * <p>15629</p>
     */
    @NameInMap("ClientPort")
    public Integer clientPort;

    /**
     * <strong>example:</strong>
     * <p>navicat</p>
     */
    @NameInMap("ClientProgram")
    public String clientProgram;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX:3306</p>
     */
    @NameInMap("DbServer")
    public String dbServer;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DbUser")
    public String dbUser;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ExecCostUS")
    public Integer execCostUS;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FetchCostUS")
    public Integer fetchCostUS;

    /**
     * <strong>example:</strong>
     * <p>orcl</p>
     */
    @NameInMap("InstName")
    public String instName;

    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <strong>example:</strong>
     * <p>Table \&quot;your_table\&quot; doesn\&quot;t exist</p>
     */
    @NameInMap("ResponseText")
    public String responseText;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RiskLevel")
    public Integer riskLevel;

    /**
     * <strong>example:</strong>
     * <p>50****</p>
     */
    @NameInMap("RuleId")
    public Integer ruleId;

    /**
     * <strong>example:</strong>
     * <p>50****</p>
     */
    @NameInMap("RuleKeyId")
    public Integer ruleKeyId;

    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("Schema")
    public String schema;

    @NameInMap("SecondarySqlType")
    public String secondarySqlType;

    /**
     * <strong>example:</strong>
     * <p>00163E06****</p>
     */
    @NameInMap("ServerMac")
    public String serverMac;

    /**
     * <strong>example:</strong>
     * <p>3011610850021000000</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("SessionLoginTime")
    public String sessionLoginTime;

    /**
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("SessionLogoutTime")
    public String sessionLogoutTime;

    /**
     * <strong>example:</strong>
     * <p>select * from xxx where name=\&quot;zhangsan\&quot;</p>
     */
    @NameInMap("SqlContent")
    public String sqlContent;

    /**
     * <strong>example:</strong>
     * <p>1907181552270011186</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <strong>example:</strong>
     * <p>[[&quot;id&quot;,&quot;name&quot;,&quot;age&quot;],[&quot;1&quot;,&quot;zhangsan&quot;,&quot;20&quot;]]</p>
     */
    @NameInMap("SqlResult")
    public String sqlResult;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlTypeName")
    public String sqlTypeName;

    /**
     * <strong>example:</strong>
     * <p>SELECT * FROM XXX WHERE NAME=\&quot;#\&quot;</p>
     */
    @NameInMap("TemplateContent")
    public String templateContent;

    /**
     * <strong>example:</strong>
     * <p>1000****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateRules")
    public java.util.List<String> templateRules;

    public static GetLogDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogDetailResponseBody self = new GetLogDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogDetailResponseBody setAffectRows(Integer affectRows) {
        this.affectRows = affectRows;
        return this;
    }
    public Integer getAffectRows() {
        return this.affectRows;
    }

    public GetLogDetailResponseBody setAppClientIp(String appClientIp) {
        this.appClientIp = appClientIp;
        return this;
    }
    public String getAppClientIp() {
        return this.appClientIp;
    }

    public GetLogDetailResponseBody setAppUsername(String appUsername) {
        this.appUsername = appUsername;
        return this;
    }
    public String getAppUsername() {
        return this.appUsername;
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

    public GetLogDetailResponseBody setClientOsUser(String clientOsUser) {
        this.clientOsUser = clientOsUser;
        return this;
    }
    public String getClientOsUser() {
        return this.clientOsUser;
    }

    public GetLogDetailResponseBody setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public Integer getClientPort() {
        return this.clientPort;
    }

    public GetLogDetailResponseBody setClientProgram(String clientProgram) {
        this.clientProgram = clientProgram;
        return this;
    }
    public String getClientProgram() {
        return this.clientProgram;
    }

    public GetLogDetailResponseBody setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogDetailResponseBody setDbServer(String dbServer) {
        this.dbServer = dbServer;
        return this;
    }
    public String getDbServer() {
        return this.dbServer;
    }

    public GetLogDetailResponseBody setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }
    public String getDbUser() {
        return this.dbUser;
    }

    public GetLogDetailResponseBody setExecCostUS(Integer execCostUS) {
        this.execCostUS = execCostUS;
        return this;
    }
    public Integer getExecCostUS() {
        return this.execCostUS;
    }

    public GetLogDetailResponseBody setFetchCostUS(Integer fetchCostUS) {
        this.fetchCostUS = fetchCostUS;
        return this;
    }
    public Integer getFetchCostUS() {
        return this.fetchCostUS;
    }

    public GetLogDetailResponseBody setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

    public GetLogDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogDetailResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public GetLogDetailResponseBody setResponseText(String responseText) {
        this.responseText = responseText;
        return this;
    }
    public String getResponseText() {
        return this.responseText;
    }

    public GetLogDetailResponseBody setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public GetLogDetailResponseBody setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public GetLogDetailResponseBody setRuleKeyId(Integer ruleKeyId) {
        this.ruleKeyId = ruleKeyId;
        return this;
    }
    public Integer getRuleKeyId() {
        return this.ruleKeyId;
    }

    public GetLogDetailResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetLogDetailResponseBody setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public GetLogDetailResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public GetLogDetailResponseBody setSecondarySqlType(String secondarySqlType) {
        this.secondarySqlType = secondarySqlType;
        return this;
    }
    public String getSecondarySqlType() {
        return this.secondarySqlType;
    }

    public GetLogDetailResponseBody setServerMac(String serverMac) {
        this.serverMac = serverMac;
        return this;
    }
    public String getServerMac() {
        return this.serverMac;
    }

    public GetLogDetailResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLogDetailResponseBody setSessionLoginTime(String sessionLoginTime) {
        this.sessionLoginTime = sessionLoginTime;
        return this;
    }
    public String getSessionLoginTime() {
        return this.sessionLoginTime;
    }

    public GetLogDetailResponseBody setSessionLogoutTime(String sessionLogoutTime) {
        this.sessionLogoutTime = sessionLogoutTime;
        return this;
    }
    public String getSessionLogoutTime() {
        return this.sessionLogoutTime;
    }

    public GetLogDetailResponseBody setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
        return this;
    }
    public String getSqlContent() {
        return this.sqlContent;
    }

    public GetLogDetailResponseBody setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetLogDetailResponseBody setSqlResult(String sqlResult) {
        this.sqlResult = sqlResult;
        return this;
    }
    public String getSqlResult() {
        return this.sqlResult;
    }

    public GetLogDetailResponseBody setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public GetLogDetailResponseBody setSqlTypeName(String sqlTypeName) {
        this.sqlTypeName = sqlTypeName;
        return this;
    }
    public String getSqlTypeName() {
        return this.sqlTypeName;
    }

    public GetLogDetailResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public GetLogDetailResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLogDetailResponseBody setTemplateRules(java.util.List<String> templateRules) {
        this.templateRules = templateRules;
        return this;
    }
    public java.util.List<String> getTemplateRules() {
        return this.templateRules;
    }

}
