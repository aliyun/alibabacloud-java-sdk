// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenOssUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenOssUploadInfoResponseBody body;

    public static DescribeScreenOssUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenOssUploadInfoResponse self = new DescribeScreenOssUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenOssUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenOssUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenOssUploadInfoResponse setBody(DescribeScreenOssUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenOssUploadInfoResponseBody getBody() {
        return this.body;
    }

}
