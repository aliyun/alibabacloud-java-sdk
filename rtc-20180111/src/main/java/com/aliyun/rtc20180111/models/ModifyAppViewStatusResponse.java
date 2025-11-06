// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppViewStatusResponseBody body;

    public static ModifyAppViewStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewStatusResponse self = new ModifyAppViewStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppViewStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppViewStatusResponse setBody(ModifyAppViewStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppViewStatusResponseBody getBody() {
        return this.body;
    }

}
