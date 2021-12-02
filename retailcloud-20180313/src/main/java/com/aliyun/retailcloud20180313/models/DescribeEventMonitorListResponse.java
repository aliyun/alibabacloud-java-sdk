// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEventMonitorListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEventMonitorListResponseBody body;

    public static DescribeEventMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventMonitorListResponse self = new DescribeEventMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventMonitorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventMonitorListResponse setBody(DescribeEventMonitorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventMonitorListResponseBody getBody() {
        return this.body;
    }

}
