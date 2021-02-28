// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeTrafficDataResponseBody body;

    public static DescribeScdnDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeTrafficDataResponse self = new DescribeScdnDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeTrafficDataResponse setBody(DescribeScdnDomainRealTimeTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeTrafficDataResponseBody getBody() {
        return this.body;
    }

}
