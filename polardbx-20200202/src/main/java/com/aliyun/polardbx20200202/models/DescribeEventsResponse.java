// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventsResponseBody body;

    public static DescribeEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsResponse self = new DescribeEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventsResponse setBody(DescribeEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventsResponseBody getBody() {
        return this.body;
    }

}
