// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetUsageRequest extends TeaModel {
    /**
     * <p>The budget dimension reference ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ref-001</p>
     */
    @NameInMap("BudgetDimensionRefId")
    public String budgetDimensionRefId;

    /**
     * <p>The budget dimension type.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("BudgetDimensionType")
    public String budgetDimensionType;

    /**
     * <p>The ID of the gateway instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-123</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The region ID of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBudgetUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetUsageRequest self = new DescribeBudgetUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetUsageRequest setBudgetDimensionRefId(String budgetDimensionRefId) {
        this.budgetDimensionRefId = budgetDimensionRefId;
        return this;
    }
    public String getBudgetDimensionRefId() {
        return this.budgetDimensionRefId;
    }

    public DescribeBudgetUsageRequest setBudgetDimensionType(String budgetDimensionType) {
        this.budgetDimensionType = budgetDimensionType;
        return this;
    }
    public String getBudgetDimensionType() {
        return this.budgetDimensionType;
    }

    public DescribeBudgetUsageRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeBudgetUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
