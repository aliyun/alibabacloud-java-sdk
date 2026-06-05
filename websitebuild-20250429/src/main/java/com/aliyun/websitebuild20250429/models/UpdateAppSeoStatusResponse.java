// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSeoStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppSeoStatusResponseBody body;

    public static UpdateAppSeoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSeoStatusResponse self = new UpdateAppSeoStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppSeoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppSeoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppSeoStatusResponse setBody(UpdateAppSeoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppSeoStatusResponseBody getBody() {
        return this.body;
    }

}
