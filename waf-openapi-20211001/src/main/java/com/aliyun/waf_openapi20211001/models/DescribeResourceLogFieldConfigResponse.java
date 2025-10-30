// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogFieldConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceLogFieldConfigResponseBody body;

    public static DescribeResourceLogFieldConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogFieldConfigResponse self = new DescribeResourceLogFieldConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogFieldConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceLogFieldConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceLogFieldConfigResponse setBody(DescribeResourceLogFieldConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceLogFieldConfigResponseBody getBody() {
        return this.body;
    }

}
