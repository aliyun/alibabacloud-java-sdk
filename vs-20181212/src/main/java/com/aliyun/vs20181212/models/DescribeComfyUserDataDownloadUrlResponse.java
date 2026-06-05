// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComfyUserDataDownloadUrlResponseBody body;

    public static DescribeComfyUserDataDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataDownloadUrlResponse self = new DescribeComfyUserDataDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComfyUserDataDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComfyUserDataDownloadUrlResponse setBody(DescribeComfyUserDataDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComfyUserDataDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
