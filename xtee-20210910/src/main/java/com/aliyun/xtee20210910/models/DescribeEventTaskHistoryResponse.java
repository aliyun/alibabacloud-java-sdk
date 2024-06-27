// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTaskHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventTaskHistoryResponseBody body;

    public static DescribeEventTaskHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTaskHistoryResponse self = new DescribeEventTaskHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventTaskHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventTaskHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventTaskHistoryResponse setBody(DescribeEventTaskHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventTaskHistoryResponseBody getBody() {
        return this.body;
    }

}
