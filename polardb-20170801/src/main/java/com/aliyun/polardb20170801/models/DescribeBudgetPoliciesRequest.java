// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetPoliciesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cg-p3gk2oh55c**</p>
     */
    @NameInMap("BudgetDimensionRefId")
    public String budgetDimensionRefId;

    /**
     * <strong>example:</strong>
     * <p>ConsumerGroup</p>
     */
    @NameInMap("BudgetDimensionType")
    public String budgetDimensionType;

    /**
     * <strong>example:</strong>
     * <p>023aacc1effc4b56bb154bfbec6baxxx</p>
     */
    @NameInMap("BudgetPolicyId")
    public String budgetPolicyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeBudgetPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetPoliciesRequest self = new DescribeBudgetPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetPoliciesRequest setBudgetDimensionRefId(String budgetDimensionRefId) {
        this.budgetDimensionRefId = budgetDimensionRefId;
        return this;
    }
    public String getBudgetDimensionRefId() {
        return this.budgetDimensionRefId;
    }

    public DescribeBudgetPoliciesRequest setBudgetDimensionType(String budgetDimensionType) {
        this.budgetDimensionType = budgetDimensionType;
        return this;
    }
    public String getBudgetDimensionType() {
        return this.budgetDimensionType;
    }

    public DescribeBudgetPoliciesRequest setBudgetPolicyId(String budgetPolicyId) {
        this.budgetPolicyId = budgetPolicyId;
        return this;
    }
    public String getBudgetPolicyId() {
        return this.budgetPolicyId;
    }

    public DescribeBudgetPoliciesRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeBudgetPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBudgetPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBudgetPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBudgetPoliciesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
