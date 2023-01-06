// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionRequest extends TeaModel {
    // The dimension details that are supported by the cloud service.
    @NameInMap("DependentDimensions")
    public java.util.List<GetProductQuotaDimensionRequestDependentDimensions> dependentDimensions;

    // The dimension key.
    @NameInMap("DimensionKey")
    public String dimensionKey;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    public static GetProductQuotaDimensionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaDimensionRequest self = new GetProductQuotaDimensionRequest();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaDimensionRequest setDependentDimensions(java.util.List<GetProductQuotaDimensionRequestDependentDimensions> dependentDimensions) {
        this.dependentDimensions = dependentDimensions;
        return this;
    }
    public java.util.List<GetProductQuotaDimensionRequestDependentDimensions> getDependentDimensions() {
        return this.dependentDimensions;
    }

    public GetProductQuotaDimensionRequest setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
        return this;
    }
    public String getDimensionKey() {
        return this.dimensionKey;
    }

    public GetProductQuotaDimensionRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public static class GetProductQuotaDimensionRequestDependentDimensions extends TeaModel {
        // The dimension keys that are supported by the cloud service.
        // 
        // >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
        @NameInMap("Key")
        public String key;

        // The dimension values that are supported by the cloud service.
        // 
        // >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
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
