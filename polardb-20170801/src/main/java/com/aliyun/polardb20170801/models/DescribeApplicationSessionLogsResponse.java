// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSessionLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationSessionLogsResponseBody body;

    public static DescribeApplicationSessionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSessionLogsResponse self = new DescribeApplicationSessionLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSessionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationSessionLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationSessionLogsResponse setBody(DescribeApplicationSessionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationSessionLogsResponseBody getBody() {
        return this.body;
    }

}
