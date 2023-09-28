// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProvisionedProductPlanRequest extends TeaModel {
    /**
     * <p>The description of the plan.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the operation that you want the plan to perform. Valid values:</p>
     * <br>
     * <p>*   LaunchProduct: launches the product. This is the default value.</p>
     * <p>*   UpdateProvisionedProduct: updates the information about the product instance.</p>
     * <p>*   TerminateProvisionedProduct: terminates the product instance.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>An array that consists of the parameters in the template.</p>
     * <br>
     * <p>You can specify up to 200 parameters.</p>
     * <br>
     * <p>> If you specify Parameters, you must specify ParameterKey and ParameterValue.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateProvisionedProductPlanRequestParameters> parameters;

    /**
     * <p>The plan name.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The plan type.</p>
     * <br>
     * <p>Set the value to Ros, which specifies Resource Orchestration Service (ROS).</p>
     */
    @NameInMap("PlanType")
    public String planType;

    /**
     * <p>The product portfolio ID.</p>
     * <br>
     * <p>> If PortfolioId is not required, you do not need to specify PortfolioId. If PortfolioId is required, you must specify PortfolioId. For more information about how to obtain the value of PortfolioId, see [ListLaunchOptions](~~ListLaunchOptions~~).</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The product ID.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The product version ID.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The product instance name.</p>
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

    /**
     * <p>An array that consists of custom tags.</p>
     * <br>
     * <p>Maximum value of N: 20.</p>
     * <br>
     * <p>> </p>
     * <p>*   If you specify Tags, you must specify Tags.N.Key and Tags.N.Value.</p>
     * <p>*   The tag of a stack is propagated to each resource that supports the tag feature in the stack.</p>
     */
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
        /**
         * <p>The key of the custom tag.</p>
         * <br>
         * <p>The key can be up to 128 characters in length, and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom tag.</p>
         * <br>
         * <p>The value can be up to 128 characters in length, and cannot start with `acs:`. The tag value cannot contain `http://` or `https://`.</p>
         */
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
