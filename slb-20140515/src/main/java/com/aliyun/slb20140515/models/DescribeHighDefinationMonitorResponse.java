// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHighDefinationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHighDefinationMonitorResponseBody body;

    public static DescribeHighDefinationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinationMonitorResponse self = new DescribeHighDefinationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighDefinationMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHighDefinationMonitorResponse setBody(DescribeHighDefinationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighDefinationMonitorResponseBody getBody() {
        return this.body;
    }

}
