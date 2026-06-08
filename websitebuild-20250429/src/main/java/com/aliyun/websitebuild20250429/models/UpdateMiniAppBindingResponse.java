// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateMiniAppBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMiniAppBindingResponseBody body;

    public static UpdateMiniAppBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMiniAppBindingResponse self = new UpdateMiniAppBindingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMiniAppBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMiniAppBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMiniAppBindingResponse setBody(UpdateMiniAppBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMiniAppBindingResponseBody getBody() {
        return this.body;
    }

}
