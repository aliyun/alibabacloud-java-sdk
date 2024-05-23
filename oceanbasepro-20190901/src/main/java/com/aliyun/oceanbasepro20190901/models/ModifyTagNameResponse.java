// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTagNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTagNameResponseBody body;

    public static ModifyTagNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagNameResponse self = new ModifyTagNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTagNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTagNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTagNameResponse setBody(ModifyTagNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTagNameResponseBody getBody() {
        return this.body;
    }

}
