// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGroupExecutingInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupExecutingInfoResponseBody body;

    public static DescribeGroupExecutingInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupExecutingInfoResponse self = new DescribeGroupExecutingInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupExecutingInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupExecutingInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupExecutingInfoResponse setBody(DescribeGroupExecutingInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupExecutingInfoResponseBody getBody() {
        return this.body;
    }

}
