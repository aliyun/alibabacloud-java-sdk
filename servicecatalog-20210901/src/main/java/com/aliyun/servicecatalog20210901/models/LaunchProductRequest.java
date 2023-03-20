// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class LaunchProductRequest extends TeaModel {
    /**
     * <p>An array that consists of the parameters in the template. The parameters are specified by the administrator.</p>
     * <br>
     * <p>You can specify up to 200 parameters.</p>
     * <br>
     * <p>>  This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<LaunchProductRequestParameters> parameters;

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
     * <p>The ID of the region to which the Resource Orchestration Service (ROS) stack belongs.</p>
     * <br>
     * <p>For more information about how to obtain the regions that are supported by ROS, see [DescribeRegions](~~131035~~).</p>
     */
    @NameInMap("StackRegionId")
    public String stackRegionId;

    @NameInMap("Tags")
    public java.util.List<LaunchProductRequestTags> tags;

    public static LaunchProductRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchProductRequest self = new LaunchProductRequest();
        return TeaModel.build(map, self);
    }

    public LaunchProductRequest setParameters(java.util.List<LaunchProductRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<LaunchProductRequestParameters> getParameters() {
        return this.parameters;
    }

    public LaunchProductRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public LaunchProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public LaunchProductRequest setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId;
        return this;
    }
    public String getProductVersionId() {
        return this.productVersionId;
    }

    public LaunchProductRequest setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }
    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    public LaunchProductRequest setStackRegionId(String stackRegionId) {
        this.stackRegionId = stackRegionId;
        return this;
    }
    public String getStackRegionId() {
        return this.stackRegionId;
    }

    public LaunchProductRequest setTags(java.util.List<LaunchProductRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<LaunchProductRequestTags> getTags() {
        return this.tags;
    }

    public static class LaunchProductRequestParameters extends TeaModel {
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

        public static LaunchProductRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            LaunchProductRequestParameters self = new LaunchProductRequestParameters();
            return TeaModel.build(map, self);
        }

        public LaunchProductRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public LaunchProductRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class LaunchProductRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static LaunchProductRequestTags build(java.util.Map<String, ?> map) throws Exception {
            LaunchProductRequestTags self = new LaunchProductRequestTags();
            return TeaModel.build(map, self);
        }

        public LaunchProductRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LaunchProductRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
