// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceListResponseBody body;

    public static DescribeServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceListResponse self = new DescribeServiceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceListResponse setBody(DescribeServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceListResponseBody getBody() {
        return this.body;
    }

}
