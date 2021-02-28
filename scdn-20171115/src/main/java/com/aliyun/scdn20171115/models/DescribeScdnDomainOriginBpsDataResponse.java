// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainOriginBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainOriginBpsDataResponseBody body;

    public static DescribeScdnDomainOriginBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainOriginBpsDataResponse self = new DescribeScdnDomainOriginBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainOriginBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainOriginBpsDataResponse setBody(DescribeScdnDomainOriginBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainOriginBpsDataResponseBody getBody() {
        return this.body;
    }

}
