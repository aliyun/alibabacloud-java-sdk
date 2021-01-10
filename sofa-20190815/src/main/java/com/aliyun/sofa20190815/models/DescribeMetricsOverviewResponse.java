// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeMetricsOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricsOverviewResponseBody body;

    public static DescribeMetricsOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsOverviewResponse self = new DescribeMetricsOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricsOverviewResponse setBody(DescribeMetricsOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricsOverviewResponseBody getBody() {
        return this.body;
    }

}
