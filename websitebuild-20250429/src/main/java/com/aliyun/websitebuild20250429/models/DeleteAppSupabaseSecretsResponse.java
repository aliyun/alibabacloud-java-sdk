// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppSupabaseSecretsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppSupabaseSecretsResponseBody body;

    public static DeleteAppSupabaseSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSupabaseSecretsResponse self = new DeleteAppSupabaseSecretsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppSupabaseSecretsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppSupabaseSecretsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppSupabaseSecretsResponse setBody(DeleteAppSupabaseSecretsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppSupabaseSecretsResponseBody getBody() {
        return this.body;
    }

}
