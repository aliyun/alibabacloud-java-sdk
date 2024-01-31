// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllEntityResponseBody body;

    public static DescribeAllEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEntityResponse self = new DescribeAllEntityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllEntityResponse setBody(DescribeAllEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllEntityResponseBody getBody() {
        return this.body;
    }

}
