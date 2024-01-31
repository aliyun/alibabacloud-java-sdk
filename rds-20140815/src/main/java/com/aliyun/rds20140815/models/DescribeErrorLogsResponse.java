// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeErrorLogsResponseBody body;

    public static DescribeErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponse self = new DescribeErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeErrorLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeErrorLogsResponse setBody(DescribeErrorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeErrorLogsResponseBody getBody() {
        return this.body;
    }

}
