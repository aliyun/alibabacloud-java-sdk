// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRemoteAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySagRemoteAccessResponseBody body;

    public static ModifySagRemoteAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRemoteAccessResponse self = new ModifySagRemoteAccessResponse();
        return TeaModel.build(map, self);
    }

    public ModifySagRemoteAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySagRemoteAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySagRemoteAccessResponse setBody(ModifySagRemoteAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySagRemoteAccessResponseBody getBody() {
        return this.body;
    }

}
