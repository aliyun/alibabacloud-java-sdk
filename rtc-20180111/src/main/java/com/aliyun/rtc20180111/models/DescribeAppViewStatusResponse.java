// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppViewStatusResponseBody body;

    public static DescribeAppViewStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewStatusResponse self = new DescribeAppViewStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppViewStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppViewStatusResponse setBody(DescribeAppViewStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppViewStatusResponseBody getBody() {
        return this.body;
    }

}
