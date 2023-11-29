// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMetricsDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMetricsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsDataResponseBody self = new DescribeMetricsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
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
