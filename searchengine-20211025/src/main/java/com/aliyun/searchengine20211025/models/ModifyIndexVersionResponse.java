// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIndexVersionResponseBody body;

    public static ModifyIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexVersionResponse self = new ModifyIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIndexVersionResponse setBody(ModifyIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIndexVersionResponseBody getBody() {
        return this.body;
    }

}
