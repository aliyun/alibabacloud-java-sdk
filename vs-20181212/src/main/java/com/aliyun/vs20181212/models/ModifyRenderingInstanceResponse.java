// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyRenderingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRenderingInstanceResponseBody body;

    public static ModifyRenderingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRenderingInstanceResponse self = new ModifyRenderingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRenderingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRenderingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRenderingInstanceResponse setBody(ModifyRenderingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRenderingInstanceResponseBody getBody() {
        return this.body;
    }

}
