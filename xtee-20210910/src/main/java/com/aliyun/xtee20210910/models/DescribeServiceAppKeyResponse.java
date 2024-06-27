// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceAppKeyResponseBody body;

    public static DescribeServiceAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAppKeyResponse self = new DescribeServiceAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceAppKeyResponse setBody(DescribeServiceAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceAppKeyResponseBody getBody() {
        return this.body;
    }

}
