// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppAndBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppAndBindingResponseBody body;

    public static UpdateMmAppAndBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppAndBindingResponse self = new UpdateMmAppAndBindingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppAndBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppAndBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppAndBindingResponse setBody(UpdateMmAppAndBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppAndBindingResponseBody getBody() {
        return this.body;
    }

}
