// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainTrafficDataResponseBody body;

    public static DescribeScdnDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTrafficDataResponse self = new DescribeScdnDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainTrafficDataResponse setBody(DescribeScdnDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
