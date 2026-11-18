// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetUsageRequest extends TeaModel {
    /**
     * <p>The reference ID of the budget dimension. If BudgetDimensionType is set to Global, set this parameter to Global. If BudgetDimensionType is set to Consumer, set this parameter to the consumer ID returned by DescribeBudgetPolicies, such as consumer-xxx. If BudgetDimensionType is set to ConsumerGroup, set this parameter to the consumer group ID, such as cg-xxx.</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("BudgetDimensionRefId")
    public String budgetDimensionRefId;

    /**
     * <p>The budget dimension type. Valid values: Global (global budget), Consumer (consumer budget), and ConsumerGroup (consumer group budget).</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("BudgetDimensionType")
    public String budgetDimensionType;

    /**
     * <p>The ID of the gateway instance to query. This parameter is required. If this parameter is not specified, the API returns InvalidPolarGatewayInstanceId.NotFound (404).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-123</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The ID of the region where the gateway instance resides.</p>
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
