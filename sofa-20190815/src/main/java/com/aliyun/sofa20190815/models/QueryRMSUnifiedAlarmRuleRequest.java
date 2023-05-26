// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmRuleRequest extends TeaModel {
    @NameInMap("AlarmStatus")
    public Long alarmStatus;

    @NameInMap("AlarmTargetJsonStr")
    public String alarmTargetJsonStr;

    @NameInMap("Category")
    public String category;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Level")
    public Long level;

    @NameInMap("OnlyMe")
    public Boolean onlyMe;

    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>datasource</p>
     */
    @NameInMap("RefDatasourceType")
    public String refDatasourceType;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleStatus")
    public Long ruleStatus;

    @NameInMap("RuleUniqueIdentity")
    public String ruleUniqueIdentity;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static QueryRMSUnifiedAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmRuleRequest self = new QueryRMSUnifiedAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmRuleRequest setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public QueryRMSUnifiedAlarmRuleRequest setAlarmTargetJsonStr(String alarmTargetJsonStr) {
        this.alarmTargetJsonStr = alarmTargetJsonStr;
        return this;
    }
    public String getAlarmTargetJsonStr() {
        return this.alarmTargetJsonStr;
    }

    public QueryRMSUnifiedAlarmRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryRMSUnifiedAlarmRuleRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRMSUnifiedAlarmRuleRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryRMSUnifiedAlarmRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryRMSUnifiedAlarmRuleRequest setOnlyMe(Boolean onlyMe) {
        this.onlyMe = onlyMe;
        return this;
    }
    public Boolean getOnlyMe() {
        return this.onlyMe;
    }

    public QueryRMSUnifiedAlarmRuleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRMSUnifiedAlarmRuleRequest setRefDatasourceType(String refDatasourceType) {
        this.refDatasourceType = refDatasourceType;
        return this;
    }
    public String getRefDatasourceType() {
        return this.refDatasourceType;
    }

    public QueryRMSUnifiedAlarmRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public QueryRMSUnifiedAlarmRuleRequest setRuleStatus(Long ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Long getRuleStatus() {
        return this.ruleStatus;
    }

    public QueryRMSUnifiedAlarmRuleRequest setRuleUniqueIdentity(String ruleUniqueIdentity) {
        this.ruleUniqueIdentity = ruleUniqueIdentity;
        return this;
    }
    public String getRuleUniqueIdentity() {
        return this.ruleUniqueIdentity;
    }

    public QueryRMSUnifiedAlarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
