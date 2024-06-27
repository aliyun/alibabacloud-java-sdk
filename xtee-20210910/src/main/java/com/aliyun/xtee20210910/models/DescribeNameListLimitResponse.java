// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListLimitResponseBody body;

    public static DescribeNameListLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListLimitResponse self = new DescribeNameListLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListLimitResponse setBody(DescribeNameListLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListLimitResponseBody getBody() {
        return this.body;
    }

}
