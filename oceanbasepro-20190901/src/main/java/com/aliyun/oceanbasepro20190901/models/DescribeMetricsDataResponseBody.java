// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMetricsDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[
     *                 {
     *                     &quot;sql_select_count&quot;:75.<strong><strong>15</strong></strong>1515,
     *                     &quot;timestamp&quot;:165079****
     *                 },
     *                 ......
     *             ]</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsDataResponseBody self = new DescribeMetricsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsDataResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public DescribeMetricsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
