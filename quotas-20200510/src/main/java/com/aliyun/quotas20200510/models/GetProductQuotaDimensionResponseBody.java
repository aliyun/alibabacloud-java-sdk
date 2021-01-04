// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QuotaDimension")
    public GetProductQuotaDimensionResponseBodyQuotaDimension quotaDimension;

    public static GetProductQuotaDimensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaDimensionResponseBody self = new GetProductQuotaDimensionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaDimensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductQuotaDimensionResponseBody setQuotaDimension(GetProductQuotaDimensionResponseBodyQuotaDimension quotaDimension) {
        this.quotaDimension = quotaDimension;
        return this;
    }
    public GetProductQuotaDimensionResponseBodyQuotaDimension getQuotaDimension() {
        return this.quotaDimension;
    }

    public static class GetProductQuotaDimensionResponseBodyQuotaDimension extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        @NameInMap("Name")
        public String name;

        public static GetProductQuotaDimensionResponseBodyQuotaDimension build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaDimensionResponseBodyQuotaDimension self = new GetProductQuotaDimensionResponseBodyQuotaDimension();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDependentDimensions(java.util.List<String> dependentDimensions) {
            this.dependentDimensions = dependentDimensions;
            return this;
        }
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDimensionValues(java.util.List<String> dimensionValues) {
            this.dimensionValues = dimensionValues;
            return this;
        }
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
