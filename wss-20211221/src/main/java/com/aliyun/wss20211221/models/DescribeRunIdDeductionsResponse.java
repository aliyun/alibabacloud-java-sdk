// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeRunIdDeductionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRunIdDeductionsResponseBody body;

    public static DescribeRunIdDeductionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunIdDeductionsResponse self = new DescribeRunIdDeductionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRunIdDeductionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRunIdDeductionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRunIdDeductionsResponse setBody(DescribeRunIdDeductionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRunIdDeductionsResponseBody getBody() {
        return this.body;
    }

}
