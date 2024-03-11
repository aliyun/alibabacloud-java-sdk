// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCallUserListResponseBody body;

    public static DescribeCallUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserListResponse self = new DescribeCallUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCallUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCallUserListResponse setBody(DescribeCallUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCallUserListResponseBody getBody() {
        return this.body;
    }

}
