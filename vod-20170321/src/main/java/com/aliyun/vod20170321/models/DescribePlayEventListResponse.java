// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlayEventListResponseBody body;

    public static DescribePlayEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayEventListResponse self = new DescribePlayEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayEventListResponse setBody(DescribePlayEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayEventListResponseBody getBody() {
        return this.body;
    }

}
