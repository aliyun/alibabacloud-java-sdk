// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserTrafficResponseBody body;

    public static DescribeUserTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTrafficResponse self = new DescribeUserTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserTrafficResponse setBody(DescribeUserTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserTrafficResponseBody getBody() {
        return this.body;
    }

}
