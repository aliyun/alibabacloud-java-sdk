// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSensitiveFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageSensitiveFileListResponseBody body;

    public static DescribeImageSensitiveFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSensitiveFileListResponse self = new DescribeImageSensitiveFileListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSensitiveFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSensitiveFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageSensitiveFileListResponse setBody(DescribeImageSensitiveFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSensitiveFileListResponseBody getBody() {
        return this.body;
    }

}
