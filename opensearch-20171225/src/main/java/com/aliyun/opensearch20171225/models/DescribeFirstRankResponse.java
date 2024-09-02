// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeFirstRankResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFirstRankResponseBody body;

    public static DescribeFirstRankResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirstRankResponse self = new DescribeFirstRankResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFirstRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFirstRankResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFirstRankResponse setBody(DescribeFirstRankResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFirstRankResponseBody getBody() {
        return this.body;
    }

}
