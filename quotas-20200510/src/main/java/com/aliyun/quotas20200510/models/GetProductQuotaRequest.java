// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaRequest extends TeaModel {
    /**
     * <p>The quota dimensions.</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<GetProductQuotaRequestDimensions> dimensions;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>> For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the quota.</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    public static GetProductQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaRequest self = new GetProductQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaRequest setDimensions(java.util.List<GetProductQuotaRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<GetProductQuotaRequestDimensions> getDimensions() {
        return this.dimensions;
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

    public static class GetProductQuotaRequestDimensions extends TeaModel {
        /**
         * <p>The key of the dimension.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * <br>
         * <p>*   If you call the operation to query the details of a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: ECS whose service code is ecs, Enterprise Distributed Application Service (EDAS) whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling (ESS) whose service code is ess.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
         * <br>
         * <p>*   If you call the operation to query the details of a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: ECS whose service code is ecs, EDAS whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and ESS whose service code is ess.</p>
         */
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
