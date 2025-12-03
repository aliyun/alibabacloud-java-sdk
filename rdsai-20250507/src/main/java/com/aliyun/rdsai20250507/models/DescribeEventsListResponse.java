// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEventsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventsListResponseBody body;

    public static DescribeEventsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsListResponse self = new DescribeEventsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventsListResponse setBody(DescribeEventsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventsListResponseBody getBody() {
        return this.body;
    }

}
