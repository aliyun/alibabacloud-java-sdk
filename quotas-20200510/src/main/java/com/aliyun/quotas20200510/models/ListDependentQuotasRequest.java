// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasRequest extends TeaModel {
    /**
     * <p>The abbreviation of the Alibaba Cloud service name.</p>
     * <br>
     * <p>> For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The quota ID.</p>
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
