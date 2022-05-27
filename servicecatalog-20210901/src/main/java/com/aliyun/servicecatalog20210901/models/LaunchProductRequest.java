// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class LaunchProductRequest extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<LaunchProductRequestParameters> parameters;

    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 产品ID
    @NameInMap("ProductId")
    public String productId;

    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    // 实例名称
    @NameInMap("ProvisionedProductName")
    public String provisionedProductName;

    // ROS资源栈所属的地域ID
    @NameInMap("StackRegionId")
    public String stackRegionId;

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

    public static class LaunchProductRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

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

}
