// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVisitTopIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVisitTopIpResponseBody body;

    public static DescribeVisitTopIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisitTopIpResponse self = new DescribeVisitTopIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVisitTopIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVisitTopIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVisitTopIpResponse setBody(DescribeVisitTopIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVisitTopIpResponseBody getBody() {
        return this.body;
    }

}
