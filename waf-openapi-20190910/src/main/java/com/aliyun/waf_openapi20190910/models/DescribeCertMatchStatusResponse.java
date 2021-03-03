// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertMatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertMatchStatusResponseBody body;

    public static DescribeCertMatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertMatchStatusResponse self = new DescribeCertMatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertMatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertMatchStatusResponse setBody(DescribeCertMatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertMatchStatusResponseBody getBody() {
        return this.body;
    }

}
