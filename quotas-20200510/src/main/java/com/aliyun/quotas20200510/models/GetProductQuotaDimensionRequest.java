// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("DimensionKey")
    public String dimensionKey;

    @NameInMap("DependentDimensions")
    public java.util.List<GetProductQuotaDimensionRequestDependentDimensions> dependentDimensions;

    public static GetProductQuotaDimensionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaDimensionRequest self = new GetProductQuotaDimensionRequest();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaDimensionRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetProductQuotaDimensionRequest setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
        return this;
    }
    public String getDimensionKey() {
        return this.dimensionKey;
    }

    public GetProductQuotaDimensionRequest setDependentDimensions(java.util.List<GetProductQuotaDimensionRequestDependentDimensions> dependentDimensions) {
        this.dependentDimensions = dependentDimensions;
        return this;
    }
    public java.util.List<GetProductQuotaDimensionRequestDependentDimensions> getDependentDimensions() {
        return this.dependentDimensions;
    }

    public static class GetProductQuotaDimensionRequestDependentDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetProductQuotaDimensionRequestDependentDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaDimensionRequestDependentDimensions self = new GetProductQuotaDimensionRequestDependentDimensions();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaDimensionRequestDependentDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProductQuotaDimensionRequestDependentDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
