// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyUserDatasResponseBody body;

    public static DescribeComfyUserDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDatasResponse self = new DescribeComfyUserDatasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyUserDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyUserDatasResponse setBody(DescribeComfyUserDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyUserDatasResponseBody getBody() {
        return this.body;
    }

}
