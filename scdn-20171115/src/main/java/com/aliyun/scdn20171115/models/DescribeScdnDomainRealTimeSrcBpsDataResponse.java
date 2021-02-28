// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeSrcBpsDataResponseBody body;

    public static DescribeScdnDomainRealTimeSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeSrcBpsDataResponse self = new DescribeScdnDomainRealTimeSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeSrcBpsDataResponse setBody(DescribeScdnDomainRealTimeSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
