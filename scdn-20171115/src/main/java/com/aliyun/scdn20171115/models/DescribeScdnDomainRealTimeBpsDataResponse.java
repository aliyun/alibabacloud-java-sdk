// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRealTimeBpsDataResponseBody body;

    public static DescribeScdnDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRealTimeBpsDataResponse self = new DescribeScdnDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRealTimeBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainRealTimeBpsDataResponse setBody(DescribeScdnDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
