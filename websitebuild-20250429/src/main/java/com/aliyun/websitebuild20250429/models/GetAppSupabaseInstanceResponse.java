// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSupabaseInstanceResponseBody body;

    public static GetAppSupabaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseInstanceResponse self = new GetAppSupabaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSupabaseInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSupabaseInstanceResponse setBody(GetAppSupabaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSupabaseInstanceResponseBody getBody() {
        return this.body;
    }

}
