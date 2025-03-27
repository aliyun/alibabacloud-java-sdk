// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityEventLogsResponseBody body;

    public static DescribeSecurityEventLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventLogsResponse self = new DescribeSecurityEventLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventLogsResponse setBody(DescribeSecurityEventLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventLogsResponseBody getBody() {
        return this.body;
    }

}
