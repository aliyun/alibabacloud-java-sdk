// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeApiListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiListResponseBody body;

    public static DescribeApiListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiListResponse self = new DescribeApiListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiListResponse setBody(DescribeApiListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiListResponseBody getBody() {
        return this.body;
    }

}
