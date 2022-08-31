// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainDetailResponseBody body;

    public static DescribeScdnDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainDetailResponse self = new DescribeScdnDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDomainDetailResponse setBody(DescribeScdnDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainDetailResponseBody getBody() {
        return this.body;
    }

}
