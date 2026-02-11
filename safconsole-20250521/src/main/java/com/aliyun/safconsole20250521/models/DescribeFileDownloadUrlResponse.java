// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFileDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFileDownloadUrlResponseBody body;

    public static DescribeFileDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileDownloadUrlResponse self = new DescribeFileDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFileDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFileDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFileDownloadUrlResponse setBody(DescribeFileDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFileDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
