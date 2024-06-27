// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeByPassShuntEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeByPassShuntEventResponseBody body;

    public static DescribeByPassShuntEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeByPassShuntEventResponse self = new DescribeByPassShuntEventResponse();
        return TeaModel.build(map, self);
    }

    public DescribeByPassShuntEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeByPassShuntEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeByPassShuntEventResponse setBody(DescribeByPassShuntEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeByPassShuntEventResponseBody getBody() {
        return this.body;
    }

}
