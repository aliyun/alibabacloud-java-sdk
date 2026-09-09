// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTaskWaitingQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyTaskWaitingQueueResponseBody body;

    public static DescribeComfyTaskWaitingQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTaskWaitingQueueResponse self = new DescribeComfyTaskWaitingQueueResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTaskWaitingQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyTaskWaitingQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyTaskWaitingQueueResponse setBody(DescribeComfyTaskWaitingQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyTaskWaitingQueueResponseBody getBody() {
        return this.body;
    }

}
