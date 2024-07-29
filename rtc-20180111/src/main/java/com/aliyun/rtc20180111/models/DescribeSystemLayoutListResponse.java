// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeSystemLayoutListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemLayoutListResponseBody body;

    public static DescribeSystemLayoutListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLayoutListResponse self = new DescribeSystemLayoutListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLayoutListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemLayoutListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemLayoutListResponse setBody(DescribeSystemLayoutListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemLayoutListResponseBody getBody() {
        return this.body;
    }

}
