// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyWorkflowsResponseBody body;

    public static DescribeComfyWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyWorkflowsResponse self = new DescribeComfyWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyWorkflowsResponse setBody(DescribeComfyWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyWorkflowsResponseBody getBody() {
        return this.body;
    }

}
