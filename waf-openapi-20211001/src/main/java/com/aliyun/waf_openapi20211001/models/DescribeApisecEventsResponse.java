// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecEventsResponseBody body;

    public static DescribeApisecEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventsResponse self = new DescribeApisecEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecEventsResponse setBody(DescribeApisecEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecEventsResponseBody getBody() {
        return this.body;
    }

}
