// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppMonitorMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppMonitorMetricResponseBody body;

    public static DescribeAppMonitorMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppMonitorMetricResponse self = new DescribeAppMonitorMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppMonitorMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppMonitorMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppMonitorMetricResponse setBody(DescribeAppMonitorMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppMonitorMetricResponseBody getBody() {
        return this.body;
    }

}
