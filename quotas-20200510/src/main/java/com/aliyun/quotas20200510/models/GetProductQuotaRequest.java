// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("Dimensions")
    public java.util.List<GetProductQuotaRequestDimensions> dimensions;

    public static GetProductQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaRequest self = new GetProductQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetProductQuotaRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public GetProductQuotaRequest setDimensions(java.util.List<GetProductQuotaRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<GetProductQuotaRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public static class GetProductQuotaRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetProductQuotaRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaRequestDimensions self = new GetProductQuotaRequestDimensions();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaRequestDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProductQuotaRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
