// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAddressesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.2.3.3</p>
     */
    @NameInMap("AddressLike")
    public String addressLike;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm4gh****wela</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribeAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressesRequest self = new DescribeAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressesRequest setAddressLike(String addressLike) {
        this.addressLike = addressLike;
        return this;
    }
    public String getAddressLike() {
        return this.addressLike;
    }

    public DescribeAddressesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAddressesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAddressesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAddressesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeAddressesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
