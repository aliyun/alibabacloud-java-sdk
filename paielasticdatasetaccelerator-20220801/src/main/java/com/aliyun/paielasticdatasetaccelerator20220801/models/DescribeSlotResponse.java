// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeSlotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlotResponseBody body;

    public static DescribeSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlotResponse self = new DescribeSlotResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlotResponse setBody(DescribeSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlotResponseBody getBody() {
        return this.body;
    }

}
