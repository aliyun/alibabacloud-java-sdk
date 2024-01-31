// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageInfoListResponseBody body;

    public static DescribeImageInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfoListResponse self = new DescribeImageInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageInfoListResponse setBody(DescribeImageInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageInfoListResponseBody getBody() {
        return this.body;
    }

}
