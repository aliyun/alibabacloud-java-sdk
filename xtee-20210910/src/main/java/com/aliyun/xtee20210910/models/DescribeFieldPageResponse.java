// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFieldPageResponseBody body;

    public static DescribeFieldPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldPageResponse self = new DescribeFieldPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFieldPageResponse setBody(DescribeFieldPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldPageResponseBody getBody() {
        return this.body;
    }

}
