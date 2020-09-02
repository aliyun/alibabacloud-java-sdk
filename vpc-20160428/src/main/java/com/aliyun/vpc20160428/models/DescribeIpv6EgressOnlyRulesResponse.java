// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6EgressOnlyRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Ipv6EgressOnlyRules")
    @Validation(required = true)
    public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules ipv6EgressOnlyRules;

    public static DescribeIpv6EgressOnlyRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6EgressOnlyRulesResponse self = new DescribeIpv6EgressOnlyRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6EgressOnlyRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpv6EgressOnlyRulesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeIpv6EgressOnlyRulesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6EgressOnlyRulesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIpv6EgressOnlyRulesResponse setIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules ipv6EgressOnlyRules) {
        this.ipv6EgressOnlyRules = ipv6EgressOnlyRules;
        return this;
    }
    public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules getIpv6EgressOnlyRules() {
        return this.ipv6EgressOnlyRules;
    }

    public static class DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule extends TeaModel {
        @NameInMap("Ipv6EgressOnlyRuleId")
        @Validation(required = true)
        public String ipv6EgressOnlyRuleId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule self = new DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
            this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
            return this;
        }
        public String getIpv6EgressOnlyRuleId() {
            return this.ipv6EgressOnlyRuleId;
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules extends TeaModel {
        @NameInMap("Ipv6EgressOnlyRule")
        @Validation(required = true)
        public java.util.List<DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule> ipv6EgressOnlyRule;

        public static DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules self = new DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules();
            return TeaModel.build(map, self);
        }

        public DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules setIpv6EgressOnlyRule(java.util.List<DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule> ipv6EgressOnlyRule) {
            this.ipv6EgressOnlyRule = ipv6EgressOnlyRule;
            return this;
        }
        public java.util.List<DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule> getIpv6EgressOnlyRule() {
            return this.ipv6EgressOnlyRule;
        }

    }

}
