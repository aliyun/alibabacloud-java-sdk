// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeScheduledTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduledTaskResponseBody body;

    public static DescribeScheduledTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTaskResponse self = new DescribeScheduledTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduledTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScheduledTaskResponse setBody(DescribeScheduledTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduledTaskResponseBody getBody() {
        return this.body;
    }

}
