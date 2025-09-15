// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserLogFieldConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserLogFieldConfigResponseBody body;

    public static DescribeUserLogFieldConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogFieldConfigResponse self = new DescribeUserLogFieldConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogFieldConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogFieldConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLogFieldConfigResponse setBody(DescribeUserLogFieldConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogFieldConfigResponseBody getBody() {
        return this.body;
    }

}
