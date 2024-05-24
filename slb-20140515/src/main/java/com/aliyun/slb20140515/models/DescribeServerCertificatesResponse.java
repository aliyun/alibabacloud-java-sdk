// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServerCertificatesResponseBody body;

    public static DescribeServerCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerCertificatesResponse self = new DescribeServerCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServerCertificatesResponse setBody(DescribeServerCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerCertificatesResponseBody getBody() {
        return this.body;
    }

}
