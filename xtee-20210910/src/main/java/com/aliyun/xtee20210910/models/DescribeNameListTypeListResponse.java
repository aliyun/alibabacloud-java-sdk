// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListTypeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListTypeListResponseBody body;

    public static DescribeNameListTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListTypeListResponse self = new DescribeNameListTypeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListTypeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListTypeListResponse setBody(DescribeNameListTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListTypeListResponseBody getBody() {
        return this.body;
    }

}
