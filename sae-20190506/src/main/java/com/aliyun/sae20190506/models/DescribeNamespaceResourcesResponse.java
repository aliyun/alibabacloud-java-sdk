// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNamespaceResourcesResponseBody body;

    public static DescribeNamespaceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResourcesResponse self = new DescribeNamespaceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespaceResourcesResponse setBody(DescribeNamespaceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceResourcesResponseBody getBody() {
        return this.body;
    }

}
