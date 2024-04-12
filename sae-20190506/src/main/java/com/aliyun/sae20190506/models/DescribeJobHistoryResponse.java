// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobHistoryResponseBody body;

    public static DescribeJobHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobHistoryResponse self = new DescribeJobHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobHistoryResponse setBody(DescribeJobHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobHistoryResponseBody getBody() {
        return this.body;
    }

}
