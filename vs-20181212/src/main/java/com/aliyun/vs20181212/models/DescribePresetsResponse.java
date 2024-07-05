// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribePresetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePresetsResponseBody body;

    public static DescribePresetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePresetsResponse self = new DescribePresetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePresetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePresetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePresetsResponse setBody(DescribePresetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePresetsResponseBody getBody() {
        return this.body;
    }

}
