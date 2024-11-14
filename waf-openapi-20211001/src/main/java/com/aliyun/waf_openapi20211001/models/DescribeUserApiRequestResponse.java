// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserApiRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserApiRequestResponseBody body;

    public static DescribeUserApiRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserApiRequestResponse self = new DescribeUserApiRequestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserApiRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserApiRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserApiRequestResponse setBody(DescribeUserApiRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserApiRequestResponseBody getBody() {
        return this.body;
    }

}
