// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHistoryEventsResponseBody body;

    public static DescribeHistoryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryEventsResponse self = new DescribeHistoryEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryEventsResponse setBody(DescribeHistoryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryEventsResponseBody getBody() {
        return this.body;
    }

}
