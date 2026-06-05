// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyTasksResponseBody body;

    public static DescribeComfyTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTasksResponse self = new DescribeComfyTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyTasksResponse setBody(DescribeComfyTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyTasksResponseBody getBody() {
        return this.body;
    }

}
