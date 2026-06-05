// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSupabaseAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppSupabaseAuthConfigResponseBody body;

    public static UpdateAppSupabaseAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSupabaseAuthConfigResponse self = new UpdateAppSupabaseAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppSupabaseAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppSupabaseAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppSupabaseAuthConfigResponse setBody(UpdateAppSupabaseAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppSupabaseAuthConfigResponseBody getBody() {
        return this.body;
    }

}
