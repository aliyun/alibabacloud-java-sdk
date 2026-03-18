// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeSystemTimezoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemTimezoneResponseBody body;

    public static DescribeSystemTimezoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemTimezoneResponse self = new DescribeSystemTimezoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemTimezoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemTimezoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemTimezoneResponse setBody(DescribeSystemTimezoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemTimezoneResponseBody getBody() {
        return this.body;
    }

}
