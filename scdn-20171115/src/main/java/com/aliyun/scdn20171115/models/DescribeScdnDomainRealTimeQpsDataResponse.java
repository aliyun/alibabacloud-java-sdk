// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeQpsDataResponseBody body;

    public static DescribeScdnDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeQpsDataResponse self = new DescribeScdnDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeQpsDataResponse setBody(DescribeScdnDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
