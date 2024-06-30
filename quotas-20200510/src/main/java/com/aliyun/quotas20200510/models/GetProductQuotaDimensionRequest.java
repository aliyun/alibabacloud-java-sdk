// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionRequest extends TeaModel {
    /**
     * <p>The information about quota dimensions.</p>
     */
    @NameInMap("DependentDimensions")
    public java.util.List<GetProductQuotaDimensionRequestDependentDimensions> dependentDimensions;

    /**
     * <p>The key of the quota dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>regionId</p>
     */
    @NameInMap("DimensionKey")
    public String dimensionKey;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services that support Quota Center</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-spec</p>
     */
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
        /**
         * <p>The key of the quota dimension on which the quota dimension that you want to query is dependent.</p>
         * <blockquote>
         * <p>The value range of N varies based on the number of quota dimensions that are supported by the specified Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension on which the quota dimension that you want to query is dependent.</p>
         * <blockquote>
         * <p>The value range of N varies based on the number of quota dimensions that are supported by the specified Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
