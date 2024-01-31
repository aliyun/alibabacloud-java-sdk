// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCallResponseBody body;

    public static DescribeCallResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallResponse self = new DescribeCallResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallResponse setBody(DescribeCallResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallResponseBody getBody() {
        return this.body;
    }

}
