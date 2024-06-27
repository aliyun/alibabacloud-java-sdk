// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeResultCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResultCountResponseBody body;

    public static DescribeResultCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultCountResponse self = new DescribeResultCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResultCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResultCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResultCountResponse setBody(DescribeResultCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResultCountResponseBody getBody() {
        return this.body;
    }

}
