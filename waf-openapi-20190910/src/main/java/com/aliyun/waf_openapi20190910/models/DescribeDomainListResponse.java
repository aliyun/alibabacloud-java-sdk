// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainListResponseBody body;

    public static DescribeDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListResponse self = new DescribeDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainListResponse setBody(DescribeDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainListResponseBody getBody() {
        return this.body;
    }

}
