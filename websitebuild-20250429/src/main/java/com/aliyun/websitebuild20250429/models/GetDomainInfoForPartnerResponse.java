// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetDomainInfoForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDomainInfoForPartnerResponseBody body;

    public static GetDomainInfoForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainInfoForPartnerResponse self = new GetDomainInfoForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainInfoForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainInfoForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainInfoForPartnerResponse setBody(GetDomainInfoForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainInfoForPartnerResponseBody getBody() {
        return this.body;
    }

}
