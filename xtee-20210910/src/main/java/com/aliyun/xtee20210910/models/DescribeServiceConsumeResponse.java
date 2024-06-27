// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceConsumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceConsumeResponseBody body;

    public static DescribeServiceConsumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceConsumeResponse self = new DescribeServiceConsumeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceConsumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceConsumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceConsumeResponse setBody(DescribeServiceConsumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceConsumeResponseBody getBody() {
        return this.body;
    }

}
