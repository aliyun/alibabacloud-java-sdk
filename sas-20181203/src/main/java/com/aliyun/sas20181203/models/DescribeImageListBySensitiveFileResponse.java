// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListBySensitiveFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageListBySensitiveFileResponseBody body;

    public static DescribeImageListBySensitiveFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListBySensitiveFileResponse self = new DescribeImageListBySensitiveFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageListBySensitiveFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageListBySensitiveFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageListBySensitiveFileResponse setBody(DescribeImageListBySensitiveFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageListBySensitiveFileResponseBody getBody() {
        return this.body;
    }

}
