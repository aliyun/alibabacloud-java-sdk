// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserAccessTokenForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserAccessTokenForPartnerResponseBody body;

    public static GetUserAccessTokenForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAccessTokenForPartnerResponse self = new GetUserAccessTokenForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAccessTokenForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAccessTokenForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserAccessTokenForPartnerResponse setBody(GetUserAccessTokenForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAccessTokenForPartnerResponseBody getBody() {
        return this.body;
    }

}
