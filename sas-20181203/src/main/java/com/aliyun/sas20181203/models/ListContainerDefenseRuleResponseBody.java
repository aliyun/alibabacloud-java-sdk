// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The rules.</p>
     */
    @NameInMap("List")
    public java.util.List<ListContainerDefenseRuleResponseBodyList> list;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListContainerDefenseRuleResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The total number of clusters.</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        /**
         * <p>The clusters specified in the rule.</p>
         */
        @NameInMap("ClusterIdList")
        public String clusterIdList;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The action specified in the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: alert</p>
         * <p>*   **2**: block</p>
         */
        @NameInMap("RuleAction")
        public Integer ruleAction;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: system rule</p>
         * <p>*   **2**: custom rule</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The key of the last data entry.</p>
         */
        @NameInMap("LastRowKey")
        public String lastRowKey;

        /**
         * <p>The query credential.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
