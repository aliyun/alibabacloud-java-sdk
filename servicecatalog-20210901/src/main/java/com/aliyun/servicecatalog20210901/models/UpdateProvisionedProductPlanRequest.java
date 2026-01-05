// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductPlanRequest extends TeaModel {
    /**
     * <p>The description of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>Create an ECS instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>An array that consists of the parameters in the template.</p>
     * <p>Maximum value of N: 200.</p>
     * <blockquote>
     * <p>If you specify Parameters, you must specify ParameterKey and ParameterValue.</p>
     * </blockquote>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateProvisionedProductPlanRequestParameters> parameters;

    /**
     * <p>The ID of the plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-bp1jvmdk2k****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the product portfolio.</p>
     * <blockquote>
     * <p>If the default launch option exists, you do not need to specify PortfolioId. If the default launch option does not exist, you must specify PortfolioId. For more information about how to obtain the value of PortfolioId, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The ID of the product version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pv-bp15e79d26****</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>An array that consists of custom tags.</p>
     * <p>Maximum value of N: 20.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you specify Tags, you must specify Tags.N.Key and Tags.N.Value.</li>
     * <li>The tag of a stack is propagated to each resource that supports the tag feature in the stack.</li>
     * </ul>
     */
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
        /**
         * <p>The name of the parameter in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.s6-c1m1.small</p>
         */
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
        /**
         * <p>The key of the custom tag.</p>
         * <p>The key can be up to 128 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the custom tag.</p>
         * <p>The value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
