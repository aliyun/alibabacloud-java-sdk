// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainOriginTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainOriginTrafficDataResponseBody body;

    public static DescribeScdnDomainOriginTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainOriginTrafficDataResponse self = new DescribeScdnDomainOriginTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainOriginTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainOriginTrafficDataResponse setBody(DescribeScdnDomainOriginTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainOriginTrafficDataResponseBody getBody() {
        return this.body;
    }

}
