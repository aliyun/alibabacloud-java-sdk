// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallbacksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCallbacksResponseBody body;

    public static DescribeCallbacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallbacksResponse self = new DescribeCallbacksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallbacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallbacksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallbacksResponse setBody(DescribeCallbacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallbacksResponseBody getBody() {
        return this.body;
    }

}
