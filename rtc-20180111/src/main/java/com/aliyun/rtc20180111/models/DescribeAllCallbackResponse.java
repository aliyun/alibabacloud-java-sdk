// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAllCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllCallbackResponseBody body;

    public static DescribeAllCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllCallbackResponse self = new DescribeAllCallbackResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllCallbackResponse setBody(DescribeAllCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllCallbackResponseBody getBody() {
        return this.body;
    }

}
