// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProxyServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProxyServiceResponseBody body;

    public static DescribeProxyServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProxyServiceResponse self = new DescribeProxyServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProxyServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProxyServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProxyServiceResponse setBody(DescribeProxyServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProxyServiceResponseBody getBody() {
        return this.body;
    }

}
