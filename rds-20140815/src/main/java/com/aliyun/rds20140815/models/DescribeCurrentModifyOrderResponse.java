// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCurrentModifyOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCurrentModifyOrderResponseBody body;

    public static DescribeCurrentModifyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCurrentModifyOrderResponse self = new DescribeCurrentModifyOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCurrentModifyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCurrentModifyOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCurrentModifyOrderResponse setBody(DescribeCurrentModifyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCurrentModifyOrderResponseBody getBody() {
        return this.body;
    }

}
