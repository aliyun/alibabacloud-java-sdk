// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeQueryProcessorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQueryProcessorResponseBody body;

    public static DescribeQueryProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryProcessorResponse self = new DescribeQueryProcessorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQueryProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQueryProcessorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQueryProcessorResponse setBody(DescribeQueryProcessorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQueryProcessorResponseBody getBody() {
        return this.body;
    }

}
