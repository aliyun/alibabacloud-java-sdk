// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6EgressOnlyRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6GatewayId")
    @Validation(required = true)
    public String ipv6GatewayId;

    @NameInMap("Ipv6EgressOnlyRuleId")
    public String ipv6EgressOnlyRuleId;

    @NameInMap("Name")
    public String name;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeIpv6EgressOnlyRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6EgressOnlyRulesRequest self = new DescribeIpv6EgressOnlyRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6EgressOnlyRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
        this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
        return this;
    }
    public String getIpv6EgressOnlyRuleId() {
        return this.ipv6EgressOnlyRuleId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6EgressOnlyRulesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeIpv6EgressOnlyRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIpv6EgressOnlyRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
