// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertificatesResponseBody body;

    public static DescribeCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatesResponse self = new DescribeCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertificatesResponse setBody(DescribeCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertificatesResponseBody getBody() {
        return this.body;
    }

}
