// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModelServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelServicesResponseBody body;

    public static DescribeModelServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServicesResponse self = new DescribeModelServicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelServicesResponse setBody(DescribeModelServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelServicesResponseBody getBody() {
        return this.body;
    }

}
