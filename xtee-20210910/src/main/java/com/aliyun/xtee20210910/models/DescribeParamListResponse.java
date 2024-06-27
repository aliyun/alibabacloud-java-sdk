// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParamListResponseBody body;

    public static DescribeParamListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParamListResponse self = new DescribeParamListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParamListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParamListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParamListResponse setBody(DescribeParamListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParamListResponseBody getBody() {
        return this.body;
    }

}
