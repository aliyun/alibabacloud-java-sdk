// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeUserProduceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserProduceResponseBody body;

    public static DescribeUserProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProduceResponse self = new DescribeUserProduceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserProduceResponse setBody(DescribeUserProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserProduceResponseBody getBody() {
        return this.body;
    }

}
