// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppCallbackStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppCallbackStatusResponseBody body;

    public static ModifyAppCallbackStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppCallbackStatusResponse self = new ModifyAppCallbackStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppCallbackStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppCallbackStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppCallbackStatusResponse setBody(ModifyAppCallbackStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppCallbackStatusResponseBody getBody() {
        return this.body;
    }

}
