// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLoginBaseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLoginBaseConfigResponseBody body;

    public static ModifyLoginBaseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoginBaseConfigResponse self = new ModifyLoginBaseConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLoginBaseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLoginBaseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLoginBaseConfigResponse setBody(ModifyLoginBaseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLoginBaseConfigResponseBody getBody() {
        return this.body;
    }

}
