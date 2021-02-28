// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainBpsDataResponseBody body;

    public static DescribeScdnDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainBpsDataResponse self = new DescribeScdnDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainBpsDataResponse setBody(DescribeScdnDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
