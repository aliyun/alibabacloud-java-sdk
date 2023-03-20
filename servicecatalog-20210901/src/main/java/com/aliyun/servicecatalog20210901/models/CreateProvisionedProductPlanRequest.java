// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProvisionedProductPlanRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>An array that consists of the parameters in the template. The parameters are specified by the administrator.</p>
     * <br>
     * <p>You can specify up to 200 parameters.</p>
     * <br>
     * <p>>  This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateProvisionedProductPlanRequestParameters> parameters;

    /**
     * <p>The name of the plan.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The type of the plan.</p>
     * <br>
     * <p>Set the value to Ros, which specifies Resource Orchestration Service (ROS).</p>
     */
    @NameInMap("PlanType")
    public String planType;

    /**
     * <p>The ID of the product portfolio.</p>
     * <br>
     * <p>>  If the PortfolioId parameter is not required, you do not need to specify the PortfolioId parameter. If the PortfolioId parameter is required, you must specify the PortfolioId parameter. For more information about how to obtain the value of the PortfolioId parameter, see [ListLaunchOptions](~~ListLaunchOptions~~).</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The ID of the product version.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The name of the product instance.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProvisionedProductName")
    public String provisionedProductName;

    /**
     * <p>The ID of the region to which the ROS stack belongs.</p>
     * <br>
     * <p>For more information about how to obtain the regions that are supported by ROS, see [DescribeRegions](~~131035~~).</p>
     */
    @NameInMap("StackRegionId")
    public String stackRegionId;

    @NameInMap("Tags")
    public java.util.List<CreateProvisionedProductPlanRequestTags> tags;

    public static CreateProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProvisionedProductPlanRequest self = new CreateProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateProvisionedProductPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProvisionedProductPlanRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
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

    public CreateProvisionedProductPlanRequest setTags(java.util.List<CreateProvisionedProductPlanRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateProvisionedProductPlanRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateProvisionedProductPlanRequestParameters extends TeaModel {
        /**
         * <p>The name of the parameter in the template.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter in the template.</p>
         */
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

    public static class CreateProvisionedProductPlanRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateProvisionedProductPlanRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateProvisionedProductPlanRequestTags self = new CreateProvisionedProductPlanRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateProvisionedProductPlanRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateProvisionedProductPlanRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
