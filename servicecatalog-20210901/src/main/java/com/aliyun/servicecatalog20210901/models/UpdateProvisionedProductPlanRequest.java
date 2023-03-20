// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductPlanRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.List<UpdateProvisionedProductPlanRequestParameters> parameters;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("ProductVersionId")
    public String productVersionId;

    @NameInMap("Tags")
    public java.util.List<UpdateProvisionedProductPlanRequestTags> tags;

    public static UpdateProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductPlanRequest self = new UpdateProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProvisionedProductPlanRequest setParameters(java.util.List<UpdateProvisionedProductPlanRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateProvisionedProductPlanRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateProvisionedProductPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateProvisionedProductPlanRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public UpdateProvisionedProductPlanRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProvisionedProductPlanRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProvisionedProductPlanRequest setTags(java.util.List<UpdateProvisionedProductPlanRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateProvisionedProductPlanRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdateProvisionedProductPlanRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateProvisionedProductPlanRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateProvisionedProductPlanRequestParameters self = new UpdateProvisionedProductPlanRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateProvisionedProductPlanRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateProvisionedProductPlanRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateProvisionedProductPlanRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateProvisionedProductPlanRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateProvisionedProductPlanRequestTags self = new UpdateProvisionedProductPlanRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateProvisionedProductPlanRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateProvisionedProductPlanRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
