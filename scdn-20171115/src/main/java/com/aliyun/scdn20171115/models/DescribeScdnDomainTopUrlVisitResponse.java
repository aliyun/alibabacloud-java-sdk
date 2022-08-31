// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainTopUrlVisitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainTopUrlVisitResponseBody body;

    public static DescribeScdnDomainTopUrlVisitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainTopUrlVisitResponse self = new DescribeScdnDomainTopUrlVisitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainTopUrlVisitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainTopUrlVisitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainTopUrlVisitResponse setBody(DescribeScdnDomainTopUrlVisitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainTopUrlVisitResponseBody getBody() {
        return this.body;
    }

}
