// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterTemplatesResponseBody body;

    public static DescribeParameterTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponse self = new DescribeParameterTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterTemplatesResponse setBody(DescribeParameterTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterTemplatesResponseBody getBody() {
        return this.body;
    }

}
