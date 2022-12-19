// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAntiBruteForceRulesResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeAntiBruteForceRulesResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the defense rules returned.
    @NameInMap("Rules")
    public java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> rules;

    public static DescribeAntiBruteForceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntiBruteForceRulesResponseBody self = new DescribeAntiBruteForceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntiBruteForceRulesResponseBody setPageInfo(DescribeAntiBruteForceRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAntiBruteForceRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAntiBruteForceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntiBruteForceRulesResponseBody setRules(java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeAntiBruteForceRulesResponseBodyPageInfo extends TeaModel {
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntiBruteForceRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntiBruteForceRulesResponseBodyPageInfo self = new DescribeAntiBruteForceRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntiBruteForceRulesResponseBodyRules extends TeaModel {
        // Indicates whether the defense rule is the default rule. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        // 
        // >  The default rule takes effect on all servers that are not protected by defense rules against brute-force attacks.
        @NameInMap("DefaultRule")
        public Boolean defaultRule;

        // This parameter is deprecated.
        @NameInMap("EnableSmartRule")
        public Boolean enableSmartRule;

        // The threshold of logon failures that you specify.
        @NameInMap("FailCount")
        public Integer failCount;

        // The period of time during which logons from an account are not allowed. Unit: minutes.
        @NameInMap("ForbiddenTime")
        public Integer forbiddenTime;

        // The ID of the defense rule.
        @NameInMap("Id")
        public Long id;

        // The number of servers to which the defense rule is applied.
        @NameInMap("MachineCount")
        public Integer machineCount;

        // The name of the defense rule.
        @NameInMap("Name")
        public String name;

        // The period of time during which logon failures from an account are measured. Unit: minutes. If **Span** is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
        @NameInMap("Span")
        public Integer span;

        // An array consisting of the UUIDs of servers to which the defense rule is applied.
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static DescribeAntiBruteForceRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntiBruteForceRulesResponseBodyRules self = new DescribeAntiBruteForceRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setDefaultRule(Boolean defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public Boolean getDefaultRule() {
            return this.defaultRule;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setEnableSmartRule(Boolean enableSmartRule) {
            this.enableSmartRule = enableSmartRule;
            return this;
        }
        public Boolean getEnableSmartRule() {
            return this.enableSmartRule;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setForbiddenTime(Integer forbiddenTime) {
            this.forbiddenTime = forbiddenTime;
            return this;
        }
        public Integer getForbiddenTime() {
            return this.forbiddenTime;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setSpan(Integer span) {
            this.span = span;
            return this;
        }
        public Integer getSpan() {
            return this.span;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
