// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppResponseBody body;

    public static ModifyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponse self = new ModifyAppResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppResponse setBody(ModifyAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppResponseBody getBody() {
        return this.body;
    }

}
