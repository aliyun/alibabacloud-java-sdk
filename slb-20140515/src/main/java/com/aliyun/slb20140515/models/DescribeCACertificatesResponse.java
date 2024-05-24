// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeCACertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCACertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCACertificatesResponse setBody(DescribeCACertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCACertificatesResponseBody getBody() {
        return this.body;
    }

}
