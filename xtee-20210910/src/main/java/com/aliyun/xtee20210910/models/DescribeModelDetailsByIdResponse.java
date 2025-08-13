// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeModelDetailsByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelDetailsByIdResponseBody body;

    public static DescribeModelDetailsByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelDetailsByIdResponse self = new DescribeModelDetailsByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelDetailsByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelDetailsByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelDetailsByIdResponse setBody(DescribeModelDetailsByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelDetailsByIdResponseBody getBody() {
        return this.body;
    }

}
