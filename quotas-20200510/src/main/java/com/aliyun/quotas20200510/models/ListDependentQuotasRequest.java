// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListDependentQuotasRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

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
