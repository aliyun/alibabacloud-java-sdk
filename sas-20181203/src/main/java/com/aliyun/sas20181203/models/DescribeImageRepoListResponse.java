// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageRepoListResponseBody body;

    public static DescribeImageRepoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoListResponse self = new DescribeImageRepoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageRepoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageRepoListResponse setBody(DescribeImageRepoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageRepoListResponseBody getBody() {
        return this.body;
    }

}
