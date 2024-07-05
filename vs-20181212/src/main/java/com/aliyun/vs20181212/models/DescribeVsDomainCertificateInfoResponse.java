// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainCertificateInfoResponseBody body;

    public static DescribeVsDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainCertificateInfoResponse self = new DescribeVsDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainCertificateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainCertificateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainCertificateInfoResponse setBody(DescribeVsDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
