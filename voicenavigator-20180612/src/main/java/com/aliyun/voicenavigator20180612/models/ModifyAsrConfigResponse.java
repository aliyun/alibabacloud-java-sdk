// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyAsrConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAsrConfigResponseBody body;

    public static ModifyAsrConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAsrConfigResponse self = new ModifyAsrConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAsrConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAsrConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAsrConfigResponse setBody(ModifyAsrConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAsrConfigResponseBody getBody() {
        return this.body;
    }

}
