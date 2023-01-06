// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionResponseBody extends TeaModel {
    // The details about the quota dimension.
    @NameInMap("QuotaDimension")
    public GetProductQuotaDimensionResponseBodyQuotaDimension quotaDimension;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetProductQuotaDimensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaDimensionResponseBody self = new GetProductQuotaDimensionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaDimensionResponseBody setQuotaDimension(GetProductQuotaDimensionResponseBodyQuotaDimension quotaDimension) {
        this.quotaDimension = quotaDimension;
        return this;
    }
    public GetProductQuotaDimensionResponseBodyQuotaDimension getQuotaDimension() {
        return this.quotaDimension;
    }

    public GetProductQuotaDimensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail extends TeaModel {
        // The name of the dimension value.
        @NameInMap("Name")
        public String name;

        // The dimension value.
        @NameInMap("Value")
        public String value;

        public static GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail self = new GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProductQuotaDimensionResponseBodyQuotaDimension extends TeaModel {
        // The quota dimensions that are supported by the cloud service.
        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        // The dimension key. Valid values:
        // 
        // *   regionId: region ID
        // *   zoneId: zone ID
        // *   chargeType: billing method
        // *   networkType: network type
        @NameInMap("DimensionKey")
        public String dimensionKey;

        // The details about the dimension value.
        @NameInMap("DimensionValueDetail")
        public java.util.List<GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail> dimensionValueDetail;

        // The dimension values.
        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        // The name of the dimension.
        @NameInMap("Name")
        public String name;

        public static GetProductQuotaDimensionResponseBodyQuotaDimension build(java.util.Map<String, ?> map) throws Exception {
            GetProductQuotaDimensionResponseBodyQuotaDimension self = new GetProductQuotaDimensionResponseBodyQuotaDimension();
            return TeaModel.build(map, self);
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDependentDimensions(java.util.List<String> dependentDimensions) {
            this.dependentDimensions = dependentDimensions;
            return this;
        }
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public GetProductQuotaDimensionResponseBodyQuotaDimension setDimensionValueDetail(java.util.List<GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail> dimensionValueDetail) {
            this.dimensionValueDetail = dimensionValueDetail;
            return this;
        }
        public java.util.List<GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
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
