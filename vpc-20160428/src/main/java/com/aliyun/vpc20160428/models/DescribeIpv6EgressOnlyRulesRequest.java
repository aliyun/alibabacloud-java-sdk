// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6EgressOnlyRulesRequest extends TeaModel {
    /**
     * <p>The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6gw-bp1rhhs9zjlxukc5e****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance to which you want to apply the egress-only rule. Valid values:</p>
     * <ul>
     * <li>IPv6Address (default)</li>
     * <li>IPv6Prefix</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ipv6Address</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The ID of the egress-only rule that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6py-bp1rr7fq1md8pbb3k****</p>
     */
    @NameInMap("Ipv6EgressOnlyRuleId")
    public String ipv6EgressOnlyRuleId;

    /**
     * <p>The ID of the IPv6 gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6gw-bp1rhhs9zjlxukc5e****</p>
     */
    @NameInMap("Ipv6GatewayId")
    public String ipv6GatewayId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>rulename</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the IPv6 gateway is deployed. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeIpv6EgressOnlyRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6EgressOnlyRulesRequest self = new DescribeIpv6EgressOnlyRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6EgressOnlyRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeIpv6EgressOnlyRulesRequest setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
        this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
        return this;
    }
    public String getIpv6EgressOnlyRuleId() {
        return this.ipv6EgressOnlyRuleId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setIpv6GatewayId(String ipv6GatewayId) {
        this.ipv6GatewayId = ipv6GatewayId;
        return this;
    }
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIpv6EgressOnlyRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeIpv6EgressOnlyRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeIpv6EgressOnlyRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpv6EgressOnlyRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeIpv6EgressOnlyRulesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
