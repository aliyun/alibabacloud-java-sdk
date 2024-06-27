// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListDownloadUrlResponseBody body;

    public static DescribeNameListDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListDownloadUrlResponse self = new DescribeNameListDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListDownloadUrlResponse setBody(DescribeNameListDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
