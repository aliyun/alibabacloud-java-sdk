// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductRequest extends TeaModel {
    /**
     * <p>The input parameters of the template.</p>
     * <br>
     * <p>You can specify up to 200 parameters.</p>
     * <br>
     * <p>> - This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.</p>
     * <p>> - If the values of the ProductVersionId and Parameters parameters are not changed, you are not allowed to update the information about the product instance.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<UpdateProvisionedProductRequestParameters> parameters;

    /**
     * <p>The ID of the product portfolio.</p>
     * <br>
     * <p>> The PortfolioId parameter is not required if the default launch option exists. The PortfolioId parameter is required if the default launch option does not exist. For more information about how to obtain the value of the PortfolioId parameter, see [ListLaunchOptions](~~ListLaunchOptions~~).</p>
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
     * <br>
     * <p>> If the values of the ProductVersionId and Parameters parameters are not changed, the information about the product instance cannot be updated.</p>
     */
    @NameInMap("ProductVersionId")
    public String productVersionId;

    /**
     * <p>The ID of the product instance.</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    /**
     * <p>The input custom tags.</p>
     * <br>
     * <p>Maximum value of N: 20.</p>
     * <br>
     * <p>> - The Tags parameter is optional. If you need to specify the Tags parameter, you must specify the Tags.N.Key and Tags.N.Value parameters.</p>
     * <p>> - The tag is propagated to each stack resource that supports the tag feature.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateProvisionedProductRequestTags> tags;

    public static UpdateProvisionedProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductRequest self = new UpdateProvisionedProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductRequest setParameters(java.util.List<UpdateProvisionedProductRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateProvisionedProductRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateProvisionedProductRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public UpdateProvisionedProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProvisionedProductRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public UpdateProvisionedProductRequest setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public UpdateProvisionedProductRequest setTags(java.util.List<UpdateProvisionedProductRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateProvisionedProductRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdateProvisionedProductRequestParameters extends TeaModel {
        /**
         * <p>The name of the input parameter for the template.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the input parameter for the template.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateProvisionedProductRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateProvisionedProductRequestParameters self = new UpdateProvisionedProductRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateProvisionedProductRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateProvisionedProductRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateProvisionedProductRequestTags extends TeaModel {
        /**
         * <p>The tag key of the custom tag.</p>
         * <br>
         * <p>The tag key must be 1 to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the custom tag.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateProvisionedProductRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateProvisionedProductRequestTags self = new UpdateProvisionedProductRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateProvisionedProductRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateProvisionedProductRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
