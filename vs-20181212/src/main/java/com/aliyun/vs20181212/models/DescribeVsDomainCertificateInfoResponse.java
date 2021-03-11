// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainCertificateInfoResponse setBody(DescribeVsDomainCertificateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainCertificateInfoResponseBody getBody() {
        return this.body;
    }

}
