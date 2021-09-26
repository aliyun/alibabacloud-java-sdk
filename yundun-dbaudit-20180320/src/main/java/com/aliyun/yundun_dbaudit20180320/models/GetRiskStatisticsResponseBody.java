// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeList")
    public java.util.List<GetRiskStatisticsResponseBodyTimeList> timeList;

    public static GetRiskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatisticsResponseBody self = new GetRiskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskStatisticsResponseBody setTimeList(java.util.List<GetRiskStatisticsResponseBodyTimeList> timeList) {
        this.timeList = timeList;
        return this;
    }
    public java.util.List<GetRiskStatisticsResponseBodyTimeList> getTimeList() {
        return this.timeList;
    }

    public static class GetRiskStatisticsResponseBodyTimeList extends TeaModel {
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("LastCaptureTime")
        public String lastCaptureTime;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static GetRiskStatisticsResponseBodyTimeList build(java.util.Map<String, ?> map) throws Exception {
            GetRiskStatisticsResponseBodyTimeList self = new GetRiskStatisticsResponseBodyTimeList();
            return TeaModel.build(map, self);
        }

        public GetRiskStatisticsResponseBodyTimeList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetRiskStatisticsResponseBodyTimeList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetRiskStatisticsResponseBodyTimeList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetRiskStatisticsResponseBodyTimeList setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public GetRiskStatisticsResponseBodyTimeList setLastCaptureTime(String lastCaptureTime) {
            this.lastCaptureTime = lastCaptureTime;
            return this;
        }
        public String getLastCaptureTime() {
            return this.lastCaptureTime;
        }

        public GetRiskStatisticsResponseBodyTimeList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetRiskStatisticsResponseBodyTimeList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetRiskStatisticsResponseBodyTimeList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
