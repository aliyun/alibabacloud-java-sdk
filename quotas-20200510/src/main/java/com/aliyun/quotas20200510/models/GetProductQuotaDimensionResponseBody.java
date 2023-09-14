// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionResponseBody extends TeaModel {
    /**
     * <p>The details of the quota dimension.</p>
     */
    @NameInMap("QuotaDimension")
    public GetProductQuotaDimensionResponseBodyQuotaDimension quotaDimension;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The name of the quota dimension value.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quota dimension value.</p>
         */
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
        /**
         * <p>The quota dimensions on which the quota dimension that you want to query is dependent.</p>
         */
        @NameInMap("DependentDimensions")
        public java.util.List<String> dependentDimensions;

        /**
         * <p>The key of the quota dimension. Valid values:</p>
         * <br>
         * <p>*   regionId: the region ID.</p>
         * <p>*   zoneId: the zone ID.</p>
         * <p>*   chargeType: the billing method.</p>
         * <p>*   networkType: the network type.</p>
         */
        @NameInMap("DimensionKey")
        public String dimensionKey;

        /**
         * <p>The details of the quota dimension value.</p>
         */
        @NameInMap("DimensionValueDetail")
        public java.util.List<GetProductQuotaDimensionResponseBodyQuotaDimensionDimensionValueDetail> dimensionValueDetail;

        /**
         * <p>The values of the quota dimension.</p>
         */
        @NameInMap("DimensionValues")
        public java.util.List<String> dimensionValues;

        /**
         * <p>The name of the quota dimension.</p>
         */
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
