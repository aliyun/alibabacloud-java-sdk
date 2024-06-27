// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventLogPageResponseBody body;

    public static DescribeEventLogPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogPageResponse self = new DescribeEventLogPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventLogPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventLogPageResponse setBody(DescribeEventLogPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventLogPageResponseBody getBody() {
        return this.body;
    }

}
