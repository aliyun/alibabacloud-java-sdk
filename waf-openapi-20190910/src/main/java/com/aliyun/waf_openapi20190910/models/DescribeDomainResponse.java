// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainResponseBody body;

    public static DescribeDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponse self = new DescribeDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResponse setBody(DescribeDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResponseBody getBody() {
        return this.body;
    }

}
