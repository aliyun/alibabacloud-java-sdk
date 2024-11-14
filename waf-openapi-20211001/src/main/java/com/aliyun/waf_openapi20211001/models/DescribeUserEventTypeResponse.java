// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserEventTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserEventTypeResponseBody body;

    public static DescribeUserEventTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEventTypeResponse self = new DescribeUserEventTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserEventTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserEventTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserEventTypeResponse setBody(DescribeUserEventTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserEventTypeResponseBody getBody() {
        return this.body;
    }

}
