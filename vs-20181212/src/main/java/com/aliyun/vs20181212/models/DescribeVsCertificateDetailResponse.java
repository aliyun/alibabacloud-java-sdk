// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsCertificateDetailResponse setBody(DescribeVsCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
