// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVersionConfigResponseBody body;

    public static DescribeVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigResponse self = new DescribeVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVersionConfigResponse setBody(DescribeVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVersionConfigResponseBody getBody() {
        return this.body;
    }

}
