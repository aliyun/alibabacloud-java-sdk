// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductRequest extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<UpdateProvisionedProductRequestParameters> parameters;

    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // 产品ID
    @NameInMap("ProductId")
    public String productId;

    // 产品版本ID
    @NameInMap("ProductVersionId")
    public String productVersionId;

    // 实例ID
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

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

    public static class UpdateProvisionedProductRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

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

}
