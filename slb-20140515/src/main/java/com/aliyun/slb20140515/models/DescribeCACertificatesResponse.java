// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCACertificatesResponseBody body;

    public static DescribeCACertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificatesResponse self = new DescribeCACertificatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCACertificatesResponse setBody(DescribeCACertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificatesResponseBody getBody() {
        return this.body;
    }

}
