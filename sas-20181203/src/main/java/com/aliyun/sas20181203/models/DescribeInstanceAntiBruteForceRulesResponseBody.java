// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceAntiBruteForceRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeInstanceAntiBruteForceRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the servers to which a defense rule is applied.</p>
     */
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
        /**
         * <p>The number of servers returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of servers returned.</p>
         */
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
        /**
         * <p>The ID of the defense rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the defense rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The UUID of the server to which the defense rule is applied.</p>
         */
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
