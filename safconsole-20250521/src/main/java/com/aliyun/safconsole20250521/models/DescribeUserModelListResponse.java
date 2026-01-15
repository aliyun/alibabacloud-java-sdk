// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeUserModelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserModelListResponseBody body;

    public static DescribeUserModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserModelListResponse self = new DescribeUserModelListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserModelListResponse setBody(DescribeUserModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserModelListResponseBody getBody() {
        return this.body;
    }

}
