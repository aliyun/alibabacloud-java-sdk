// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListContainerDefenseRuleResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListContainerDefenseRuleResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListContainerDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerDefenseRuleResponseBody self = new ListContainerDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerDefenseRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContainerDefenseRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContainerDefenseRuleResponseBody setList(java.util.List<ListContainerDefenseRuleResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListContainerDefenseRuleResponseBodyList> getList() {
        return this.list;
    }

    public ListContainerDefenseRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContainerDefenseRuleResponseBody setPageInfo(ListContainerDefenseRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListContainerDefenseRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListContainerDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerDefenseRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContainerDefenseRuleResponseBodyList extends TeaModel {
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("ClusterIdList")
        public String clusterIdList;

        @NameInMap("Description")
        public String description;

        @NameInMap("RuleAction")
        public Integer ruleAction;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        @NameInMap("RuleType")
        public Integer ruleType;

        public static ListContainerDefenseRuleResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerDefenseRuleResponseBodyList self = new ListContainerDefenseRuleResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListContainerDefenseRuleResponseBodyList setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public ListContainerDefenseRuleResponseBodyList setClusterIdList(String clusterIdList) {
            this.clusterIdList = clusterIdList;
            return this;
        }
        public String getClusterIdList() {
            return this.clusterIdList;
        }

        public ListContainerDefenseRuleResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListContainerDefenseRuleResponseBodyList setRuleAction(Integer ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        public ListContainerDefenseRuleResponseBodyList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListContainerDefenseRuleResponseBodyList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListContainerDefenseRuleResponseBodyList setRuleSwitch(Integer ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        public ListContainerDefenseRuleResponseBodyList setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

    }

    public static class ListContainerDefenseRuleResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("LastRowKey")
        public String lastRowKey;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListContainerDefenseRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListContainerDefenseRuleResponseBodyPageInfo self = new ListContainerDefenseRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setLastRowKey(String lastRowKey) {
            this.lastRowKey = lastRowKey;
            return this;
        }
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContainerDefenseRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
