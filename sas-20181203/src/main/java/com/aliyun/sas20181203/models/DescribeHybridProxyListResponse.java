// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridProxyListResponseBody body;

    public static DescribeHybridProxyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyListResponse self = new DescribeHybridProxyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridProxyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridProxyListResponse setBody(DescribeHybridProxyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridProxyListResponseBody getBody() {
        return this.body;
    }

}
