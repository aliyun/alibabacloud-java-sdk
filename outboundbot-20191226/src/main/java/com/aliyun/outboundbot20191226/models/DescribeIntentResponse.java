// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIntentResponseBody body;

    public static DescribeIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponse self = new DescribeIntentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIntentResponse setBody(DescribeIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIntentResponseBody getBody() {
        return this.body;
    }

}
