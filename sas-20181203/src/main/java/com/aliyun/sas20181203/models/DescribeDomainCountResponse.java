// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainCountResponseBody body;

    public static DescribeDomainCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCountResponse self = new DescribeDomainCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCountResponse setBody(DescribeDomainCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCountResponseBody getBody() {
        return this.body;
    }

}
