// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSqlTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Results")
    public java.util.List<GetSqlTemplateListResponseBodyResults> results;

    public static GetSqlTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTemplateListResponseBody self = new GetSqlTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlTemplateListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetSqlTemplateListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSqlTemplateListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetSqlTemplateListResponseBody setResults(java.util.List<GetSqlTemplateListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetSqlTemplateListResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetSqlTemplateListResponseBodyResultsRuleList extends TeaModel {
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("RuleState")
        public Integer ruleState;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static GetSqlTemplateListResponseBodyResultsRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSqlTemplateListResponseBodyResultsRuleList self = new GetSqlTemplateListResponseBodyResultsRuleList();
            return TeaModel.build(map, self);
        }

        public GetSqlTemplateListResponseBodyResultsRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetSqlTemplateListResponseBodyResultsRuleList setRuleState(Integer ruleState) {
            this.ruleState = ruleState;
            return this;
        }
        public Integer getRuleState() {
            return this.ruleState;
        }

        public GetSqlTemplateListResponseBodyResultsRuleList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetSqlTemplateListResponseBodyResultsRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSqlTemplateListResponseBodyResultsRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetSqlTemplateListResponseBodyResults extends TeaModel {
        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("LastCaptureTime")
        public String lastCaptureTime;

        @NameInMap("CaptureCount")
        public Long captureCount;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("SqlType")
        public Integer sqlType;

        @NameInMap("RuleList")
        public java.util.List<GetSqlTemplateListResponseBodyResultsRuleList> ruleList;

        public static GetSqlTemplateListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetSqlTemplateListResponseBodyResults self = new GetSqlTemplateListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetSqlTemplateListResponseBodyResults setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public GetSqlTemplateListResponseBodyResults setLastCaptureTime(String lastCaptureTime) {
            this.lastCaptureTime = lastCaptureTime;
            return this;
        }
        public String getLastCaptureTime() {
            return this.lastCaptureTime;
        }

        public GetSqlTemplateListResponseBodyResults setCaptureCount(Long captureCount) {
            this.captureCount = captureCount;
            return this;
        }
        public Long getCaptureCount() {
            return this.captureCount;
        }

        public GetSqlTemplateListResponseBodyResults setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetSqlTemplateListResponseBodyResults setSqlType(Integer sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public Integer getSqlType() {
            return this.sqlType;
        }

        public GetSqlTemplateListResponseBodyResults setRuleList(java.util.List<GetSqlTemplateListResponseBodyResultsRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<GetSqlTemplateListResponseBodyResultsRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
