// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSlsProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecSlsProjectsResponseBody body;

    public static DescribeApisecSlsProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSlsProjectsResponse self = new DescribeApisecSlsProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSlsProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecSlsProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecSlsProjectsResponse setBody(DescribeApisecSlsProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecSlsProjectsResponseBody getBody() {
        return this.body;
    }

}
