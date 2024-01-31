// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAutoDelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAutoDelConfigResponseBody body;

    public static DescribeAutoDelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoDelConfigResponse self = new DescribeAutoDelConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoDelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoDelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoDelConfigResponse setBody(DescribeAutoDelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoDelConfigResponseBody getBody() {
        return this.body;
    }

}
