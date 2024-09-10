// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttestorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttestorsResponseBody body;

    public static DescribeAttestorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttestorsResponse self = new DescribeAttestorsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttestorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttestorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttestorsResponse setBody(DescribeAttestorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttestorsResponseBody getBody() {
        return this.body;
    }

}
