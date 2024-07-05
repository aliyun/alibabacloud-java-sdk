// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTemplateResponseBody body;

    public static DescribeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResponse self = new DescribeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTemplateResponse setBody(DescribeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateResponseBody getBody() {
        return this.body;
    }

}
