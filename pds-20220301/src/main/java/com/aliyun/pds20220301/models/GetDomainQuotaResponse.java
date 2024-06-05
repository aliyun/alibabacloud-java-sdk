// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDomainQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDomainQuotaResponseBody body;

    public static GetDomainQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainQuotaResponse self = new GetDomainQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainQuotaResponse setBody(GetDomainQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainQuotaResponseBody getBody() {
        return this.body;
    }

}
