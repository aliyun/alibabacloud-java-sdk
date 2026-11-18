// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class DescribeWarmPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWarmPoolResponseBody body;

    public static DescribeWarmPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarmPoolResponse self = new DescribeWarmPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWarmPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWarmPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWarmPoolResponse setBody(DescribeWarmPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarmPoolResponseBody getBody() {
        return this.body;
    }

}
