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
     * <p>The statistical reports.</p>
     * <ul>
     * <li><p>For \<code>data-quality\\</code> reports, see the &quot;Upload behavioral data&quot; section in <a href="https://help.aliyun.com/document_detail/131547.html">Data collection 2.0</a>.</p>
     * </li>
     * <li><p>For \<code>app\\</code> and \<code>abtest\\</code> reports, see the &quot;Core metrics&quot; section in <a href="https://help.aliyun.com/document_detail/187665.html">Metrics of statistical reports</a>.</p>
     * </li>
     * <li><p>For \<code>app-query\\</code> reports, see the &quot;Query analysis metrics&quot; section in <a href="https://help.aliyun.com/document_detail/187665.html">Metrics of statistical reports</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of entries.</p>
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
