// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAdvanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAdvanceConfigResponseBody body;

    public static ModifyAdvanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvanceConfigResponse self = new ModifyAdvanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAdvanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAdvanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAdvanceConfigResponse setBody(ModifyAdvanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAdvanceConfigResponseBody getBody() {
        return this.body;
    }

}
