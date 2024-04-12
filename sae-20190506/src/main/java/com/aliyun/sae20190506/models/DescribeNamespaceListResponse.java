// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNamespaceListResponseBody body;

    public static DescribeNamespaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListResponse self = new DescribeNamespaceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespaceListResponse setBody(DescribeNamespaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceListResponseBody getBody() {
        return this.body;
    }

}
