// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMarkPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMarkPageResponseBody body;

    public static DescribeMarkPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarkPageResponse self = new DescribeMarkPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMarkPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMarkPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMarkPageResponse setBody(DescribeMarkPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMarkPageResponseBody getBody() {
        return this.body;
    }

}
