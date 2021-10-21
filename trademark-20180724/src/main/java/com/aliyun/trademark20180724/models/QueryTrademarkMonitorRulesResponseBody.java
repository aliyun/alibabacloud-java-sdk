// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorRulesResponseBody extends TeaModel {
    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Data")
    public QueryTrademarkMonitorRulesResponseBodyData data;

    public static QueryTrademarkMonitorRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorRulesResponseBody self = new QueryTrademarkMonitorRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorRulesResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTrademarkMonitorRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkMonitorRulesResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTrademarkMonitorRulesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTrademarkMonitorRulesResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTrademarkMonitorRulesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryTrademarkMonitorRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkMonitorRulesResponseBody setData(QueryTrademarkMonitorRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTrademarkMonitorRulesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule extends TeaModel {
        @NameInMap("RuleStatus")
        public String ruleStatus;

        @NameInMap("LastFinishTime")
        public String lastFinishTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RuleExtend")
        public String ruleExtend;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("RuleKeyword")
        public String ruleKeyword;

        @NameInMap("LastRunTime")
        public String lastRunTime;

        @NameInMap("Version")
        public Integer version;

        @NameInMap("RuleSource")
        public String ruleSource;

        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("Env")
        public String env;

        @NameInMap("NotifyUpdate")
        public Integer notifyUpdate;

        @NameInMap("RuleDetail")
        public String ruleDetail;

        @NameInMap("Id")
        public String id;

        public static QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule self = new QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastFinishTime(String lastFinishTime) {
            this.lastFinishTime = lastFinishTime;
            return this;
        }
        public String getLastFinishTime() {
            return this.lastFinishTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleExtend(String ruleExtend) {
            this.ruleExtend = ruleExtend;
            return this;
        }
        public String getRuleExtend() {
            return this.ruleExtend;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleKeyword(String ruleKeyword) {
            this.ruleKeyword = ruleKeyword;
            return this;
        }
        public String getRuleKeyword() {
            return this.ruleKeyword;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastRunTime(String lastRunTime) {
            this.lastRunTime = lastRunTime;
            return this;
        }
        public String getLastRunTime() {
            return this.lastRunTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setRuleSource(String ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public String getRuleSource() {
            return this.ruleSource;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
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

        public QueryTrademarkMonitorRulesResponseBodyDataTmMonitorRule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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
