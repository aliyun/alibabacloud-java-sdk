// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoginBaseConfigsResponseBody body;

    public static DescribeLoginBaseConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginBaseConfigsResponse self = new DescribeLoginBaseConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoginBaseConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoginBaseConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoginBaseConfigsResponse setBody(DescribeLoginBaseConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoginBaseConfigsResponseBody getBody() {
        return this.body;
    }

}
