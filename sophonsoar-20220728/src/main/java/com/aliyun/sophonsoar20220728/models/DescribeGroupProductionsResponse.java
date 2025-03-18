// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeGroupProductionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupProductionsResponseBody body;

    public static DescribeGroupProductionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupProductionsResponse self = new DescribeGroupProductionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupProductionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupProductionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupProductionsResponse setBody(DescribeGroupProductionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupProductionsResponseBody getBody() {
        return this.body;
    }

}
