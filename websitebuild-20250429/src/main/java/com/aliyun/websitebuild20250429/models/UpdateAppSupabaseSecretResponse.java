// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSupabaseSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppSupabaseSecretResponseBody body;

    public static UpdateAppSupabaseSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSupabaseSecretResponse self = new UpdateAppSupabaseSecretResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppSupabaseSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppSupabaseSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppSupabaseSecretResponse setBody(UpdateAppSupabaseSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppSupabaseSecretResponseBody getBody() {
        return this.body;
    }

}
