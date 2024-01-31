// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventLevelCountResponseBody body;

    public static DescribeEventLevelCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLevelCountResponse self = new DescribeEventLevelCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventLevelCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventLevelCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventLevelCountResponse setBody(DescribeEventLevelCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventLevelCountResponseBody getBody() {
        return this.body;
    }

}
