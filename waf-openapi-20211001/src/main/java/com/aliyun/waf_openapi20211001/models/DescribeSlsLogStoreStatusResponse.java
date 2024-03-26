// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSlsLogStoreStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsLogStoreStatusResponseBody body;

    public static DescribeSlsLogStoreStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogStoreStatusResponse self = new DescribeSlsLogStoreStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogStoreStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsLogStoreStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsLogStoreStatusResponse setBody(DescribeSlsLogStoreStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsLogStoreStatusResponseBody getBody() {
        return this.body;
    }

}
