// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainBasicConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainBasicConfigsResponseBody body;

    public static DescribeDomainBasicConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBasicConfigsResponse self = new DescribeDomainBasicConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBasicConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBasicConfigsResponse setBody(DescribeDomainBasicConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBasicConfigsResponseBody getBody() {
        return this.body;
    }

}
