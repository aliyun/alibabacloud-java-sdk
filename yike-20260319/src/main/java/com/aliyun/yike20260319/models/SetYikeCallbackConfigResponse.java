// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SetYikeCallbackConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetYikeCallbackConfigResponseBody body;

    public static SetYikeCallbackConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetYikeCallbackConfigResponse self = new SetYikeCallbackConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetYikeCallbackConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetYikeCallbackConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetYikeCallbackConfigResponse setBody(SetYikeCallbackConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetYikeCallbackConfigResponseBody getBody() {
        return this.body;
    }

}
