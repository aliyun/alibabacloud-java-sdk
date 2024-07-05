// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplatesResponseBody body;

    public static DescribeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponse self = new DescribeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplatesResponse setBody(DescribeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplatesResponseBody getBody() {
        return this.body;
    }

}
