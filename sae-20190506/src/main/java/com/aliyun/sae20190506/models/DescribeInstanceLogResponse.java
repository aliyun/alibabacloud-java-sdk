// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceLogResponseBody body;

    public static DescribeInstanceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogResponse self = new DescribeInstanceLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceLogResponse setBody(DescribeInstanceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceLogResponseBody getBody() {
        return this.body;
    }

}
