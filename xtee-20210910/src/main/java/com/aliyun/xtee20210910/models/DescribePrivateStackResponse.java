// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePrivateStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateStackResponseBody body;

    public static DescribePrivateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateStackResponse self = new DescribePrivateStackResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateStackResponse setBody(DescribePrivateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateStackResponseBody getBody() {
        return this.body;
    }

}
