// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTopReferVisitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainTopReferVisitResponseBody body;

    public static DescribeScdnDomainTopReferVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTopReferVisitResponse self = new DescribeScdnDomainTopReferVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTopReferVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainTopReferVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainTopReferVisitResponse setBody(DescribeScdnDomainTopReferVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainTopReferVisitResponseBody getBody() {
        return this.body;
    }

}
