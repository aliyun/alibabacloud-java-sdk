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
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>97286A-4A6B-4A4-95FA-EC7E3E2451</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of servers on which brute-force attacks defense rules take effect.</p>
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
         * <p>The number of servers on which brute-force attacks defense rules take effect on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries per page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of servers on which brute-force attacks defense rules take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The ID of the brute-force attacks defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>215779601</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the brute-force attacks defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TestRule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The UUID of the server on which the brute-force attacks defense rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
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
