// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExistNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExistNameResponseBody body;

    public static DescribeExistNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExistNameResponse self = new DescribeExistNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExistNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExistNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExistNameResponse setBody(DescribeExistNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExistNameResponseBody getBody() {
        return this.body;
    }

}
