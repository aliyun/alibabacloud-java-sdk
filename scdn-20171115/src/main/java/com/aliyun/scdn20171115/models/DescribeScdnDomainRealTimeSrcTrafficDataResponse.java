// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody body;

    public static DescribeScdnDomainRealTimeSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeSrcTrafficDataResponse self = new DescribeScdnDomainRealTimeSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeSrcTrafficDataResponse setBody(DescribeScdnDomainRealTimeSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
