// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationConfigResponseBody body;

    public static DescribeApplicationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigResponse self = new DescribeApplicationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationConfigResponse setBody(DescribeApplicationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationConfigResponseBody getBody() {
        return this.body;
    }

}
