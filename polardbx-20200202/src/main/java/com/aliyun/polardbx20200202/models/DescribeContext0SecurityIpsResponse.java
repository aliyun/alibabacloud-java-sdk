// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeContext0SecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContext0SecurityIpsResponseBody body;

    public static DescribeContext0SecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContext0SecurityIpsResponse self = new DescribeContext0SecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContext0SecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContext0SecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContext0SecurityIpsResponse setBody(DescribeContext0SecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContext0SecurityIpsResponseBody getBody() {
        return this.body;
    }

}
