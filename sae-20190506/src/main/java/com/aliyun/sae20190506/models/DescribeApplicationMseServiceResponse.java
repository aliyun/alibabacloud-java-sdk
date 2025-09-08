// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationMseServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationMseServiceResponseBody body;

    public static DescribeApplicationMseServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationMseServiceResponse self = new DescribeApplicationMseServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationMseServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationMseServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationMseServiceResponse setBody(DescribeApplicationMseServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationMseServiceResponseBody getBody() {
        return this.body;
    }

}
