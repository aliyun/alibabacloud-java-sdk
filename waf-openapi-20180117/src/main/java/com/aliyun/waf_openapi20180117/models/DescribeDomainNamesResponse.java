// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainNamesResponseBody body;

    public static DescribeDomainNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNamesResponse self = new DescribeDomainNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainNamesResponse setBody(DescribeDomainNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainNamesResponseBody getBody() {
        return this.body;
    }

}
