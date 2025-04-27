// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceHistoryEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceHistoryEventsResponseBody body;

    public static DescribeRCInstanceHistoryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceHistoryEventsResponse self = new DescribeRCInstanceHistoryEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceHistoryEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceHistoryEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceHistoryEventsResponse setBody(DescribeRCInstanceHistoryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceHistoryEventsResponseBody getBody() {
        return this.body;
    }

}
