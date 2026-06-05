// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveAppSupabaseSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAppSupabaseSecretsResponseBody body;

    public static SaveAppSupabaseSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAppSupabaseSecretsResponse self = new SaveAppSupabaseSecretsResponse();
        return TeaModel.build(map, self);
    }

    public SaveAppSupabaseSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAppSupabaseSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAppSupabaseSecretsResponse setBody(SaveAppSupabaseSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAppSupabaseSecretsResponseBody getBody() {
        return this.body;
    }

}
