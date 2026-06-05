// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyUserDataUploadUrlResponseBody body;

    public static DescribeComfyUserDataUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataUploadUrlResponse self = new DescribeComfyUserDataUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyUserDataUploadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyUserDataUploadUrlResponse setBody(DescribeComfyUserDataUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyUserDataUploadUrlResponseBody getBody() {
        return this.body;
    }

}
