// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChangeLogsResponseBody body;

    public static DescribeChangeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeLogsResponse self = new DescribeChangeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChangeLogsResponse setBody(DescribeChangeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangeLogsResponseBody getBody() {
        return this.body;
    }

}
