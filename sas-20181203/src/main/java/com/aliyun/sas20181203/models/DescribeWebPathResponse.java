// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebPathResponseBody body;

    public static DescribeWebPathResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPathResponse self = new DescribeWebPathResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebPathResponse setBody(DescribeWebPathResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebPathResponseBody getBody() {
        return this.body;
    }

}
