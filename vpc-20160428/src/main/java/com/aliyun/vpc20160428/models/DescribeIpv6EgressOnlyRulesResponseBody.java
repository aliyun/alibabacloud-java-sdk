// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6EgressOnlyRulesResponseBody extends TeaModel {
    /**
     * <p>The details about the egress-only rules.</p>
     */
    @NameInMap("Ipv6EgressOnlyRules")
    public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules ipv6EgressOnlyRules;

    /**
     * <p>The number of the returned page. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpv6EgressOnlyRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6EgressOnlyRulesResponseBody self = new DescribeIpv6EgressOnlyRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6EgressOnlyRulesResponseBody setIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules ipv6EgressOnlyRules) {
        this.ipv6EgressOnlyRules = ipv6EgressOnlyRules;
        return this;
    }
    public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules getIpv6EgressOnlyRules() {
        return this.ipv6EgressOnlyRules;
    }

    public DescribeIpv6EgressOnlyRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6EgressOnlyRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6EgressOnlyRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6EgressOnlyRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule extends TeaModel {
        /**
         * <p>The description of the egress-only rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance to which the egress-only rule applies.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the instance to which the egress-only rule applies.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the egress-only rule.</p>
         */
        @NameInMap("Ipv6EgressOnlyRuleId")
        public String ipv6EgressOnlyRuleId;

        /**
         * <p>The name of the egress-only rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the egress-only rule.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule self = new DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
            this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
            return this;
        }
        public String getIpv6EgressOnlyRuleId() {
            return this.ipv6EgressOnlyRuleId;
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules extends TeaModel {
        @NameInMap("Ipv6EgressOnlyRule")
        public java.util.List<DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule> ipv6EgressOnlyRule;

        public static DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules self = new DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRules setIpv6EgressOnlyRule(java.util.List<DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule> ipv6EgressOnlyRule) {
            this.ipv6EgressOnlyRule = ipv6EgressOnlyRule;
            return this;
        }
        public java.util.List<DescribeIpv6EgressOnlyRulesResponseBodyIpv6EgressOnlyRulesIpv6EgressOnlyRule> getIpv6EgressOnlyRule() {
            return this.ipv6EgressOnlyRule;
        }

    }

}
