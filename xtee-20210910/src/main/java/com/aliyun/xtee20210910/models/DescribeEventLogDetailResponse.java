// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventLogDetailResponseBody body;

    public static DescribeEventLogDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogDetailResponse self = new DescribeEventLogDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventLogDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventLogDetailResponse setBody(DescribeEventLogDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventLogDetailResponseBody getBody() {
        return this.body;
    }

}
