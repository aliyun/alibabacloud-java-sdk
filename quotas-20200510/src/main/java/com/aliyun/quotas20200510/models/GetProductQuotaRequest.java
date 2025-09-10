// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaRequest extends TeaModel {
    /**
     * <p>The quota dimensions.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;regionId\&quot;:\&quot;cn-beijing\&quot;}</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<GetProductQuotaRequestDimensions> dimensions;

    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p> To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p> To query a quota ID of an Alibaba Cloud service, call the <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a> operation and check the value of <code>QuotaActionCode</code> in the response.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_security-groups</p>
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
         * <blockquote>
         * <p> This parameter is required for cloud services that support dimensions. You must specify both <code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code>. The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service. The following cloud services support dimensions: ECS whose service code is ecs, Enterprise Distributed Application Service (EDAS) whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling whose service code is ess.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         * <blockquote>
         * <p> This parameter is required for cloud services that support dimensions. You must specify both <code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code>. The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service. The following cloud services support dimensions: ECS whose service code is ecs, EDAS whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling whose service code is ess.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
