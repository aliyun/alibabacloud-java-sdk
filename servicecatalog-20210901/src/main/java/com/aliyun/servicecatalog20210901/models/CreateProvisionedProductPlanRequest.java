// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProvisionedProductPlanRequest extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<CreateProvisionedProductPlanRequestParameters> parameters;

    @NameInMap("PlanName")
    public String planName;

    @NameInMap("PlanType")
    public String planType;

    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("ProductVersionId")
    public String productVersionId;

    @NameInMap("ProvisionedProductName")
    public String provisionedProductName;

    @NameInMap("StackRegionId")
    public String stackRegionId;

    public static CreateProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProvisionedProductPlanRequest self = new CreateProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateProvisionedProductPlanRequest setParameters(java.util.List<CreateProvisionedProductPlanRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateProvisionedProductPlanRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateProvisionedProductPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateProvisionedProductPlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public CreateProvisionedProductPlanRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public CreateProvisionedProductPlanRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateProvisionedProductPlanRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public CreateProvisionedProductPlanRequest setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }
    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    public CreateProvisionedProductPlanRequest setStackRegionId(String stackRegionId) {
        this.stackRegionId = stackRegionId;
        return this;
    }
    public String getStackRegionId() {
        return this.stackRegionId;
    }

    public static class CreateProvisionedProductPlanRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateProvisionedProductPlanRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateProvisionedProductPlanRequestParameters self = new CreateProvisionedProductPlanRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateProvisionedProductPlanRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateProvisionedProductPlanRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
