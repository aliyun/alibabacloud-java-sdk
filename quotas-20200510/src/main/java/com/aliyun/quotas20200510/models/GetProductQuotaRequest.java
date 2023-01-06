// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaRequest extends TeaModel {
    // The details of dimensions.
    @NameInMap("Dimensions")
    public java.util.List<GetProductQuotaRequestDimensions> dimensions;

    // The abbreviation of the cloud service name.
    // 
    // >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
    @NameInMap("ProductCode")
    public String productCode;

    // The ID of the quota.
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
        // The dimension keys.
        // 
        // > 
        // *   The value range of N varies based on the number of dimensions that are supported by the related cloud service.
        // *   If you call the operation to query the details about a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: Elastic Compute Service (ECS) whose service code is ecs, Enterprise Distributed Application Service (EDAS) whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling (ESS) whose service code is ess.
        @NameInMap("Key")
        public String key;

        // The dimension values.
        // 
        // > 
        // *   The value range of N varies based on the number of dimensions that are supported by the related cloud service.
        // *   If you call the operation to query the details about a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: Elastic Compute Service (ECS) whose service code is ecs, Enterprise Distributed Application Service (EDAS) whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling (ESS) whose service code is ess.
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
