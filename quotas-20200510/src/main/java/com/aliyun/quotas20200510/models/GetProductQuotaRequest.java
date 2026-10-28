// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaRequest extends TeaModel {
    /**
     * <p>The quota dimensions.
     * The properties of the quota item. The combination of dimensions and QuotaActionCode determines a unique quota item.</p>
     * <blockquote>
     * <p>Dimensions are required for some cloud services. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions of a cloud service and check whether a dimension is required. The Requisite response parameter indicates whether the dimension is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;regionId\&quot;:\&quot;cn-beijing\&quot;}</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<GetProductQuotaRequestDimensions> dimensions;

    /**
     * <p>The abbreviated name of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviated name of a cloud service, see the ProductCode parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
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
     * <p>For more information about how to obtain the quota ID of a specified cloud service, see the QuotaActionCode parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
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
         * <p>The key of the quota dimension.</p>
         * <blockquote>
         * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the maximum value of N.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the quota dimension.</p>
         * <blockquote>
         * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the maximum value of N.</p>
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
