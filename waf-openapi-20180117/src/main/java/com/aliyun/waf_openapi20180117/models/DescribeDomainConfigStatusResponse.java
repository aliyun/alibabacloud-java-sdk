// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeDomainConfigStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainConfigStatusResponseBody body;

    public static DescribeDomainConfigStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainConfigStatusResponse self = new DescribeDomainConfigStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainConfigStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainConfigStatusResponse setBody(DescribeDomainConfigStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainConfigStatusResponseBody getBody() {
        return this.body;
    }

}
