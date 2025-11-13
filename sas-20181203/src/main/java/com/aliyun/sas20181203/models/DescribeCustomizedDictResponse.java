// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomizedDictResponseBody body;

    public static DescribeCustomizedDictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictResponse self = new DescribeCustomizedDictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomizedDictResponse setBody(DescribeCustomizedDictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomizedDictResponseBody getBody() {
        return this.body;
    }

}
