// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAntiBruteForceRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeAntiBruteForceRulesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("DefaultRule")
        public Boolean defaultRule;

        @NameInMap("EnableSmartRule")
        public Boolean enableSmartRule;

        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("ForbiddenTime")
        public Integer forbiddenTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MachineCount")
        public Integer machineCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("Span")
        public Integer span;

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
