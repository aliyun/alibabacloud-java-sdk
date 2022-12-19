// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceAntiBruteForceRulesResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the servers to which the defense rule is applied.
    @NameInMap("Rules")
    public java.util.List<DescribeInstanceAntiBruteForceRulesResponseBodyRules> rules;

    public static DescribeInstanceAntiBruteForceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAntiBruteForceRulesResponseBody self = new DescribeInstanceAntiBruteForceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAntiBruteForceRulesResponseBody setPageInfo(DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeInstanceAntiBruteForceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAntiBruteForceRulesResponseBody setRules(java.util.List<DescribeInstanceAntiBruteForceRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeInstanceAntiBruteForceRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo extends TeaModel {
        // The number of servers to which the defense rule is applied on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of servers to which the defense rule is applied.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo self = new DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeInstanceAntiBruteForceRulesResponseBodyRules extends TeaModel {
        // The ID of the defense rule.
        @NameInMap("Id")
        public Long id;

        // The name of the defense rule.
        @NameInMap("Name")
        public String name;

        // The UUID of the server to which the defense rule is applied.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeInstanceAntiBruteForceRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAntiBruteForceRulesResponseBodyRules self = new DescribeInstanceAntiBruteForceRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceAntiBruteForceRulesResponseBodyRules setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
