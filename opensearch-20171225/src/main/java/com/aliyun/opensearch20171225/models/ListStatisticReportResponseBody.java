// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticReportResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The queried reports. Valid values:</p>
     * <br>
     * <p>For more information about the metrics in data quality reports, see the Upload behavioral data section of [Data collection 2.0](~~131547~~).</p>
     * <br>
     * <p>For more information about the metrics in application and A/B test reports, see the Core metrics section of [Metrics of statistical reports](~~187654~~).</p>
     * <br>
     * <p>For more information about the metrics in query analysis reports, see the Query analysis metrics section of [Metrics of statistical reports](~~187654~~).</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of the queried reports.</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListStatisticReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticReportResponseBody self = new ListStatisticReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatisticReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatisticReportResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public ListStatisticReportResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
