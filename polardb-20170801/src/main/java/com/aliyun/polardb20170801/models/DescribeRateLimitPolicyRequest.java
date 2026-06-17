// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeRateLimitPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The page number to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong>. The default value is <strong>30</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the rate limit policy.</p>
     * 
     * <strong>example:</strong>
     * <p>02eccf7c61cf4d05a543075ee907f3**</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the target resource, which can be a consumer group or a consumer, depending on the <code>ScopeType</code> value.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-xxxxxxxx</p>
     */
    @NameInMap("ScopeRefId")
    public String scopeRefId;

    /**
     * <p>The scope of the rate limit policy. Valid values:</p>
     * <ul>
     * <li><p><strong>ConsumerGroup</strong>: The policy applies to a consumer group.</p>
     * </li>
     * <li><p><strong>Consumer</strong>: The policy applies to a specific consumer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ConsumerGroup</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static DescribeRateLimitPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateLimitPolicyRequest self = new DescribeRateLimitPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRateLimitPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeRateLimitPolicyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRateLimitPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRateLimitPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribeRateLimitPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRateLimitPolicyRequest setScopeRefId(String scopeRefId) {
        this.scopeRefId = scopeRefId;
        return this;
    }
    public String getScopeRefId() {
        return this.scopeRefId;
    }

    public DescribeRateLimitPolicyRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}
