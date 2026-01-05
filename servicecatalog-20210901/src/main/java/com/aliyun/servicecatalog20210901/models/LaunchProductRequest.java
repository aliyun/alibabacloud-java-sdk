// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class LaunchProductRequest extends TeaModel {
    /**
     * <p>The input parameters of the template.</p>
     * <p>You can specify up to 200 parameters.</p>
     * <blockquote>
     * <p>This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.</p>
     * </blockquote>
     */
    @NameInMap("Parameters")
    public java.util.List<LaunchProductRequestParameters> parameters;

    /**
     * <p>The ID of the product portfolio.</p>
     * <blockquote>
     * <p>If the PortfolioId parameter is not required, you do not need to specify the PortfolioId parameter. If the PortfolioId parameter is required, you must specify the PortfolioId parameter. For more information about how to obtain the value of the PortfolioId parameter, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</p>
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
     * <p>The name of the product instance.</p>
     * <p>The value must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEMO-ECS instance</p>
     */
    @NameInMap("ProvisionedProductName")
    public String provisionedProductName;

    /**
     * <p>The ID of the region to which the Resource Orchestration Service (ROS) stack belongs.</p>
     * <p>For more information about how to obtain the regions that are supported by ROS, see <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("StackRegionId")
    public String stackRegionId;

    /**
     * <p>The custom tags that are specified by the end user.</p>
     * <p>Maximum value of N: 20.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key and Tags.N.Value parameters.</p>
     * </li>
     * <li><p>The tag is propagated to each stack resource that supports the tag feature.</p>
     * </li>
     * </ul>
     */
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
         * <p>The name of the input parameter for the template.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the input parameter for the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.s6-c1m1.small</p>
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
        /**
         * <p>The tag key of the custom tag.</p>
         * <p>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the custom tag.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
