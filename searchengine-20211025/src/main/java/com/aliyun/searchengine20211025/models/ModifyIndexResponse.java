// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIndexResponseBody body;

    public static ModifyIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexResponse self = new ModifyIndexResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIndexResponse setBody(ModifyIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIndexResponseBody getBody() {
        return this.body;
    }

}
