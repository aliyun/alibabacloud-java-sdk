// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeReqHitRateDataResponseBody body;

    public static DescribeScdnDomainRealTimeReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeReqHitRateDataResponse self = new DescribeScdnDomainRealTimeReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeReqHitRateDataResponse setBody(DescribeScdnDomainRealTimeReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
