// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsCertificateListResponseBody body;

    public static DescribeVsCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateListResponse self = new DescribeVsCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsCertificateListResponse setBody(DescribeVsCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsCertificateListResponseBody getBody() {
        return this.body;
    }

}
