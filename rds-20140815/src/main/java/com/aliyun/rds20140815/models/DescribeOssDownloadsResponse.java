// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeOssDownloadsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssDownloadsResponseBody body;

    public static DescribeOssDownloadsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssDownloadsResponse self = new DescribeOssDownloadsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssDownloadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssDownloadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssDownloadsResponse setBody(DescribeOssDownloadsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssDownloadsResponseBody getBody() {
        return this.body;
    }

}
