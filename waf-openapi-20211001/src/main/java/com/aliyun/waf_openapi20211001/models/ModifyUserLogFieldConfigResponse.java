// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserLogFieldConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserLogFieldConfigResponseBody body;

    public static ModifyUserLogFieldConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLogFieldConfigResponse self = new ModifyUserLogFieldConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserLogFieldConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserLogFieldConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserLogFieldConfigResponse setBody(ModifyUserLogFieldConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserLogFieldConfigResponseBody getBody() {
        return this.body;
    }

}
