// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserTmpIdentityForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserTmpIdentityForPartnerResponseBody body;

    public static GetUserTmpIdentityForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTmpIdentityForPartnerResponse self = new GetUserTmpIdentityForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTmpIdentityForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserTmpIdentityForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserTmpIdentityForPartnerResponse setBody(GetUserTmpIdentityForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserTmpIdentityForPartnerResponseBody getBody() {
        return this.body;
    }

}
