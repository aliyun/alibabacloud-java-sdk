// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskListResponseBody body;

    public static DescribeTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskListResponse self = new DescribeTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskListResponse setBody(DescribeTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskListResponseBody getBody() {
        return this.body;
    }

}
