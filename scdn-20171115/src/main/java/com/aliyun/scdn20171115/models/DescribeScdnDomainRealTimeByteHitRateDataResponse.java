// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeByteHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeByteHitRateDataResponseBody body;

    public static DescribeScdnDomainRealTimeByteHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeByteHitRateDataResponse self = new DescribeScdnDomainRealTimeByteHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeByteHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeByteHitRateDataResponse setBody(DescribeScdnDomainRealTimeByteHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

}
