// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadUrlResponseBody body;

    public static DescribeDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlResponse self = new DescribeDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadUrlResponse setBody(DescribeDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
