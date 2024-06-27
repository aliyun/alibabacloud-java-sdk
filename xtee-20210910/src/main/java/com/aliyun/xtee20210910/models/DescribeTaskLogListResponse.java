// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskLogListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskLogListResponseBody body;

    public static DescribeTaskLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskLogListResponse self = new DescribeTaskLogListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskLogListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskLogListResponse setBody(DescribeTaskLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskLogListResponseBody getBody() {
        return this.body;
    }

}
