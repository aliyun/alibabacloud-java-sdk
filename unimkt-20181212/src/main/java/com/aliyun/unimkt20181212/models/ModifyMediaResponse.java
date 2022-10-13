// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMediaResponseBody body;

    public static ModifyMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMediaResponse self = new ModifyMediaResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMediaResponse setBody(ModifyMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMediaResponseBody getBody() {
        return this.body;
    }

}
