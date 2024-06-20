// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSlsLogStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecSlsLogStoresResponseBody body;

    public static DescribeApisecSlsLogStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSlsLogStoresResponse self = new DescribeApisecSlsLogStoresResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSlsLogStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecSlsLogStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecSlsLogStoresResponse setBody(DescribeApisecSlsLogStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecSlsLogStoresResponseBody getBody() {
        return this.body;
    }

}
