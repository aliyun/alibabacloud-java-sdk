// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationStatusResponseBody body;

    public static DescribeApplicationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatusResponse self = new DescribeApplicationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationStatusResponse setBody(DescribeApplicationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationStatusResponseBody getBody() {
        return this.body;
    }

}
