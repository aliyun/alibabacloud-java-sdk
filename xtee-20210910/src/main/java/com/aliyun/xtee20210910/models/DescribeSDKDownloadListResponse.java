// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSDKDownloadListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSDKDownloadListResponseBody body;

    public static DescribeSDKDownloadListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKDownloadListResponse self = new DescribeSDKDownloadListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDKDownloadListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDKDownloadListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSDKDownloadListResponse setBody(DescribeSDKDownloadListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDKDownloadListResponseBody getBody() {
        return this.body;
    }

}
