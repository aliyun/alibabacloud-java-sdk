// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHALogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHALogsResponseBody body;

    public static DescribeHALogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHALogsResponse self = new DescribeHALogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHALogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHALogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHALogsResponse setBody(DescribeHALogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHALogsResponseBody getBody() {
        return this.body;
    }

}
