// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSupabaseAuthConfigResponseBody body;

    public static GetAppSupabaseAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseAuthConfigResponse self = new GetAppSupabaseAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSupabaseAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSupabaseAuthConfigResponse setBody(GetAppSupabaseAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSupabaseAuthConfigResponseBody getBody() {
        return this.body;
    }

}
