// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableFeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableFeeResponseBody body;

    public static DescribeVariableFeeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableFeeResponse self = new DescribeVariableFeeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableFeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableFeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableFeeResponse setBody(DescribeVariableFeeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableFeeResponseBody getBody() {
        return this.body;
    }

}
