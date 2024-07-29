// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCallbackMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCallbackMetaResponseBody body;

    public static ModifyCallbackMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackMetaResponse self = new ModifyCallbackMetaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCallbackMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCallbackMetaResponse setBody(ModifyCallbackMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCallbackMetaResponseBody getBody() {
        return this.body;
    }

}
