// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNamespaceResponseBody body;

    public static DescribeNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponse self = new DescribeNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceResponse setBody(DescribeNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceResponseBody getBody() {
        return this.body;
    }

}
