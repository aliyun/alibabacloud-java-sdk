// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainHitRateDataResponseBody body;

    public static DescribeScdnDomainHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainHitRateDataResponse self = new DescribeScdnDomainHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainHitRateDataResponse setBody(DescribeScdnDomainHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainHitRateDataResponseBody getBody() {
        return this.body;
    }

}
