// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoDetailListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageRepoDetailListResponseBody body;

    public static DescribeImageRepoDetailListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoDetailListResponse self = new DescribeImageRepoDetailListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoDetailListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageRepoDetailListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageRepoDetailListResponse setBody(DescribeImageRepoDetailListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageRepoDetailListResponseBody getBody() {
        return this.body;
    }

}
