// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSupabaseSecretsResponseBody body;

    public static GetAppSupabaseSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseSecretsResponse self = new GetAppSupabaseSecretsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSupabaseSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSupabaseSecretsResponse setBody(GetAppSupabaseSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSupabaseSecretsResponseBody getBody() {
        return this.body;
    }

}
