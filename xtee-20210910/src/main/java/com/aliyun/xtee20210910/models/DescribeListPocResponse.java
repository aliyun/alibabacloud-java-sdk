// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeListPocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListPocResponseBody body;

    public static DescribeListPocResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListPocResponse self = new DescribeListPocResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListPocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListPocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListPocResponse setBody(DescribeListPocResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListPocResponseBody getBody() {
        return this.body;
    }

}
