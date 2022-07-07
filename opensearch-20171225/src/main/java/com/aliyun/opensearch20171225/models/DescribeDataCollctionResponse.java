// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeDataCollctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataCollctionResponseBody body;

    public static DescribeDataCollctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCollctionResponse self = new DescribeDataCollctionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCollctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCollctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataCollctionResponse setBody(DescribeDataCollctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCollctionResponseBody getBody() {
        return this.body;
    }

}
