// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeClassListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClassListResponseBody body;

    public static DescribeClassListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassListResponse self = new DescribeClassListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClassListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClassListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClassListResponse setBody(DescribeClassListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClassListResponseBody getBody() {
        return this.body;
    }

}
