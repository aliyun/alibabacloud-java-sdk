// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasRequest extends TeaModel {
    /**
     * <p>The abbreviated name of the cloud service.</p>
     * <blockquote>
     * <p>For more information about how to obtain the abbreviated name of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudsso</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
     * <blockquote>
     * <p>For more information about how to obtain the quota ID of a target cloud service, see <code>QuotaActionCode</code> in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>q_system-policy-per-access-configuration</p>
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
