// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasRequest extends TeaModel {
    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/182368.html">Alibaba Cloud services that support Quota Center</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>csk</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_i5uzm3</p>
     */
    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    public static ListDependentQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDependentQuotasRequest self = new ListDependentQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListDependentQuotasRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListDependentQuotasRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

}
