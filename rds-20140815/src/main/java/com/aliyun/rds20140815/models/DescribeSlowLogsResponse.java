// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowLogsResponseBody body;

    public static DescribeSlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponse self = new DescribeSlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowLogsResponse setBody(DescribeSlowLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogsResponseBody getBody() {
        return this.body;
    }

}
