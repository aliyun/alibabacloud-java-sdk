// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsCertificateDetailResponseBody body;

    public static DescribeVsCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateDetailResponse self = new DescribeVsCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsCertificateDetailResponse setBody(DescribeVsCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
