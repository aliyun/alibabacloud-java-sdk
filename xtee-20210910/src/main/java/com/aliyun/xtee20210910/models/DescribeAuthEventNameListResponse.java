// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthEventNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthEventNameListResponseBody body;

    public static DescribeAuthEventNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthEventNameListResponse self = new DescribeAuthEventNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthEventNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthEventNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthEventNameListResponse setBody(DescribeAuthEventNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthEventNameListResponseBody getBody() {
        return this.body;
    }

}
