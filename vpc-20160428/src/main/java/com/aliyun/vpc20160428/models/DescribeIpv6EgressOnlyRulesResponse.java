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

    }

    public static class DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules extends TeaModel {
        @NameInMap("Ipv6EgressOnlyRule")
        @Validation(required = true)
        public java.util.List<DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRulesIpv6EgressOnlyRule> ipv6EgressOnlyRule;

        public static DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules self = new DescribeIpv6EgressOnlyRulesResponseIpv6EgressOnlyRules();
            return TeaModel.build(map, self);
        }

    }

}
