// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagListResponseBody body;

    public static DescribeTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagListResponse self = new DescribeTagListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagListResponse setBody(DescribeTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagListResponseBody getBody() {
        return this.body;
    }

}
