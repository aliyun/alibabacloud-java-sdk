// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;Metrics&quot;:[ {&quot;request_queue_rt&quot;:0.0,&quot;TimeStamp&quot;:&quot;2022-02-23T01:58:00Z&quot;}]</p>
     */
    @NameInMap("TenantMetrics")
    public String tenantMetrics;

    /**
     * <strong>example:</strong>
     * <p>9</p>
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
