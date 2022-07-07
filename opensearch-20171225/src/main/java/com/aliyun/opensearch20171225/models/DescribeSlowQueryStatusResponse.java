// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowQueryStatusResponseBody body;

    public static DescribeSlowQueryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryStatusResponse self = new DescribeSlowQueryStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowQueryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowQueryStatusResponse setBody(DescribeSlowQueryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowQueryStatusResponseBody getBody() {
        return this.body;
    }

}
