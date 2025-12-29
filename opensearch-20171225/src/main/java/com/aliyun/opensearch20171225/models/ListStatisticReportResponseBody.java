// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticReportResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F65C8BB2-C14F-5983-888B-41C4E082D3BC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The statistical reports. Valid values:</p>
     * <ul>
     * <li>For more information about the metrics in data quality reports, see the Upload behavioral data section of <a href="https://help.aliyun.com/document_detail/131547.html">Data collection 2.0</a>.</li>
     * <li>For more information about the metrics in application and A/B test reports, see the Core metrics section of <a href="https://help.aliyun.com/document_detail/187665.html">Metrics of statistical reports</a>.</li>
     * <li>For more information about the metrics in query analysis reports, see the Query analysis metrics section of <a href="https://help.aliyun.com/document_detail/187665.html">Metrics of statistical reports</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>43</p>
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
