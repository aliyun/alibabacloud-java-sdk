// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaUtilizationOverviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    public static GetQuotaUtilizationOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUtilizationOverviewRequest self = new GetQuotaUtilizationOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaUtilizationOverviewRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

}
