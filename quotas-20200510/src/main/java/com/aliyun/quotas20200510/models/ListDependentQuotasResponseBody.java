// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasResponseBody extends TeaModel {
    @NameInMap("Quotas")
    public java.util.List<ListDependentQuotasResponseBodyQuotas> quotas;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDependentQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDependentQuotasResponseBody self = new ListDependentQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDependentQuotasResponseBody setQuotas(java.util.List<ListDependentQuotasResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListDependentQuotasResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListDependentQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDependentQuotasResponseBodyQuotasDimensions extends TeaModel {
        @NameInMap("DependentDimension")
        public java.util.List<String> dependentDimension;

        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        public static ListDependentQuotasResponseBodyQuotasDimensions build(java.util.Map<String, ?> map) throws Exception {
            ListDependentQuotasResponseBodyQuotasDimensions self = new ListDependentQuotasResponseBodyQuotasDimensions();
            return TeaModel.build(map, self);
        }

        public ListDependentQuotasResponseBodyQuotasDimensions setDependentDimension(java.util.List<String> dependentDimension) {
            this.dependentDimension = dependentDimension;
            return this;
        }
        public java.util.List<String> getDependentDimension() {
            return this.dependentDimension;
        }

        public ListDependentQuotasResponseBodyQuotasDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public ListDependentQuotasResponseBodyQuotasDimensions setDimensionValues(java.util.List<String> dimensionValues) {
            this.dimensionValues = dimensionValues;
            return this;
        }
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

    }

    public static class ListDependentQuotasResponseBodyQuotas extends TeaModel {
        @NameInMap("Dimensions")
        public java.util.List<ListDependentQuotasResponseBodyQuotasDimensions> dimensions;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("Scale")
        public Float scale;

        public static ListDependentQuotasResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListDependentQuotasResponseBodyQuotas self = new ListDependentQuotasResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListDependentQuotasResponseBodyQuotas setDimensions(java.util.List<ListDependentQuotasResponseBodyQuotasDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<ListDependentQuotasResponseBodyQuotasDimensions> getDimensions() {
            return this.dimensions;
        }

        public ListDependentQuotasResponseBodyQuotas setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDependentQuotasResponseBodyQuotas setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListDependentQuotasResponseBodyQuotas setScale(Float scale) {
            this.scale = scale;
            return this;
        }
        public Float getScale() {
            return this.scale;
        }

    }

}
