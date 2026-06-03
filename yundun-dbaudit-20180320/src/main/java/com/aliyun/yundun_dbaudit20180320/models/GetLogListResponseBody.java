// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("BeginDate")
    public String beginDate;

    /**
     * <strong>example:</strong>
     * <p>2019-06-06 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Incomplete")
    public String incomplete;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1B217656-2267-4FBF-B26C-CDD201BDC3B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<GetLogListResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
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

        @NameInMap("ClientIpAlias")
        public String clientIpAlias;

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
         * <p>1000</p>
         */
        @NameInMap("ExecCostUS")
        public Integer execCostUS;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
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
         * <p>0</p>
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
         * <p>select * from ****</p>
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
         * <p>8</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <strong>example:</strong>
         * <p>1000****</p>
         */
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

        public GetLogListResponseBodyResults setClientIpAlias(String clientIpAlias) {
            this.clientIpAlias = clientIpAlias;
            return this;
        }
        public String getClientIpAlias() {
            return this.clientIpAlias;
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
