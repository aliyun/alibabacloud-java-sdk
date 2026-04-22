// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationLogsResponseBody body;

    public static DescribeApplicationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationLogsResponse self = new DescribeApplicationLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationLogsResponse setBody(DescribeApplicationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationLogsResponseBody getBody() {
        return this.body;
    }

}
