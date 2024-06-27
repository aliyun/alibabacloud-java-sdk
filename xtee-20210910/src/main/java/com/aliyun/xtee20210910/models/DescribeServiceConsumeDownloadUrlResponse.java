// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceConsumeDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceConsumeDownloadUrlResponseBody body;

    public static DescribeServiceConsumeDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceConsumeDownloadUrlResponse self = new DescribeServiceConsumeDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceConsumeDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceConsumeDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceConsumeDownloadUrlResponse setBody(DescribeServiceConsumeDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceConsumeDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
