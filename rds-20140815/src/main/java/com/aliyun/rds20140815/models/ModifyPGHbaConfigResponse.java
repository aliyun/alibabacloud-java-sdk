// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyPGHbaConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPGHbaConfigResponseBody body;

    public static ModifyPGHbaConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPGHbaConfigResponse self = new ModifyPGHbaConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPGHbaConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPGHbaConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPGHbaConfigResponse setBody(ModifyPGHbaConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPGHbaConfigResponseBody getBody() {
        return this.body;
    }

}
