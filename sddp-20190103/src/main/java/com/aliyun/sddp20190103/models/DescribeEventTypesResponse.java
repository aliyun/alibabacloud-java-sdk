// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventTypesResponseBody body;

    public static DescribeEventTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTypesResponse self = new DescribeEventTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventTypesResponse setBody(DescribeEventTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventTypesResponseBody getBody() {
        return this.body;
    }

}
