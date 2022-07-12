// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorRulesResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTrademarkMonitorRulesResponseBodyData data;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTrademarkMonitorRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorRulesResponseBody self = new QueryTrademarkMonitorRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorRulesResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTrademarkMonitorRulesResponseBody setData(QueryTrademarkMonitorRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTrademarkMonitorRulesResponseBodyData getData() {
        return this.data;
    }

    public QueryTrademarkMonitorRulesResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTrademarkMonitorRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkMonitorRulesResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTrademarkMonitorRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkMonitorRulesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTrademarkMonitorRulesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Env")
        public String env;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastFinishTime")
        public String lastFinishTime;

        @NameInMap("LastRunTime")
        public String lastRunTime;

        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("NotifyUpdate")
        public Integer notifyUpdate;

        @NameInMap("RuleDetail")
        public String ruleDetail;

        @NameInMap("RuleExtend")
        public String ruleExtend;

        @NameInMap("RuleKeyword")
        public String ruleKeyword;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleSource")
        public String ruleSource;

        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Version")
        public Integer version;

        public static QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule self = new QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastFinishTime(String lastFinishTime) {
            this.lastFinishTime = lastFinishTime;
            return this;
        }
        public String getLastFinishTime() {
            return this.lastFinishTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastRunTime(String lastRunTime) {
            this.lastRunTime = lastRunTime;
            return this;
        }
        public String getLastRunTime() {
            return this.lastRunTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setNotifyUpdate(Integer notifyUpdate) {
            this.notifyUpdate = notifyUpdate;
            return this;
        }
        public Integer getNotifyUpdate() {
            return this.notifyUpdate;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleDetail(String ruleDetail) {
            this.ruleDetail = ruleDetail;
            return this;
        }
        public String getRuleDetail() {
            return this.ruleDetail;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleExtend(String ruleExtend) {
            this.ruleExtend = ruleExtend;
            return this;
        }
        public String getRuleExtend() {
            return this.ruleExtend;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleKeyword(String ruleKeyword) {
            this.ruleKeyword = ruleKeyword;
            return this;
        }
        public String getRuleKeyword() {
            return this.ruleKeyword;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleSource(String ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public String getRuleSource() {
            return this.ruleSource;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class QueryTrademarkMonitorRulesResponseBodyData extends TeaModel {
        @NameInMap("TmMonitorRule")
        public java.util.List<QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule> tmMonitorRule;

        public static QueryTrademarkMonitorRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkMonitorRulesResponseBodyData self = new QueryTrademarkMonitorRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkMonitorRulesResponseBodyData setTmMonitorRule(java.util.List<QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule> tmMonitorRule) {
            this.tmMonitorRule = tmMonitorRule;
            return this;
        }
        public java.util.List<QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule> getTmMonitorRule() {
            return this.tmMonitorRule;
        }

    }

}
