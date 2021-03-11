// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsCertificateListResponse setBody(DescribeVsCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsCertificateListResponseBody getBody() {
        return this.body;
    }

}
