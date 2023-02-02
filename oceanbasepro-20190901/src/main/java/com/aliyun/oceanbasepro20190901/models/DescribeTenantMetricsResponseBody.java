// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metrics of the tenant.</p>
     */
    @NameInMap("TenantMetrics")
    public String tenantMetrics;

    /**
     * <p>The total count.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantMetricsResponseBody self = new DescribeTenantMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantMetricsResponseBody setTenantMetrics(String tenantMetrics) {
        this.tenantMetrics = tenantMetrics;
        return this;
    }
    public String getTenantMetrics() {
        return this.tenantMetrics;
    }

    public DescribeTenantMetricsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
