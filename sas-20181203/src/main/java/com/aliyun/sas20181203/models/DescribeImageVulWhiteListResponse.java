// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageVulWhiteListResponseBody body;

    public static DescribeImageVulWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulWhiteListResponse self = new DescribeImageVulWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageVulWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageVulWhiteListResponse setBody(DescribeImageVulWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageVulWhiteListResponseBody getBody() {
        return this.body;
    }

}
