// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSlsLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsLogStoreResponseBody body;

    public static DescribeSlsLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogStoreResponse self = new DescribeSlsLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsLogStoreResponse setBody(DescribeSlsLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsLogStoreResponseBody getBody() {
        return this.body;
    }

}
