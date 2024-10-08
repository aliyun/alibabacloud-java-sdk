// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppResponseBody body;

    public static DescribeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponse self = new DescribeAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppResponse setBody(DescribeAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppResponseBody getBody() {
        return this.body;
    }

}
