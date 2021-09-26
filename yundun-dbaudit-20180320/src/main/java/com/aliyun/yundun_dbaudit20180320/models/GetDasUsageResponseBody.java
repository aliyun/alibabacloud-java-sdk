// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetDasUsageResponseBody extends TeaModel {
    @NameInMap("Over1sSqlCount")
    public Long over1sSqlCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionTotalCount")
    public Long sessionTotalCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("SqlTotalCount")
    public Long sqlTotalCount;

    @NameInMap("AuditAsset")
    public GetDasUsageResponseBodyAuditAsset auditAsset;

    @NameInMap("ConsoleAccess")
    public GetDasUsageResponseBodyConsoleAccess consoleAccess;

    @NameInMap("Agent")
    public GetDasUsageResponseBodyAgent agent;

    @NameInMap("NoticeState")
    public GetDasUsageResponseBodyNoticeState noticeState;

    @NameInMap("RiskAsset")
    public GetDasUsageResponseBodyRiskAsset riskAsset;

    @NameInMap("RiskRule")
    public GetDasUsageResponseBodyRiskRule riskRule;

    @NameInMap("WpAsset")
    public GetDasUsageResponseBodyWpAsset wpAsset;

    public static GetDasUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDasUsageResponseBody self = new GetDasUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDasUsageResponseBody setOver1sSqlCount(Long over1sSqlCount) {
        this.over1sSqlCount = over1sSqlCount;
        return this;
    }
    public Long getOver1sSqlCount() {
        return this.over1sSqlCount;
    }

    public GetDasUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDasUsageResponseBody setSessionTotalCount(Long sessionTotalCount) {
        this.sessionTotalCount = sessionTotalCount;
        return this;
    }
    public Long getSessionTotalCount() {
        return this.sessionTotalCount;
    }

    public GetDasUsageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDasUsageResponseBody setSqlTotalCount(Long sqlTotalCount) {
        this.sqlTotalCount = sqlTotalCount;
        return this;
    }
    public Long getSqlTotalCount() {
        return this.sqlTotalCount;
    }

    public GetDasUsageResponseBody setAuditAsset(GetDasUsageResponseBodyAuditAsset auditAsset) {
        this.auditAsset = auditAsset;
        return this;
    }
    public GetDasUsageResponseBodyAuditAsset getAuditAsset() {
        return this.auditAsset;
    }

    public GetDasUsageResponseBody setConsoleAccess(GetDasUsageResponseBodyConsoleAccess consoleAccess) {
        this.consoleAccess = consoleAccess;
        return this;
    }
    public GetDasUsageResponseBodyConsoleAccess getConsoleAccess() {
        return this.consoleAccess;
    }

    public GetDasUsageResponseBody setAgent(GetDasUsageResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public GetDasUsageResponseBodyAgent getAgent() {
        return this.agent;
    }

    public GetDasUsageResponseBody setNoticeState(GetDasUsageResponseBodyNoticeState noticeState) {
        this.noticeState = noticeState;
        return this;
    }
    public GetDasUsageResponseBodyNoticeState getNoticeState() {
        return this.noticeState;
    }

    public GetDasUsageResponseBody setRiskAsset(GetDasUsageResponseBodyRiskAsset riskAsset) {
        this.riskAsset = riskAsset;
        return this;
    }
    public GetDasUsageResponseBodyRiskAsset getRiskAsset() {
        return this.riskAsset;
    }

    public GetDasUsageResponseBody setRiskRule(GetDasUsageResponseBodyRiskRule riskRule) {
        this.riskRule = riskRule;
        return this;
    }
    public GetDasUsageResponseBodyRiskRule getRiskRule() {
        return this.riskRule;
    }

    public GetDasUsageResponseBody setWpAsset(GetDasUsageResponseBodyWpAsset wpAsset) {
        this.wpAsset = wpAsset;
        return this;
    }
    public GetDasUsageResponseBodyWpAsset getWpAsset() {
        return this.wpAsset;
    }

    public static class GetDasUsageResponseBodyAuditAssetDbTypes extends TeaModel {
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DbCount")
        public Integer dbCount;

        public static GetDasUsageResponseBodyAuditAssetDbTypes build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyAuditAssetDbTypes self = new GetDasUsageResponseBodyAuditAssetDbTypes();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyAuditAssetDbTypes setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDasUsageResponseBodyAuditAssetDbTypes setDbCount(Integer dbCount) {
            this.dbCount = dbCount;
            return this;
        }
        public Integer getDbCount() {
            return this.dbCount;
        }

    }

    public static class GetDasUsageResponseBodyAuditAsset extends TeaModel {
        @NameInMap("DbCount")
        public Integer dbCount;

        @NameInMap("DbTypes")
        public java.util.List<GetDasUsageResponseBodyAuditAssetDbTypes> dbTypes;

        public static GetDasUsageResponseBodyAuditAsset build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyAuditAsset self = new GetDasUsageResponseBodyAuditAsset();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyAuditAsset setDbCount(Integer dbCount) {
            this.dbCount = dbCount;
            return this;
        }
        public Integer getDbCount() {
            return this.dbCount;
        }

        public GetDasUsageResponseBodyAuditAsset setDbTypes(java.util.List<GetDasUsageResponseBodyAuditAssetDbTypes> dbTypes) {
            this.dbTypes = dbTypes;
            return this;
        }
        public java.util.List<GetDasUsageResponseBodyAuditAssetDbTypes> getDbTypes() {
            return this.dbTypes;
        }

    }

    public static class GetDasUsageResponseBodyConsoleAccess extends TeaModel {
        @NameInMap("LastAccessTime")
        public String lastAccessTime;

        @NameInMap("Day90AccessCount")
        public Integer day90AccessCount;

        @NameInMap("Day15AccessCount")
        public Integer day15AccessCount;

        @NameInMap("Day30AccessCount")
        public Integer day30AccessCount;

        @NameInMap("Day180AccessCount")
        public Integer day180AccessCount;

        public static GetDasUsageResponseBodyConsoleAccess build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyConsoleAccess self = new GetDasUsageResponseBodyConsoleAccess();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyConsoleAccess setLastAccessTime(String lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetDasUsageResponseBodyConsoleAccess setDay90AccessCount(Integer day90AccessCount) {
            this.day90AccessCount = day90AccessCount;
            return this;
        }
        public Integer getDay90AccessCount() {
            return this.day90AccessCount;
        }

        public GetDasUsageResponseBodyConsoleAccess setDay15AccessCount(Integer day15AccessCount) {
            this.day15AccessCount = day15AccessCount;
            return this;
        }
        public Integer getDay15AccessCount() {
            return this.day15AccessCount;
        }

        public GetDasUsageResponseBodyConsoleAccess setDay30AccessCount(Integer day30AccessCount) {
            this.day30AccessCount = day30AccessCount;
            return this;
        }
        public Integer getDay30AccessCount() {
            return this.day30AccessCount;
        }

        public GetDasUsageResponseBodyConsoleAccess setDay180AccessCount(Integer day180AccessCount) {
            this.day180AccessCount = day180AccessCount;
            return this;
        }
        public Integer getDay180AccessCount() {
            return this.day180AccessCount;
        }

    }

    public static class GetDasUsageResponseBodyAgent extends TeaModel {
        @NameInMap("HasFlow")
        public Boolean hasFlow;

        @NameInMap("InstState")
        public String instState;

        @NameInMap("ActiveCount")
        public Integer activeCount;

        public static GetDasUsageResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyAgent self = new GetDasUsageResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyAgent setHasFlow(Boolean hasFlow) {
            this.hasFlow = hasFlow;
            return this;
        }
        public Boolean getHasFlow() {
            return this.hasFlow;
        }

        public GetDasUsageResponseBodyAgent setInstState(String instState) {
            this.instState = instState;
            return this;
        }
        public String getInstState() {
            return this.instState;
        }

        public GetDasUsageResponseBodyAgent setActiveCount(Integer activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Integer getActiveCount() {
            return this.activeCount;
        }

    }

    public static class GetDasUsageResponseBodyNoticeState extends TeaModel {
        @NameInMap("RiskNotice")
        public Boolean riskNotice;

        @NameInMap("SysNotice")
        public Boolean sysNotice;

        public static GetDasUsageResponseBodyNoticeState build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyNoticeState self = new GetDasUsageResponseBodyNoticeState();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyNoticeState setRiskNotice(Boolean riskNotice) {
            this.riskNotice = riskNotice;
            return this;
        }
        public Boolean getRiskNotice() {
            return this.riskNotice;
        }

        public GetDasUsageResponseBodyNoticeState setSysNotice(Boolean sysNotice) {
            this.sysNotice = sysNotice;
            return this;
        }
        public Boolean getSysNotice() {
            return this.sysNotice;
        }

    }

    public static class GetDasUsageResponseBodyRiskAsset extends TeaModel {
        @NameInMap("RiskDBCount")
        public Integer riskDBCount;

        @NameInMap("Day30RiskDBCount")
        public Integer day30RiskDBCount;

        public static GetDasUsageResponseBodyRiskAsset build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyRiskAsset self = new GetDasUsageResponseBodyRiskAsset();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyRiskAsset setRiskDBCount(Integer riskDBCount) {
            this.riskDBCount = riskDBCount;
            return this;
        }
        public Integer getRiskDBCount() {
            return this.riskDBCount;
        }

        public GetDasUsageResponseBodyRiskAsset setDay30RiskDBCount(Integer day30RiskDBCount) {
            this.day30RiskDBCount = day30RiskDBCount;
            return this;
        }
        public Integer getDay30RiskDBCount() {
            return this.day30RiskDBCount;
        }

    }

    public static class GetDasUsageResponseBodyRiskRuleMaxHitRule extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetDasUsageResponseBodyRiskRuleMaxHitRule build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyRiskRuleMaxHitRule self = new GetDasUsageResponseBodyRiskRuleMaxHitRule();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyRiskRuleMaxHitRule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetDasUsageResponseBodyRiskRuleMaxHitRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetDasUsageResponseBodyRiskRuleDay30MaxHitRule extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetDasUsageResponseBodyRiskRuleDay30MaxHitRule build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyRiskRuleDay30MaxHitRule self = new GetDasUsageResponseBodyRiskRuleDay30MaxHitRule();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyRiskRuleDay30MaxHitRule setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetDasUsageResponseBodyRiskRuleDay30MaxHitRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetDasUsageResponseBodyRiskRule extends TeaModel {
        @NameInMap("Day30RiskCount")
        public Long day30RiskCount;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("MaxHitRule")
        public GetDasUsageResponseBodyRiskRuleMaxHitRule maxHitRule;

        @NameInMap("Day30MaxHitRule")
        public GetDasUsageResponseBodyRiskRuleDay30MaxHitRule day30MaxHitRule;

        public static GetDasUsageResponseBodyRiskRule build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyRiskRule self = new GetDasUsageResponseBodyRiskRule();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyRiskRule setDay30RiskCount(Long day30RiskCount) {
            this.day30RiskCount = day30RiskCount;
            return this;
        }
        public Long getDay30RiskCount() {
            return this.day30RiskCount;
        }

        public GetDasUsageResponseBodyRiskRule setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetDasUsageResponseBodyRiskRule setMaxHitRule(GetDasUsageResponseBodyRiskRuleMaxHitRule maxHitRule) {
            this.maxHitRule = maxHitRule;
            return this;
        }
        public GetDasUsageResponseBodyRiskRuleMaxHitRule getMaxHitRule() {
            return this.maxHitRule;
        }

        public GetDasUsageResponseBodyRiskRule setDay30MaxHitRule(GetDasUsageResponseBodyRiskRuleDay30MaxHitRule day30MaxHitRule) {
            this.day30MaxHitRule = day30MaxHitRule;
            return this;
        }
        public GetDasUsageResponseBodyRiskRuleDay30MaxHitRule getDay30MaxHitRule() {
            return this.day30MaxHitRule;
        }

    }

    public static class GetDasUsageResponseBodyWpAsset extends TeaModel {
        @NameInMap("AvgTime")
        public Long avgTime;

        @NameInMap("DbName")
        public String dbName;

        public static GetDasUsageResponseBodyWpAsset build(java.util.Map<String, ?> map) throws Exception {
            GetDasUsageResponseBodyWpAsset self = new GetDasUsageResponseBodyWpAsset();
            return TeaModel.build(map, self);
        }

        public GetDasUsageResponseBodyWpAsset setAvgTime(Long avgTime) {
            this.avgTime = avgTime;
            return this;
        }
        public Long getAvgTime() {
            return this.avgTime;
        }

        public GetDasUsageResponseBodyWpAsset setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

    }

}
