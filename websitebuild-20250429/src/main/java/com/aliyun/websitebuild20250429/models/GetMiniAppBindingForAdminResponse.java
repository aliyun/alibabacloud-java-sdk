// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetMiniAppBindingForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMiniAppBindingForAdminResponseBody body;

    public static GetMiniAppBindingForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiniAppBindingForAdminResponse self = new GetMiniAppBindingForAdminResponse();
        return TeaModel.build(map, self);
    }

    public GetMiniAppBindingForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiniAppBindingForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMiniAppBindingForAdminResponse setBody(GetMiniAppBindingForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiniAppBindingForAdminResponseBody getBody() {
        return this.body;
    }

}
