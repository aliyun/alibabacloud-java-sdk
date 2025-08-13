// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeListModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeListModelResponseBody body;

    public static DescribeListModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeListModelResponse self = new DescribeListModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeListModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeListModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeListModelResponse setBody(DescribeListModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeListModelResponseBody getBody() {
        return this.body;
    }

}
