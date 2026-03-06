// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppInstanceForPartnerResponseBody body;

    public static GetAppInstanceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceForPartnerResponse self = new GetAppInstanceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceForPartnerResponse setBody(GetAppInstanceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceForPartnerResponseBody getBody() {
        return this.body;
    }

}
