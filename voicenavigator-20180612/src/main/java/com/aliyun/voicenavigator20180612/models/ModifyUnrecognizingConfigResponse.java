// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUnrecognizingConfigResponseBody body;

    public static ModifyUnrecognizingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUnrecognizingConfigResponse self = new ModifyUnrecognizingConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUnrecognizingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUnrecognizingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUnrecognizingConfigResponse setBody(ModifyUnrecognizingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUnrecognizingConfigResponseBody getBody() {
        return this.body;
    }

}
